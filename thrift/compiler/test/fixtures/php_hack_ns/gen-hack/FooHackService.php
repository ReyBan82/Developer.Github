<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift service:-
 * FooHackService
 */
<<\ThriftTypeInfo(shape('uri' => 'test.dev/foo/php/ns/FooHackService'))>>
interface FooHackServiceAsyncIf extends \IThriftAsyncIf {
}

/**
 * Original thrift service:-
 * FooHackService
 */
<<\ThriftTypeInfo(shape('uri' => 'test.dev/foo/php/ns/FooHackService'))>>
interface FooHackServiceIf extends \IThriftSyncIf {
}

/**
 * Original thrift service:-
 * FooHackService
 */
<<\ThriftTypeInfo(shape('uri' => 'test.dev/foo/php/ns/FooHackService'))>>
interface FooHackServiceAsyncClientIf extends FooHackServiceAsyncIf {
}

/**
 * Original thrift service:-
 * FooHackService
 */
<<\ThriftTypeInfo(shape('uri' => 'test.dev/foo/php/ns/FooHackService'))>>
interface FooHackServiceClientIf extends \IThriftSyncIf {
}

/**
 * Original thrift service:-
 * FooHackService
 */
trait FooHackServiceClientBase {
  require extends \ThriftClientBase;

}

class FooHackServiceAsyncClient extends \ThriftClientBase implements FooHackServiceAsyncClientIf {
  use FooHackServiceClientBase;

}

class FooHackServiceClient extends \ThriftClientBase implements FooHackServiceClientIf {
  use FooHackServiceClientBase;

  /* send and recv functions */
}

// HELPER FUNCTIONS AND STRUCTURES

class FooHackServiceStaticMetadata implements \IThriftServiceStaticMetadata {
  public static function getServiceMetadata()[]: \tmeta_ThriftService {
    return tmeta_ThriftService::fromShape(
      shape(
        "name" => "module.FooHackService",
      )
    );
  }

  public static function getServiceMetadataResponse()[]: \tmeta_ThriftServiceMetadataResponse {
    return \tmeta_ThriftServiceMetadataResponse::fromShape(
      shape(
        'context' => \tmeta_ThriftServiceContext::fromShape(
          shape(
            'service_info' => self::getServiceMetadata(),
            'module' => \tmeta_ThriftModuleContext::fromShape(
              shape(
                'name' => 'module',
              )
            ),
          )
        ),
        'metadata' => \tmeta_ThriftMetadata::fromShape(
          shape(
            'enums' => dict[
            ],
            'structs' => dict[
            ],
            'exceptions' => dict[
            ],
            'services' => dict[
            ],
          )
        ),
      )
    );
  }

  public static function getAllStructuredAnnotations()[write_props]: \TServiceAnnotations {
    return shape(
      'service' => dict[],
      'functions' => dict[
      ],
    );
  }
}

