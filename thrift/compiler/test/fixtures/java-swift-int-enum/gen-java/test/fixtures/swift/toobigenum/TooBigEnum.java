/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.swift.toobigenum;

import com.facebook.swift.codec.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

@SwiftGenerated
public class TooBigEnum extends IntEnum implements com.facebook.thrift.enums.BaseEnum, com.facebook.thrift.payload.ThriftSerializable {

    private final int value;

    TooBigEnum(int value) {
        this.value = value;
    }

    @java.lang.Override
    @ThriftEnumValue
    public int getValue() {
        return value;
    }

    @ThriftIntEnumResolver
    public static TooBigEnum fromInteger(int n) {
        return new TooBigEnum(n);
    }

    public static com.facebook.thrift.payload.Reader<TooBigEnum> asReader() {
        return TooBigEnum::read0;
    }

    public static TooBigEnum read0(TProtocol iprot) throws TException {
        return TooBigEnum.fromInteger(iprot.readI32());
    }

    public void write0(TProtocol oprot) throws TException {
        oprot.writeI32(getValue());
    }


    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TooBigEnum other = (TooBigEnum)o;

        return this.value == other.value;
    }

    @java.lang.Override
    public int hashCode() {
        return value;
    }

}
