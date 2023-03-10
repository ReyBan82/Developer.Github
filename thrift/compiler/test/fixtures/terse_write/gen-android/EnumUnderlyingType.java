/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum EnumUnderlyingType implements com.facebook.thrift.TEnum {
  /**
   * ::std::int8_t
   */
  I8(0),
  /**
   * ::std::uint8_t
   */
  U8(1),
  /**
   * ::std::int16_t
   */
  I16(2),
  /**
   * ::std::uint16_t
   */
  U16(3),
  /**
   * ::std::uint32_t
   */
  U32(4);

  private final int value;

  private EnumUnderlyingType(int value) {
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
  public static EnumUnderlyingType findByValue(int value) { 
    switch (value) {
      case 0:
        return I8;
      case 1:
        return U8;
      case 2:
        return I16;
      case 3:
        return U16;
      case 4:
        return U32;
      default:
        return null;
    }
  }
}
