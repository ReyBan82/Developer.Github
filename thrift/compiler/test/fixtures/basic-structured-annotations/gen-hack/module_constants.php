<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

namespace fixtures\basic-structured-annotations;

class module_CONSTANTS implements \IThriftConstants {
  /**
   * Original thrift constant:-
   * map<string, string> MyConst
   */
  <<__Memoize>>
  public static function MyConst()[write_props]: \ConstMap<string, string>{
    return ImmMap {
      "ENUMERATOR" => "enum",
      "CONST" => "const",
    };
  }


  public static function getAllStructuredAnnotations()[write_props]: dict<string, dict<string, \IThriftStruct>> {
    return dict[
      'MyConst' => dict[
        '\fixtures\basic-structured-annotations\structured_annotation_inline' => \fixtures\basic-structured-annotations\structured_annotation_inline::fromShape(
          shape(
            "name" => "MyHackEnum",
          )
        ),
      ],
    ];
  }
}

