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

package com.facebook.thrift.transport;

/**
 * Factory class used to create wrapped instance of Transports. This is used primarily in servers,
 * which get Transports from a ServerTransport and then may want to mutate them (i.e. create a
 * BufferedTransport from the underlying base transport)
 */
public class TTransportFactory {

  /**
   * Return a wrapped instance of the base Transport.
   *
   * @param trans The base transport
   * @return Wrapped Transport
   */
  public TTransport getTransport(TTransport trans) {
    return trans;
  }
}
