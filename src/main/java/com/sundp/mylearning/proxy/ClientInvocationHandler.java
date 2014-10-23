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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClientInvocationHandler implements InvocationHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultClient.class);

    private ClientInterface client = null;

    public ClientInvocationHandler(ClientInterface client){
        this.client = client;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result = null;
        try {
            LOGGER.debug(proxy.getClass().getSimpleName() + "," + method.getName() + "," + args);
            result = method.invoke(client, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
