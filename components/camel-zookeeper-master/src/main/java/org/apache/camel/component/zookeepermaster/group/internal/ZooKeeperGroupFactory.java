/**
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
package org.apache.camel.component.zookeepermaster.group.internal;

import java.util.concurrent.ThreadFactory;

import org.apache.camel.component.zookeepermaster.group.Group;
import org.apache.camel.component.zookeepermaster.group.GroupFactory;
import org.apache.camel.component.zookeepermaster.group.NodeState;
import org.apache.curator.framework.CuratorFramework;

/**
 */
public class ZooKeeperGroupFactory implements GroupFactory {

    private CuratorFramework curator;

    public ZooKeeperGroupFactory(CuratorFramework curator) {
        this.curator = curator;
    }

    @Override
    public <T extends NodeState> Group<T> createGroup(String path, Class<T> clazz) {
        return new ZooKeeperGroup<>(curator, path, clazz);
    }

    @Override
    public <T extends NodeState> Group<T> createGroup(String path, Class<T> clazz, ThreadFactory threadFactory) {
        return new ZooKeeperGroup<>(curator, path, clazz, threadFactory);
    }

    @Override
    public <T extends NodeState> Group<T> createMultiGroup(String path, Class<T> clazz) {
        return new ZooKeeperMultiGroup<>(curator, path, clazz);
    }

    @Override
    public <T extends NodeState> Group<T> createMultiGroup(String path, Class<T> clazz, ThreadFactory threadFactory) {
        return new ZooKeeperMultiGroup<>(curator, path, clazz, threadFactory);
    }

}
