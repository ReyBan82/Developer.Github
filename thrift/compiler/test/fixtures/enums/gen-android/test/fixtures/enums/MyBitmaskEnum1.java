/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.enums;


import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum MyBitmaskEnum1 implements com.facebook.thrift.TEnum {
  ONE(1),
  TWO(2),
  FOUR(4),
  Unspecified(0);

  private final int value;

  private MyBitmaskEnum1(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MyBitmaskEnum1 findByValue(int value) { 
    switch (value) {
      case 1:
        return ONE;
      case 2:
        return TWO;
      case 4:
        return FOUR;
      case 0:
        return Unspecified;
      default:
        return null;
    }
  }
}
