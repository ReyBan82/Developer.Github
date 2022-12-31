<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift enum:-
 * EmptyEnum
 */
enum EmptyEnum: int {
}

class EmptyEnum_TEnumStaticMetadata implements \IThriftEnumStaticMetadata {
  public static function getEnumMetadata()[]: \tmeta_ThriftEnum {
    return tmeta_ThriftEnum::fromShape(
      shape(
        "name" => "module.EmptyEnum",
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
 * Original thrift enum:-
 * City
 */
enum City: int {
  NYC = 0;
  MPK = 1;
  SEA = 2;
  LON = 3;
}

class City_TEnumStaticMetadata implements \IThriftEnumStaticMetadata {
  public static function getEnumMetadata()[]: \tmeta_ThriftEnum {
    return tmeta_ThriftEnum::fromShape(
      shape(
        "name" => "module.City",
        "elements" => dict[
          0 => "NYC",
          1 => "MPK",
          2 => "SEA",
          3 => "LON",
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
 * Original thrift enum:-
 * Company
 */
enum Company: int {
  FACEBOOK = 0;
  WHATSAPP = 1;
  OCULUS = 2;
  INSTAGRAM = 3;
}

class Company_TEnumStaticMetadata implements \IThriftEnumStaticMetadata {
  public static function getEnumMetadata()[]: \tmeta_ThriftEnum {
    return tmeta_ThriftEnum::fromShape(
      shape(
        "name" => "module.Company",
        "elements" => dict[
          0 => "FACEBOOK",
          1 => "WHATSAPP",
          2 => "OCULUS",
          3 => "INSTAGRAM",
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

type MyCompany = Company;
type MyStringIdentifier = string;
type MyIntIdentifier = int;
type MyMapIdentifier = Map<string, string>;
/**
 * Original thrift struct:-
 * Internship
 */
class Internship implements \IThriftSyncStruct, \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'weeks',
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'title',
      'type' => \TType::STRING,
    ),
    3 => shape(
      'var' => 'employer',
      'type' => \TType::I32,
      'enum' => Company::class,
    ),
    4 => shape(
      'var' => 'compensation',
      'type' => \TType::DOUBLE,
    ),
    5 => shape(
      'var' => 'school',
      'type' => \TType::STRING,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'weeks' => 1,
    'title' => 2,
    'employer' => 3,
    'compensation' => 4,
    'school' => 5,
  ];

  const type TConstructorShape = shape(
    ?'weeks' => ?int,
    ?'title' => ?string,
    ?'employer' => ?Company,
    ?'compensation' => ?float,
    ?'school' => ?string,
  );

  const int STRUCTURAL_ID = 5601694484190969969;
  /**
   * Original thrift field:-
   * 1: i32 weeks
   */
  public int $weeks;
  /**
   * Original thrift field:-
   * 2: string title
   */
  public string $title;
  /**
   * Original thrift field:-
   * 3: enum module.Company employer
   */
  public ?Company $employer;
  /**
   * Original thrift field:-
   * 4: double compensation
   */
  public ?float $compensation;
  /**
   * Original thrift field:-
   * 5: string school
   */
  public ?string $school;

  public function __construct(?int $weeks = null, ?string $title = null, ?Company $employer = null, ?float $compensation = null, ?string $school = null)[] {
    $this->weeks = $weeks ?? 0;
    $this->title = $title ?? '';
    $this->employer = $employer;
    $this->compensation = $compensation;
    $this->school = $school;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'weeks'),
      Shapes::idx($shape, 'title'),
      Shapes::idx($shape, 'employer'),
      Shapes::idx($shape, 'compensation'),
      Shapes::idx($shape, 'school'),
    );
  }

  public function getName()[]: string {
    return 'Internship';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.Internship",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "weeks",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                )
              ),
              "name" => "title",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 3,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_enum" => tmeta_ThriftEnumType::fromShape(
                    shape(
                      "name" => "module.Company",
                    )
                  ),
                )
              ),
              "name" => "employer",
              "is_optional" => true,
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 4,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_DOUBLE_TYPE,
                )
              ),
              "name" => "compensation",
              "is_optional" => true,
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 5,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                )
              ),
              "name" => "school",
              "is_optional" => true,
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

/**
 * Original thrift struct:-
 * Range
 */
class Range implements \IThriftSyncStruct, \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'min',
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'max',
      'type' => \TType::I32,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'min' => 1,
    'max' => 2,
  ];

  const type TConstructorShape = shape(
    ?'min' => ?int,
    ?'max' => ?int,
  );

  const int STRUCTURAL_ID = 6850388386457434767;
  /**
   * Original thrift field:-
   * 1: i32 min
   */
  public int $min;
  /**
   * Original thrift field:-
   * 2: i32 max
   */
  public int $max;

  public function __construct(?int $min = null, ?int $max = null)[] {
    $this->min = $min ?? 0;
    $this->max = $max ?? 0;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'min'),
      Shapes::idx($shape, 'max'),
    );
  }

