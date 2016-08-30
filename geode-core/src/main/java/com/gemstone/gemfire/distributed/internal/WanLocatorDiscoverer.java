/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gemstone.gemfire.distributed.internal;

import com.gemstone.gemfire.cache.client.internal.locator.wan.LocatorMembershipListener;

public interface WanLocatorDiscoverer {
  
  public static final int WAN_LOCATOR_CONNECTION_TIMEOUT = Integer.getInteger(
      "WANLocator.CONNECTION_TIMEOUT", 50000).intValue();
  
  /**
   * For WAN 70 Exchange the locator information within the distributed system
   */
  void discover(int port, DistributionConfigImpl config,
                LocatorMembershipListener locatorListener, final String hostnameForClients);

  void stop();

  boolean isStopped();
}