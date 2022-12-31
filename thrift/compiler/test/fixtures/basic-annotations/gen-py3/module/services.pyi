#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import folly.iobuf as _fbthrift_iobuf
import typing as _typing
from thrift.py3.server import RequestContext, ServiceInterface
from abc import abstractmethod, ABCMeta

import module.types as _module_types
import facebook.thrift.annotation.cpp.types as _facebook_thrift_annotation_cpp_types

_MyServiceInterfaceT = _typing.TypeVar('_MyServiceInterfaceT', bound='MyServiceInterface')


class MyServiceInterface(
    ServiceInterface,
    metaclass=ABCMeta,
):


    @abstractmethod
    async def ping(
        self
    ) -> None: ...


    @abstractmethod
    async def getRandomData(
        self
    ) -> str: ...


    @abstractmethod
    async def hasDataById(
        self,
        id: int
    ) -> bool: ...


    @abstractmethod
    async def getDataById(
        self,
        id: int
    ) -> str: ...


    @abstractmethod
    async def putDataById(
        self,
        id: int,
        data: str
    ) -> None: ...


    @abstractmethod
    async def lobDataById(
        self,
        id: int,
        data: str
    ) -> None: ...


    @abstractmethod
    async def doNothing(
        self
    ) -> None: ...
    pass


_MyServicePrioParentInterfaceT = _typing.TypeVar('_MyServicePrioParentInterfaceT', bound='MyServicePrioParentInterface')


class MyServicePrioParentInterface(
    ServiceInterface,
    metaclass=ABCMeta,
):


    @abstractmethod
    async def ping(
        self
    ) -> None: ...


    @abstractmethod
    async def pong(
        self
    ) -> None: ...
    pass


_MyServicePrioChildInterfaceT = _typing.TypeVar('_MyServicePrioChildInterfaceT', bound='MyServicePrioChildInterface')


class MyServicePrioChildInterface(
MyServicePrioParentInterface,
    metaclass=ABCMeta,
):


    @abstractmethod
    async def pang(
        self
    ) -> None: ...
    pass


_BadServiceInterfaceT = _typing.TypeVar('_BadServiceInterfaceT', bound='BadServiceInterface')


class BadServiceInterface(
    ServiceInterface,
    metaclass=ABCMeta,
):


    @abstractmethod
    async def bar(
        self
    ) -> int: ...
    pass