  public function getName()[]: string {
    return 'Range';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.Range",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "min",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "max",
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

/**
 * Original thrift struct:-
 * struct1
 */
class struct1 implements \IThriftSyncStruct, \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'a',
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'b',
      'type' => \TType::STRING,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'a' => 1,
    'b' => 2,
  ];

  const type TConstructorShape = shape(
    ?'a' => ?int,
    ?'b' => ?string,
  );

  const int STRUCTURAL_ID = 7783381726179123112;
  /**
   * Original thrift field:-
   * 1: i32 a
   */
  public int $a;
  /**
   * Original thrift field:-
   * 2: string b
   */
  public string $b;

  public function __construct(?int $a = null, ?string $b = null)[] {
    $this->a = $a ?? 1234567;
    $this->b = $b ?? "<uninitialized>";
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'a'),
      Shapes::idx($shape, 'b'),
    );
  }

  public function getName()[]: string {
    return 'struct1';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.struct1",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "a",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                )
              ),
              "name" => "b",
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

/**
 * Original thrift struct:-
 * struct2
 */
class struct2 implements \IThriftSyncStruct, \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'a',
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'b',
      'type' => \TType::STRING,
    ),
    3 => shape(
      'var' => 'c',
      'type' => \TType::STRUCT,
      'class' => struct1::class,
    ),
    4 => shape(
      'var' => 'd',
      'type' => \TType::LST,
      'etype' => \TType::I32,
      'elem' => shape(
        'type' => \TType::I32,
      ),
      'format' => 'collection',
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'a' => 1,
    'b' => 2,
    'c' => 3,
    'd' => 4,
  ];

  const type TConstructorShape = shape(
    ?'a' => ?int,
    ?'b' => ?string,
    ?'c' => ?struct1,
    ?'d' => ?Vector<int>,
  );

  const int STRUCTURAL_ID = 6352184485829261382;
  /**
   * Original thrift field:-
   * 1: i32 a
   */
  public int $a;
  /**
   * Original thrift field:-
   * 2: string b
   */
  public string $b;
  /**
   * Original thrift field:-
   * 3: struct module.struct1 c
   */
  public ?struct1 $c;
  /**
   * Original thrift field:-
   * 4: list<i32> d
   */
  public Vector<int> $d;

  public function __construct(?int $a = null, ?string $b = null, ?struct1 $c = null, ?Vector<int> $d = null)[] {
    $this->a = $a ?? 0;
    $this->b = $b ?? '';
    $this->c = $c;
    $this->d = $d ?? Vector {};
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'a'),
      Shapes::idx($shape, 'b'),
      Shapes::idx($shape, 'c'),
      Shapes::idx($shape, 'd'),
    );
  }

  public function getName()[]: string {
    return 'struct2';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.struct2",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "a",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                )
              ),
              "name" => "b",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 3,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_struct" => tmeta_ThriftStructType::fromShape(
                    shape(
                      "name" => "module.struct1",
                    )
                  ),
                )
              ),
              "name" => "c",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 4,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_list" => tmeta_ThriftListType::fromShape(
                    shape(
                      "valueType" => tmeta_ThriftType::fromShape(
                        shape(
                          "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                        )
                      ),
                    )
                  ),
                )
              ),
              "name" => "d",
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

/**
 * Original thrift struct:-
 * struct3
 */
class struct3 implements \IThriftSyncStruct, \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'a',
      'type' => \TType::STRING,
    ),
    2 => shape(
      'var' => 'b',
      'type' => \TType::I32,
    ),
    3 => shape(
      'var' => 'c',
      'type' => \TType::STRUCT,
      'class' => struct2::class,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'a' => 1,
    'b' => 2,
    'c' => 3,
  ];

  const type TConstructorShape = shape(
    ?'a' => ?string,
    ?'b' => ?int,
    ?'c' => ?struct2,
  );

  const int STRUCTURAL_ID = 8770775784736740409;
  /**
   * Original thrift field:-
   * 1: string a
   */
  public string $a;
  /**
   * Original thrift field:-
   * 2: i32 b
   */
  public int $b;
  /**
   * Original thrift field:-
   * 3: struct module.struct2 c
   */
  public ?struct2 $c;

  public function __construct(?string $a = null, ?int $b = null, ?struct2 $c = null)[] {
    $this->a = $a ?? '';
    $this->b = $b ?? 0;
    $this->c = $c;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'a'),
      Shapes::idx($shape, 'b'),
      Shapes::idx($shape, 'c'),
    );
  }

  public function getName()[]: string {
    return 'struct3';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.struct3",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                )
              ),
              "name" => "a",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "b",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 3,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_struct" => tmeta_ThriftStructType::fromShape(
                    shape(
                      "name" => "module.struct2",
                    )
                  ),
                )
              ),
              "name" => "c",
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

