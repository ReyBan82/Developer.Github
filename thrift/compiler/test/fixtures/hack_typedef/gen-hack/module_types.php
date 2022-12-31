<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

namespace module_typedef;

type MyI32 = int;
/**
 * Original thrift struct:-
 * Foo
 */
class Foo implements \IThriftSyncStruct, \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'i_field',
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'i_field2',
      'type' => \TType::I32,
    ),
    3 => shape(
      'var' => 'i_field3',
      'type' => \TType::I32,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'i_field' => 1,
    'i_field2' => 2,
    'i_field3' => 3,
  ];

  const type TConstructorShape = shape(
    ?'i_field' => ?\include_typedef\MyI32,
    ?'i_field2' => ?\module_typedef\MyI32,
    ?'i_field3' => ?int,
  );

  const int STRUCTURAL_ID = 4166182619516796800;
  /**
   * Original thrift field:-
   * 1: i32 i_field
   */
  public \include_typedef\MyI32 $i_field;
  /**
   * Original thrift field:-
   * 2: i32 i_field2
   */
  public \module_typedef\MyI32 $i_field2;
  /**
   * Original thrift field:-
   * 3: i32 i_field3
   */
  public int $i_field3;

  public function __construct(?\include_typedef\MyI32 $i_field = null, ?\module_typedef\MyI32 $i_field2 = null, ?int $i_field3 = null)[] {
    $this->i_field = $i_field ?? 0;
    $this->i_field2 = $i_field2 ?? 0;
    $this->i_field3 = $i_field3 ?? 0;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'i_field'),
      Shapes::idx($shape, 'i_field2'),
      Shapes::idx($shape, 'i_field3'),
    );
  }

  public function getName()[]: string {
    return 'Foo';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return \tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.Foo",
        "fields" => vec[
          \tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => \tmeta_ThriftType::fromShape(
                shape(
                  "t_typedef" => \tmeta_ThriftTypedefType::fromShape(
                    shape(
                      "name" => "include.MyI32",
                      "underlyingType" => \tmeta_ThriftType::fromShape(
                        shape(
                          "t_primitive" => \tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                        )
                      ),
                    )
                  ),
                )
              ),
              "name" => "i_field",
            )
          ),
          \tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => \tmeta_ThriftType::fromShape(
                shape(
                  "t_typedef" => \tmeta_ThriftTypedefType::fromShape(
                    shape(
                      "name" => "module.MyI32",
                      "underlyingType" => \tmeta_ThriftType::fromShape(
                        shape(
                          "t_primitive" => \tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                        )
                      ),
                    )
                  ),
                )
              ),
              "name" => "i_field2",
            )
          ),
          \tmeta_ThriftField::fromShape(
            shape(
              "id" => 3,
              "type" => \tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => \tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "i_field3",
            )
          ),
        ],
        "is_union" => false,
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

