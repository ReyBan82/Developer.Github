#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

cimport cython
from typing import AsyncIterator
from cpython.version cimport PY_VERSION_HEX
from libc.stdint cimport (
    int8_t as cint8_t,
    int16_t as cint16_t,
    int32_t as cint32_t,
    int64_t as cint64_t,
)
from libcpp.memory cimport shared_ptr, make_shared, unique_ptr, make_unique
from libcpp.string cimport string
from libcpp cimport bool as cbool
from cpython cimport bool as pbool
from libcpp.vector cimport vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap
from libcpp.utility cimport move as cmove
from libcpp.pair cimport pair
from cython.operator cimport dereference as deref
from cpython.ref cimport PyObject
from thrift.py3.exceptions cimport (
    cTApplicationException,
    ApplicationError as __ApplicationError,
    cTApplicationExceptionType__UNKNOWN)
from thrift.py3.server cimport ServiceInterface, RequestContext, Cpp2RequestContext
from thrift.py3.server import RequestContext
from folly cimport (
  cFollyPromise,
  cFollyUnit,
  c_unit,
)
from thrift.py3.common cimport (
    cThriftServiceMetadataResponse as __fbthrift_cThriftServiceMetadataResponse,
    ServiceMetadata,
    MetadataBox as __MetadataBox,
)

from thrift.py3.server cimport THRIFT_REQUEST_CONTEXT as __THRIFT_REQUEST_CONTEXT

cimport folly.futures
from folly.executor cimport get_executor
cimport folly.iobuf as _fbthrift_iobuf
import folly.iobuf as _fbthrift_iobuf
from folly.iobuf cimport move as move_iobuf
from folly.memory cimport to_shared_ptr as __to_shared_ptr

from thrift.py3.std_libcpp cimport optional
from thrift.py3.stream cimport cServerStream, cServerStreamPublisher, cResponseAndServerStream, createResponseAndServerStream, createAsyncIteratorFromPyIterator, pythonFuncToCppFunc, ServerStream, ServerPublisher
cimport test.fixtures.interactions.module.types as _test_fixtures_interactions_module_types
import test.fixtures.interactions.module.types as _test_fixtures_interactions_module_types

cimport test.fixtures.interactions.module.services_reflection as _services_reflection

import asyncio
import functools
import sys
import traceback
import types as _py_types

from test.fixtures.interactions.module.services_wrapper cimport cMyServiceInterface
cdef class ServerPublisher_cbool(ServerPublisher):
    cdef unique_ptr[cServerStreamPublisher[cbool]] cPublisher

    def complete(ServerPublisher self):
        cmove(deref(self.cPublisher)).complete()

    # Calling this send instead of the wrapped method name of next because next is
    # a python keyword and makes the linter complain
    def send(ServerPublisher self, pbool item):
        deref(self.cPublisher).next(<cbool?>item)

    @staticmethod
    cdef _fbthrift_create(cServerStreamPublisher[cbool] cPublisher):
        cdef ServerPublisher_cbool inst = ServerPublisher_cbool.__new__(ServerPublisher_cbool)
        inst.cPublisher = make_unique[cServerStreamPublisher[cbool]](cmove(cPublisher))
        return inst

cdef class ServerStream_cbool(ServerStream):
    cdef unique_ptr[cServerStream[cbool]] cStream

    @staticmethod
    cdef _fbthrift_create(cServerStream[cbool] cStream):
        cdef ServerStream_cbool inst = ServerStream_cbool.__new__(ServerStream_cbool)
        inst.cStream = make_unique[cServerStream[cbool]](cmove(cStream))
        return inst
