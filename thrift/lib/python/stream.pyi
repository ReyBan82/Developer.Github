# Copyright (c) Meta Platforms, Inc. and affiliates.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from typing import AsyncIterator, Generic, TypeVar

TChunk = TypeVar("TChunk")
TFinalResponse = TypeVar("TFinalResponse")

class ClientSink(Generic[TFinalResponse]):
    def __init__(self) -> None: ...
    async def sink(
        self, iterator: AsyncIterator[TChunk]
    ) -> Generic[TFinalResponse]: ...

class ClientBufferedStream(AsyncIterator[TChunk]):
    def __aiter__(self) -> AsyncIterator[TChunk]: ...
    async def __anext__(self) -> TChunk: ...
