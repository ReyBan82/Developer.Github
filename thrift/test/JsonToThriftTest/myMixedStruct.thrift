/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

namespace cpp2 apache.thrift.test
namespace java thrift.test

struct mySuperSimpleStruct {
  1: i16 a;
}

struct myMixedStruct {
  1: list<i16> a;
  2: list<mySuperSimpleStruct> b;
  3: map<string, i16> c;
  4: map<string, mySuperSimpleStruct> d;
  5: set<i16> e;
}
