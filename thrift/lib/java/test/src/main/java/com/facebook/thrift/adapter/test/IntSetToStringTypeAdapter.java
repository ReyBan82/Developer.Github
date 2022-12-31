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

package com.facebook.thrift.adapter.test;

import com.facebook.thrift.adapter.common.SetTypeAdapter;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntSetToStringTypeAdapter implements SetTypeAdapter<Integer, String> {
  @Override
  public String fromThrift(Set<Integer> list) {
    return list.stream().map(String::valueOf).collect(Collectors.joining(","));
  }

  @Override
  public Set<Integer> toThrift(String s) {
    if (s == null) {
      return null;
    }
    if ("".equals(s)) {
      return Collections.emptySet();
    }
    return Stream.of(s.split(",")).map(Integer::parseInt).collect(Collectors.toSet());
  }
}
