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

namespace cpp2 metadata.test.nested_structs

enum Continent {
  NorthAmerica = 1,
  SouthAmerica = 2,
  Europe = 3,
  Asia = 4,
  Africa = 5,
  Oceania = 6,
  Antarctica = 7,
}

struct Country {
  1: string name (field_foo, field_bar = "field_baz");
  2: Continent continent;
  3: optional string capital;
  4: double population;
}

struct City {
  1: string name;
  2: Country country;
}

struct Foo {
  1: string bar;
  2: list<Foo> foos;
}

service NestedStructsTestService {
  Foo getFoo(1: Continent continent, 2: Country country, 3: City city);
}
