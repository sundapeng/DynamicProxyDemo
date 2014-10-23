/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sundp.mylearning.proxy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class DefaultClient implements ClientInterface{

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultClient.class);

    @Override
    public List<String> list() {
        LOGGER.info("list");
        return Arrays.asList("I'm string A", "I'm string B");
    }

    @Override
    public String get() {
        String object = "I'm a string";
        LOGGER.info("get: " + object);
        return object;
    }

    @Override
    public String insert(String object) {
        LOGGER.info("Insert: " + object);
        return object;
    }

    @Override
    public void delete(String object) {
        LOGGER.info("delete: " + object);
    }
}
