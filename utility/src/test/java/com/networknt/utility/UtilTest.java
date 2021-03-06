/*
 * Copyright (c) 2016 Network New Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.networknt.utility;

import org.junit.Assert;
import org.junit.Test;

public class UtilTest {
    @Test
    public void testGetUUID() {
        String id1 = Util.getUUID();
        String id2 = Util.getUUID();
        System.out.println("uuid = " + id1);
        System.out.println("uuid = " + id2);
        Assert.assertNotEquals(id1, id2);
    }

    @Test
    public void testGetJarVersion() {
        String ver = Util.getJarVersion();
        System.out.println("ver =" + ver);
    }
}