cdef class ServerPublisher_cint32_t(ServerPublisher):
    cdef unique_ptr[cServerStreamPublisher[cint32_t]] cPublisher

    def complete(ServerPublisher self):
        cmove(deref(self.cPublisher)).complete()

    # Calling this send instead of the wrapped method name of next because next is
    # a python keyword and makes the linter complain
    def send(ServerPublisher self, cint32_t item):
        deref(self.cPublisher).next(<cint32_t?>item)

    @staticmethod
    cdef _fbthrift_create(cServerStreamPublisher[cint32_t] cPublisher):
        cdef ServerPublisher_cint32_t inst = ServerPublisher_cint32_t.__new__(ServerPublisher_cint32_t)
        inst.cPublisher = make_unique[cServerStreamPublisher[cint32_t]](cmove(cPublisher))
        return inst

cdef class ServerStream_cint32_t(ServerStream):
    cdef unique_ptr[cServerStream[cint32_t]] cStream

    @staticmethod
    cdef _fbthrift_create(cServerStream[cint32_t] cStream):
        cdef ServerStream_cint32_t inst = ServerStream_cint32_t.__new__(ServerStream_cint32_t)
        inst.cStream = make_unique[cServerStream[cint32_t]](cmove(cStream))
        return inst

async def runGenerator_MyService_serialize(object generator, Promise_cint32_t_Stream promise):
    try:
        item = await generator.asend(None)
    except StopAsyncIteration:
        promise.cPromise.setValue(optional[cint32_t]())
    except __ApplicationError as ex:
        # If the handler raised an ApplicationError convert it to a C++ one
        promise.cPromise.setException(cTApplicationException(
            ex.type.value, ex.message.encode('UTF-8')
        ))
    except Exception as ex:
        print(
            "Unexpected error in serialize:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, repr(ex).encode('UTF-8')
        ))
    except asyncio.CancelledError as ex:
        print("Coroutine was cancelled in service handler serialize:", file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, (f'Application was cancelled on the server with message: {str(ex)}').encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(optional[cint32_t](<cint32_t?>item))

cdef void getNextGenerator_MyService_serialize(object generator, cFollyPromise[optional[cint32_t]] cPromise):
    cdef Promise_cint32_t_Stream __promise = Promise_cint32_t_Stream._fbthrift_create(cmove(cPromise))
    asyncio.get_event_loop().create_task(
        runGenerator_MyService_serialize(
            generator,
            __promise
        )
    )


@cython.auto_pickle(False)
cdef class Promise_cResponseAndServerStream__cint32_t_cint32_t:
    cdef cFollyPromise[cResponseAndServerStream[cint32_t,cint32_t]]* cPromise

    def __cinit__(self):
        self.cPromise = new cFollyPromise[cResponseAndServerStream[cint32_t,cint32_t]](cFollyPromise[cResponseAndServerStream[cint32_t,cint32_t]].makeEmpty())

    def __dealloc__(self):
        del self.cPromise

    @staticmethod
    cdef _fbthrift_create(cFollyPromise[cResponseAndServerStream[cint32_t,cint32_t]] cPromise):
        cdef Promise_cResponseAndServerStream__cint32_t_cint32_t inst = Promise_cResponseAndServerStream__cint32_t_cint32_t.__new__(Promise_cResponseAndServerStream__cint32_t_cint32_t)
        inst.cPromise[0] = cmove(cPromise)
        return inst

@cython.auto_pickle(False)
cdef class Promise_cServerStream__cbool:
    cdef cFollyPromise[cServerStream[cbool]]* cPromise

    def __cinit__(self):
        self.cPromise = new cFollyPromise[cServerStream[cbool]](cFollyPromise[cServerStream[cbool]].makeEmpty())

    def __dealloc__(self):
        del self.cPromise

    @staticmethod
    cdef _fbthrift_create(cFollyPromise[cServerStream[cbool]] cPromise):
        cdef Promise_cServerStream__cbool inst = Promise_cServerStream__cbool.__new__(Promise_cServerStream__cbool)
        inst.cPromise[0] = cmove(cPromise)
        return inst

@cython.auto_pickle(False)
cdef class Promise_cint32_t:
    cdef cFollyPromise[cint32_t]* cPromise

    def __cinit__(self):
        self.cPromise = new cFollyPromise[cint32_t](cFollyPromise[cint32_t].makeEmpty())

    def __dealloc__(self):
        del self.cPromise

    @staticmethod
    cdef _fbthrift_create(cFollyPromise[cint32_t] cPromise):
        cdef Promise_cint32_t inst = Promise_cint32_t.__new__(Promise_cint32_t)
        inst.cPromise[0] = cmove(cPromise)
        return inst

@cython.auto_pickle(False)
cdef class Promise_cFollyUnit:
    cdef cFollyPromise[cFollyUnit]* cPromise

    def __cinit__(self):
        self.cPromise = new cFollyPromise[cFollyUnit](cFollyPromise[cFollyUnit].makeEmpty())

    def __dealloc__(self):
        del self.cPromise

    @staticmethod
    cdef _fbthrift_create(cFollyPromise[cFollyUnit] cPromise):
        cdef Promise_cFollyUnit inst = Promise_cFollyUnit.__new__(Promise_cFollyUnit)
        inst.cPromise[0] = cmove(cPromise)
        return inst

@cython.auto_pickle(False)
cdef class Promise_cbool_Stream:
    cdef cFollyPromise[optional[cbool]] cPromise

    @staticmethod
    cdef _fbthrift_create(cFollyPromise[optional[cbool]] cPromise):
        cdef Promise_cbool_Stream inst = Promise_cbool_Stream.__new__(Promise_cbool_Stream)
        inst.cPromise = cmove(cPromise)
        return inst

@cython.auto_pickle(False)
cdef class Promise_cint32_t_Stream:
    cdef cFollyPromise[optional[cint32_t]] cPromise

    @staticmethod
    cdef _fbthrift_create(cFollyPromise[optional[cint32_t]] cPromise):
        cdef Promise_cint32_t_Stream inst = Promise_cint32_t_Stream.__new__(Promise_cint32_t_Stream)
        inst.cPromise = cmove(cPromise)
        return inst

cdef object _MyService_annotations = _py_types.MappingProxyType({
})


@cython.auto_pickle(False)
cdef class MyServiceInterface(
    ServiceInterface
):
    annotations = _MyService_annotations

    def __cinit__(self):
        self._cpp_obj = cMyServiceInterface(
            <PyObject *> self,
            get_executor()
        )

    async def foo(
            self):
        raise NotImplementedError("async def foo is not implemented")

    async def interact(
            self,
            arg):
        raise NotImplementedError("async def interact is not implemented")

    async def interactFast(
            self):
        raise NotImplementedError("async def interactFast is not implemented")

    async def serialize(
            self):
        raise NotImplementedError("async def serialize is not implemented")

    @staticmethod
    def createPublisher_serialize(callback=None):
        cdef unique_ptr[pair[cServerStream[cint32_t], cServerStreamPublisher[cint32_t]]] streams = make_unique[pair[cServerStream[cint32_t], cServerStreamPublisher[cint32_t]]](cServerStream[cint32_t].createPublisher(pythonFuncToCppFunc(callback)))

        return (ServerStream_cint32_t._fbthrift_create(cmove(deref(streams).first)), ServerPublisher_cint32_t._fbthrift_create(cmove(deref(streams).second)))

    @classmethod
    def __get_reflection__(cls):
        return _services_reflection.get_reflection__MyService(for_clients=False)

    @staticmethod
    def __get_metadata__():
        cdef __fbthrift_cThriftServiceMetadataResponse response
        ServiceMetadata[_services_reflection.cMyServiceSvIf].gen(response)
        return __MetadataBox.box(cmove(deref(response.metadata_ref())))

    @staticmethod
    def __get_thrift_name__():
        return "module.MyService"



cdef api void call_cy_MyService_foo(
    object self,
    Cpp2RequestContext* ctx,
    cFollyPromise[cFollyUnit] cPromise
):
    cdef Promise_cFollyUnit __promise = Promise_cFollyUnit._fbthrift_create(cmove(cPromise))
    __context = RequestContext._fbthrift_create(ctx)
    __context_token = __THRIFT_REQUEST_CONTEXT.set(__context)
    asyncio.get_event_loop().create_task(
        MyService_foo_coro(
            self,
            __promise
        )
    )
    __THRIFT_REQUEST_CONTEXT.reset(__context_token)
cdef api void call_cy_MyService_interact(
    object self,
    Cpp2RequestContext* ctx,
    cFollyPromise[cFollyUnit] cPromise,
    cint32_t arg
):
    cdef Promise_cFollyUnit __promise = Promise_cFollyUnit._fbthrift_create(cmove(cPromise))
    arg_arg = arg
    __context = RequestContext._fbthrift_create(ctx)
    __context_token = __THRIFT_REQUEST_CONTEXT.set(__context)
    asyncio.get_event_loop().create_task(
        MyService_interact_coro(
            self,
            __promise,
            arg_arg
        )
    )
    __THRIFT_REQUEST_CONTEXT.reset(__context_token)
cdef api void call_cy_MyService_interactFast(
    object self,
    Cpp2RequestContext* ctx,
    cFollyPromise[cint32_t] cPromise
):
    cdef Promise_cint32_t __promise = Promise_cint32_t._fbthrift_create(cmove(cPromise))
    __context = RequestContext._fbthrift_create(ctx)
    __context_token = __THRIFT_REQUEST_CONTEXT.set(__context)
    asyncio.get_event_loop().create_task(
        MyService_interactFast_coro(
            self,
            __promise
        )
    )
    __THRIFT_REQUEST_CONTEXT.reset(__context_token)
cdef api void call_cy_MyService_serialize(
    object self,
    Cpp2RequestContext* ctx,
    cFollyPromise[cResponseAndServerStream[cint32_t,cint32_t]] cPromise
):
    cdef Promise_cResponseAndServerStream__cint32_t_cint32_t __promise = Promise_cResponseAndServerStream__cint32_t_cint32_t._fbthrift_create(cmove(cPromise))
    __context = RequestContext._fbthrift_create(ctx)
    __context_token = __THRIFT_REQUEST_CONTEXT.set(__context)
    asyncio.get_event_loop().create_task(
        MyService_serialize_coro(
            self,
            __promise
        )
    )
    __THRIFT_REQUEST_CONTEXT.reset(__context_token)
cdef api void call_cy_MyService_onStartServing(
    object self,
    cFollyPromise[cFollyUnit] cPromise
):
    cdef Promise_cFollyUnit __promise = Promise_cFollyUnit._fbthrift_create(cmove(cPromise))
    asyncio.get_event_loop().create_task(
        MyService_onStartServing_coro(
            self,
            __promise
        )
    )
cdef api void call_cy_MyService_onStopRequested(
    object self,
    cFollyPromise[cFollyUnit] cPromise
):
    cdef Promise_cFollyUnit __promise = Promise_cFollyUnit._fbthrift_create(cmove(cPromise))
    asyncio.get_event_loop().create_task(
        MyService_onStopRequested_coro(
            self,
            __promise
        )
    )
async def MyService_foo_coro(
    object self,
    Promise_cFollyUnit promise
):
    try:
        result = await self.foo()
    except __ApplicationError as ex:
        # If the handler raised an ApplicationError convert it to a C++ one
        promise.cPromise.setException(cTApplicationException(
            ex.type.value, ex.message.encode('UTF-8')
        ))
    except Exception as ex:
        print(
            "Unexpected error in service handler foo:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, repr(ex).encode('UTF-8')
        ))
    except asyncio.CancelledError as ex:
        print("Coroutine was cancelled in service handler foo:", file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, (f'Application was cancelled on the server with message: {str(ex)}').encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)