/**
 * Original thrift struct:-
 * struct4
 */
class struct4 implements \IThriftSyncStruct, \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'a',
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'b',
      'type' => \TType::DOUBLE,
    ),
    3 => shape(
      'var' => 'c',
      'type' => \TType::BYTE,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'a' => 1,
    'b' => 2,
    'c' => 3,
  ];

  const type TConstructorShape = shape(
    ?'a' => ?int,
    ?'b' => ?float,
    ?'c' => ?int,
  );

  const int STRUCTURAL_ID = 3152965649269433242;
  /**
   * Original thrift field:-
   * 1: i32 a
   */
  public int $a;
  /**
   * Original thrift field:-
   * 2: double b
   */
  public ?float $b;
  /**
   * Original thrift field:-
   * 3: byte c
   */
  public ?int $c;

  public function __construct(?int $a = null, ?float $b = null, ?int $c = null)[] {
    $this->a = $a ?? 0;
    $this->b = $b;
    $this->c = $c;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'a'),
      Shapes::idx($shape, 'b'),
      Shapes::idx($shape, 'c'),
    );
  }

  public function getName()[]: string {
    return 'struct4';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.struct4",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "a",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_DOUBLE_TYPE,
                )
              ),
              "name" => "b",
              "is_optional" => true,
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 3,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_BYTE_TYPE,
                )
              ),
              "name" => "c",
              "is_optional" => true,
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

enum union1Enum: int {
  _EMPTY_ = 0;
  i = 1;
  d = 2;
}

/**
 * Original thrift struct:-
 * union1
 */
class union1 implements \IThriftSyncStruct, \IThriftStructMetadata, \IThriftUnion<union1Enum> {
  use \ThriftUnionSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'i',
      'union' => true,
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'd',
      'union' => true,
      'type' => \TType::DOUBLE,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'i' => 1,
    'd' => 2,
  ];

  const type TConstructorShape = shape(
    ?'i' => ?int,
    ?'d' => ?float,
  );

  const int STRUCTURAL_ID = 3529312341790331108;
  /**
   * Original thrift field:-
   * 1: i32 i
   */
  public ?int $i;
  /**
   * Original thrift field:-
   * 2: double d
   */
  public ?float $d;
  protected union1Enum $_type = union1Enum::_EMPTY_;

  public function __construct(?int $i = null, ?float $d = null)[] {
    $this->_type = union1Enum::_EMPTY_;
    if ($i !== null) {
      $this->i = $i;
      $this->_type = union1Enum::i;
    }
    if ($d !== null) {
      $this->d = $d;
      $this->_type = union1Enum::d;
    }
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'i'),
      Shapes::idx($shape, 'd'),
    );
  }

  public function getName()[]: string {
    return 'union1';
  }

  public function getType()[]: union1Enum {
    return $this->_type;
  }

  public function reset()[write_props]: void {
    switch ($this->_type) {
      case union1Enum::i:
        $this->i = null;
        break;
      case union1Enum::d:
        $this->d = null;
        break;
      case union1Enum::_EMPTY_:
        break;
    }
    $this->_type = union1Enum::_EMPTY_;
  }

  public function set_i(int $i)[write_props]: this {
    $this->reset();
    $this->_type = union1Enum::i;
    $this->i = $i;
    return $this;
  }

  public function get_i()[]: ?int {
    return $this->i;
  }

  public function getx_i()[]: int {
    invariant(
      $this->_type === union1Enum::i,
      'get_i called on an instance of union1 whose current type is %s',
      (string)$this->_type,
    );
    return $this->i as nonnull;
  }

  public function set_d(float $d)[write_props]: this {
    $this->reset();
    $this->_type = union1Enum::d;
    $this->d = $d;
    return $this;
  }

  public function get_d()[]: ?float {
    return $this->d;
  }

  public function getx_d()[]: float {
    invariant(
      $this->_type === union1Enum::d,
      'get_d called on an instance of union1 whose current type is %s',
      (string)$this->_type,
    );
    return $this->d as nonnull;
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.union1",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "i",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_DOUBLE_TYPE,
                )
              ),
              "name" => "d",
            )
          ),
        ],
        "is_union" => true,
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

enum union2Enum: int {
  _EMPTY_ = 0;
  i = 1;
  d = 2;
  s = 3;
  u = 4;
}

/**
 * Original thrift struct:-
 * union2
 */
