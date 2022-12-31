#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from __future__ import absolute_import
import sys
from thrift.util.Recursive import fix_spec
from thrift.Thrift import TType, TMessageType, TPriority, TRequestContext, TProcessorEventHandler, TServerInterface, TProcessor, TException, TApplicationException, UnimplementedTypedef
from thrift.protocol.TProtocol import TProtocolException



import pprint
import warnings
from thrift import Thrift
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
from thrift.protocol import TCompactProtocol
from thrift.protocol import THeaderProtocol
fastproto = None
try:
  from thrift.protocol import fastproto
except ImportError:
  pass
all_structs = []
UTF8STRINGS = bool(0) or sys.version_info.major >= 3

__all__ = ['UTF8STRINGS', 'Foo', 'NegativeId']

class Foo:
  """
  Attributes:
   - mymap
   - myset
  """

  thrift_spec = None
  thrift_field_annotations = None
  thrift_struct_annotations = None
  __init__ = None
  @staticmethod
  def isUnion():
    return False

  def read(self, iprot):
    if (isinstance(iprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0)
      return
    if (isinstance(iprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2)
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.MAP:
          self.mymap = {}
          (_ktype1, _vtype2, _size0 ) = iprot.readMapBegin() 
          if _size0 >= 0:
            for _i4 in range(_size0):
              _key5 = iprot.readString().decode('utf-8') if UTF8STRINGS else iprot.readString()
              _val6 = iprot.readString().decode('utf-8') if UTF8STRINGS else iprot.readString()
              self.mymap[_key5] = _val6
          else: 
            while iprot.peekMap():
              _key7 = iprot.readString().decode('utf-8') if UTF8STRINGS else iprot.readString()
              _val8 = iprot.readString().decode('utf-8') if UTF8STRINGS else iprot.readString()
              self.mymap[_key7] = _val8
          iprot.readMapEnd()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.SET:
          self.myset = set()
          (_etype12, _size9) = iprot.readSetBegin()
          if _size9 >= 0:
            for _i13 in range(_size9):
              _elem14 = iprot.readString().decode('utf-8') if UTF8STRINGS else iprot.readString()
              self.myset.add(_elem14)
          else: 
            while iprot.peekSet():
              _elem15 = iprot.readString().decode('utf-8') if UTF8STRINGS else iprot.readString()
              self.myset.add(_elem15)
          iprot.readSetEnd()
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if (isinstance(oprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0))
      return
    if (isinstance(oprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2))
      return
    oprot.writeStructBegin('Foo')
    if self.mymap != None:
      oprot.writeFieldBegin('mymap', TType.MAP, 1)
      oprot.writeMapBegin(TType.STRING, TType.STRING, len(self.mymap))
      sorted18 = self.mymap.items()
      sorted18 = sorted(sorted18, key=lambda tuple19: tuple19[0])
      for kiter16,viter17 in sorted18:
        oprot.writeString(kiter16.encode('utf-8')) if UTF8STRINGS and not isinstance(kiter16, bytes) else oprot.writeString(kiter16)
        oprot.writeString(viter17.encode('utf-8')) if UTF8STRINGS and not isinstance(viter17, bytes) else oprot.writeString(viter17)
      oprot.writeMapEnd()
      oprot.writeFieldEnd()
    if self.myset != None:
      oprot.writeFieldBegin('myset', TType.SET, 2)
      oprot.writeSetBegin(TType.STRING, len(self.myset))
      for iter20 in sorted(self.myset):
        oprot.writeString(iter20.encode('utf-8')) if UTF8STRINGS and not isinstance(iter20, bytes) else oprot.writeString(iter20)
      oprot.writeSetEnd()
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def __repr__(self):
    L = []
    padding = ' ' * 4
    if self.mymap is not None:
      value = pprint.pformat(self.mymap, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    mymap=%s' % (value))
    if self.myset is not None:
      value = pprint.pformat(self.myset, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    myset=%s' % (value))
    return "%s(%s)" % (self.__class__.__name__, "\n" + ",\n".join(L) if L else '')

  def __eq__(self, other):
    if not isinstance(other, self.__class__):
      return False

    return self.__dict__ == other.__dict__ 

  def __ne__(self, other):
    return not (self == other)

  def __dir__(self):
    return (
      'mymap',
      'myset',
    )

  # Override the __hash__ function for Python3 - t10434117
  __hash__ = object.__hash__

  def _to_python(self):
    import importlib
    import thrift.python.converter
    python_types = importlib.import_module("module.thrift_types")
    return thrift.python.converter.to_python_struct(python_types.Foo, self)

  def _to_py3(self):
    import importlib
    import thrift.py3.converter
    py3_types = importlib.import_module("module.types")
    return thrift.py3.converter.to_py3_struct(py3_types.Foo, self)

  def _to_py_deprecated(self):
    return self

class NegativeId:
  """
  Attributes:
   - field1
   - field2
   - field3
  """

  thrift_spec = None
  thrift_field_annotations = None
  thrift_struct_annotations = None
  __init__ = None
  @staticmethod
  def isUnion():
    return False

  def read(self, iprot):
    if (isinstance(iprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0)
      return
    if (isinstance(iprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2)
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == -1:
        if ftype == TType.I32:
          self.field1 = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == -2:
        if ftype == TType.I32:
          self.field2 = iprot.readI32()
        else:
          iprot.skip(ftype)
      elif fid == 1:
        if ftype == TType.I32:
          self.field3 = iprot.readI32()
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if (isinstance(oprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0))
      return
    if (isinstance(oprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2))
      return
    oprot.writeStructBegin('NegativeId')
    if self.field2 != None:
      oprot.writeFieldBegin('field2', TType.I32, -2)
      oprot.writeI32(self.field2)
      oprot.writeFieldEnd()
    if self.field1 != None:
      oprot.writeFieldBegin('field1', TType.I32, -1)
      oprot.writeI32(self.field1)
      oprot.writeFieldEnd()
    if self.field3 != None:
      oprot.writeFieldBegin('field3', TType.I32, 1)
      oprot.writeI32(self.field3)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def __repr__(self):
    L = []
    padding = ' ' * 4
    if self.field1 is not None:
      value = pprint.pformat(self.field1, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    field1=%s' % (value))
    if self.field2 is not None:
      value = pprint.pformat(self.field2, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    field2=%s' % (value))
    if self.field3 is not None:
      value = pprint.pformat(self.field3, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    field3=%s' % (value))
    return "%s(%s)" % (self.__class__.__name__, "\n" + ",\n".join(L) if L else '')

  def __eq__(self, other):
    if not isinstance(other, self.__class__):
      return False

    return self.__dict__ == other.__dict__ 

  def __ne__(self, other):
    return not (self == other)

  def __dir__(self):
    return (
      'field2',
      'field1',
      'field3',
    )

  # Override the __hash__ function for Python3 - t10434117
  __hash__ = object.__hash__

  def _to_python(self):
    import importlib
    import thrift.python.converter
    python_types = importlib.import_module("module.thrift_types")
    return thrift.python.converter.to_python_struct(python_types.NegativeId, self)

  def _to_py3(self):
    import importlib
    import thrift.py3.converter
    py3_types = importlib.import_module("module.types")
    return thrift.py3.converter.to_py3_struct(py3_types.NegativeId, self)

  def _to_py_deprecated(self):
    return self

all_structs.append(Foo)
Foo.thrift_spec = (
  None, # 0
  (1, TType.MAP, 'mymap', (TType.STRING,True,TType.STRING,True), None, 2, ), # 1
  (2, TType.SET, 'myset', (TType.STRING,True), None, 2, ), # 2
)

Foo.thrift_struct_annotations = {
}
Foo.thrift_field_annotations = {
}

def Foo__init__(self, mymap=None, myset=None,):
  self.mymap = mymap
  self.myset = myset

Foo.__init__ = Foo__init__

def Foo__setstate__(self, state):
  state.setdefault('mymap', None)
  state.setdefault('myset', None)
  self.__dict__ = state

Foo.__getstate__ = lambda self: self.__dict__.copy()
Foo.__setstate__ = Foo__setstate__

all_structs.append(NegativeId)
NegativeId.thrift_spec = (
  (-2, TType.I32, 'field2', None, 2, 2, ), # -2
  (-1, TType.I32, 'field1', None, 1, 2, ), # -1
  None, # 0
  (1, TType.I32, 'field3', None, 3, 2, ), # 1
)

NegativeId.thrift_struct_annotations = {
}
NegativeId.thrift_field_annotations = {
}

def NegativeId__init__(self, field1=NegativeId.thrift_spec[1][4], field2=NegativeId.thrift_spec[0][4], field3=NegativeId.thrift_spec[3][4],):
  self.field1 = field1
  self.field2 = field2
  self.field3 = field3

NegativeId.__init__ = NegativeId__init__

def NegativeId__setstate__(self, state):
  state.setdefault('field1', 1)
  state.setdefault('field2', 2)
  state.setdefault('field3', 3)
  self.__dict__ = state

NegativeId.__getstate__ = lambda self: self.__dict__.copy()
NegativeId.__setstate__ = NegativeId__setstate__

fix_spec(all_structs)
del all_structs