async def MyService_interact_coro(
    object self,
    Promise_cFollyUnit promise,
    arg
):
    try:
        result = await self.interact(
                    arg)
    except __ApplicationError as ex:
        # If the handler raised an ApplicationError convert it to a C++ one
        promise.cPromise.setException(cTApplicationException(
            ex.type.value, ex.message.encode('UTF-8')
        ))
    except Exception as ex:
        print(
            "Unexpected error in service handler interact:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, repr(ex).encode('UTF-8')
        ))
    except asyncio.CancelledError as ex:
        print("Coroutine was cancelled in service handler interact:", file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, (f'Application was cancelled on the server with message: {str(ex)}').encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)

async def MyService_interactFast_coro(
    object self,
    Promise_cint32_t promise
):
    try:
        result = await self.interactFast()
    except __ApplicationError as ex:
        # If the handler raised an ApplicationError convert it to a C++ one
        promise.cPromise.setException(cTApplicationException(
            ex.type.value, ex.message.encode('UTF-8')
        ))
    except Exception as ex:
        print(
            "Unexpected error in service handler interactFast:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, repr(ex).encode('UTF-8')
        ))
    except asyncio.CancelledError as ex:
        print("Coroutine was cancelled in service handler interactFast:", file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, (f'Application was cancelled on the server with message: {str(ex)}').encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(<cint32_t> result)

async def MyService_serialize_coro(
    object self,
    Promise_cResponseAndServerStream__cint32_t_cint32_t promise
):
    try:
        result = self.serialize()
        result = await result
        item, result = result
        if not isinstance(result, (ServerStream, AsyncIterator)):
            result = await result
        if isinstance(result, AsyncIterator):
            result = ServerStream_cint32_t._fbthrift_create(cmove(createAsyncIteratorFromPyIterator[cint32_t](result, get_executor(), &getNextGenerator_MyService_serialize)))
    except __ApplicationError as ex:
        # If the handler raised an ApplicationError convert it to a C++ one
        promise.cPromise.setException(cTApplicationException(
            ex.type.value, ex.message.encode('UTF-8')
        ))
    except Exception as ex:
        print(
            "Unexpected error in service handler serialize:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, repr(ex).encode('UTF-8')
        ))
    except asyncio.CancelledError as ex:
        print("Coroutine was cancelled in service handler serialize:", file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, (f'Application was cancelled on the server with message: {str(ex)}').encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(createResponseAndServerStream[cint32_t,cint32_t]((<cint32_t?> item), cmove(deref((<ServerStream_cint32_t?>result).cStream))))

async def MyService_onStartServing_coro(
    object self,
    Promise_cFollyUnit promise
):
    try:
        result = await self.onStartServing()
    except __ApplicationError as ex:
        # If the handler raised an ApplicationError convert it to a C++ one
        promise.cPromise.setException(cTApplicationException(
            ex.type.value, ex.message.encode('UTF-8')
        ))
    except Exception as ex:
        print(
            "Unexpected error in service handler onStartServing:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, repr(ex).encode('UTF-8')
        ))
    except asyncio.CancelledError as ex:
        print("Coroutine was cancelled in service handler onStartServing:", file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, (f'Application was cancelled on the server with message: {str(ex)}').encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)

async def MyService_onStopRequested_coro(
    object self,
    Promise_cFollyUnit promise
):
    try:
        result = await self.onStopRequested()
    except __ApplicationError as ex:
        # If the handler raised an ApplicationError convert it to a C++ one
        promise.cPromise.setException(cTApplicationException(
            ex.type.value, ex.message.encode('UTF-8')
        ))
    except Exception as ex:
        print(
            "Unexpected error in service handler onStopRequested:",
            file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, repr(ex).encode('UTF-8')
        ))
    except asyncio.CancelledError as ex:
        print("Coroutine was cancelled in service handler onStopRequested:", file=sys.stderr)
        traceback.print_exc()
        promise.cPromise.setException(cTApplicationException(
            cTApplicationExceptionType__UNKNOWN, (f'Application was cancelled on the server with message: {str(ex)}').encode('UTF-8')
        ))
    else:
        promise.cPromise.setValue(c_unit)