class union2 implements \IThriftSyncStruct, \IThriftStructMetadata, \IThriftUnion<union2Enum> {
  use \ThriftUnionSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'i',
      'union' => true,
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'd',
      'union' => true,
      'type' => \TType::DOUBLE,
    ),
    3 => shape(
      'var' => 's',
      'union' => true,
      'type' => \TType::STRUCT,
      'class' => struct1::class,
    ),
    4 => shape(
      'var' => 'u',
      'union' => true,
      'type' => \TType::STRUCT,
      'class' => union1::class,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'i' => 1,
    'd' => 2,
    's' => 3,
    'u' => 4,
  ];

  const type TConstructorShape = shape(
    ?'i' => ?int,
    ?'d' => ?float,
    ?'s' => ?struct1,
    ?'u' => ?union1,
  );

  const int STRUCTURAL_ID = 1639711719709684790;
  /**
   * Original thrift field:-
   * 1: i32 i
   */
  public ?int $i;
  /**
   * Original thrift field:-
   * 2: double d
   */
  public ?float $d;
  /**
   * Original thrift field:-
   * 3: struct module.struct1 s
   */
  public ?struct1 $s;
  /**
   * Original thrift field:-
   * 4: struct module.union1 u
   */
  public ?union1 $u;
  protected union2Enum $_type = union2Enum::_EMPTY_;

  public function __construct(?int $i = null, ?float $d = null, ?struct1 $s = null, ?union1 $u = null)[] {
    $this->_type = union2Enum::_EMPTY_;
    if ($i !== null) {
      $this->i = $i;
      $this->_type = union2Enum::i;
    }
    if ($d !== null) {
      $this->d = $d;
      $this->_type = union2Enum::d;
    }
    if ($s !== null) {
      $this->s = $s;
      $this->_type = union2Enum::s;
    }
    if ($u !== null) {
      $this->u = $u;
      $this->_type = union2Enum::u;
    }
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'i'),
      Shapes::idx($shape, 'd'),
      Shapes::idx($shape, 's'),
      Shapes::idx($shape, 'u'),
    );
  }

  public function getName()[]: string {
    return 'union2';
  }

  public function getType()[]: union2Enum {
    return $this->_type;
  }

  public function reset()[write_props]: void {
    switch ($this->_type) {
      case union2Enum::i:
        $this->i = null;
        break;
      case union2Enum::d:
        $this->d = null;
        break;
      case union2Enum::s:
        $this->s = null;
        break;
      case union2Enum::u:
        $this->u = null;
        break;
      case union2Enum::_EMPTY_:
        break;
    }
    $this->_type = union2Enum::_EMPTY_;
  }

  public function set_i(int $i)[write_props]: this {
    $this->reset();
    $this->_type = union2Enum::i;
    $this->i = $i;
    return $this;
  }

  public function get_i()[]: ?int {
    return $this->i;
  }

  public function getx_i()[]: int {
    invariant(
      $this->_type === union2Enum::i,
      'get_i called on an instance of union2 whose current type is %s',
      (string)$this->_type,
    );
    return $this->i as nonnull;
  }

  public function set_d(float $d)[write_props]: this {
    $this->reset();
    $this->_type = union2Enum::d;
    $this->d = $d;
    return $this;
  }

  public function get_d()[]: ?float {
    return $this->d;
  }

  public function getx_d()[]: float {
    invariant(
      $this->_type === union2Enum::d,
      'get_d called on an instance of union2 whose current type is %s',
      (string)$this->_type,
    );
    return $this->d as nonnull;
  }

  public function set_s(struct1 $s)[write_props]: this {
    $this->reset();
    $this->_type = union2Enum::s;
    $this->s = $s;
    return $this;
  }

  public function get_s()[]: ?struct1 {
    return $this->s;
  }

  public function getx_s()[]: struct1 {
    invariant(
      $this->_type === union2Enum::s,
      'get_s called on an instance of union2 whose current type is %s',
      (string)$this->_type,
    );
    return $this->s as nonnull;
  }

  public function set_u(union1 $u)[write_props]: this {
    $this->reset();
    $this->_type = union2Enum::u;
    $this->u = $u;
    return $this;
  }

  public function get_u()[]: ?union1 {
    return $this->u;
  }

  public function getx_u()[]: union1 {
    invariant(
      $this->_type === union2Enum::u,
      'get_u called on an instance of union2 whose current type is %s',
      (string)$this->_type,
    );
    return $this->u as nonnull;
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.union2",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "i",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_DOUBLE_TYPE,
                )
              ),
              "name" => "d",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 3,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_struct" => tmeta_ThriftStructType::fromShape(
                    shape(
                      "name" => "module.struct1",
                    )
                  ),
                )
              ),
              "name" => "s",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 4,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_struct" => tmeta_ThriftStructType::fromShape(
                    shape(
                      "name" => "module.union1",
                    )
                  ),
                )
              ),
              "name" => "u",
            )
          ),
        ],
        "is_union" => true,
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

