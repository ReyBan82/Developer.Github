<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift enum:-
 * MyEnum
 */
enum MyEnum: int as int {
  MyValue1 = 0;
  MyValue2 = 1;
}

class MyEnum_TEnumStaticMetadata implements \IThriftEnumStaticMetadata {
  public static function getEnumMetadata()[]: \tmeta_ThriftEnum {
    return tmeta_ThriftEnum::fromShape(
      shape(
        "name" => "module.MyEnum",
        "elements" => dict[
          0 => "MyValue1",
          1 => "MyValue2",
        ],
      )
    );
  }

  public static function getAllStructuredAnnotations()[write_props]: \TEnumAnnotations {
    return shape(
      'enum' => dict[],
      'constants' => dict[
      ],
    );
  }
}

/**
 * Original thrift exception:-
 * MyException
 */
class MyException extends \TException implements \IThriftSyncStruct, \IThriftExceptionMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'message',
      'type' => \TType::STRING,
    ),
    2 => shape(
      'var' => 'code',
      'type' => \TType::I32,
      'enum' => MyEnum::class,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'message' => 1,
    'code' => 2,
  ];

  const type TConstructorShape = shape(
    ?'message' => ?string,
    ?'code' => ?MyEnum,
  );

  const int STRUCTURAL_ID = 3517193566312570591;
  /**
   * Original thrift field:-
   * 1: string message
   */
  public string $message;
  /**
   * Original thrift field:-
   * 2: enum module.MyEnum code
   */
  public /* Originally defined as MyEnum */ int $code;

  public function setCodeAsEnum(MyEnum $code)[write_props]: void {
    $this->code = $code;
  }

  public function getCodeAsEnum()[]: MyEnum {
    return HH\FIXME\UNSAFE_CAST<int, MyEnum>($this->code, 'retain HHVM enforcement semantics');
  }

  public function __construct(?string $message = null, ?MyEnum $code = null)[] {
    parent::__construct();
    $this->message = $message ?? '';
    $this->code = $code ?? MyEnum::MyValue1;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'message'),
      Shapes::idx($shape, 'code'),
    );
  }

  public function getName()[]: string {
    return 'MyException';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getExceptionMetadata()[]: \tmeta_ThriftException {
    return tmeta_ThriftException::fromShape(
      shape(
        "name" => "module.MyException",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                )
              ),
              "name" => "message",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_enum" => tmeta_ThriftEnumType::fromShape(
                    shape(
                      "name" => "module.MyEnum",
                    )
                  ),
                )
              ),
              "name" => "code",
            )
          ),
        ],
      )
    );
  }

  public static function getAllStructuredAnnotations()[write_props]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

  public function getInstanceKey()[write_props]: string {
    return \TCompactSerializer::serialize($this);
  }

}

