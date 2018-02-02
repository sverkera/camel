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
package org.apache.camel.component.directvm.springboot;

import javax.annotation.Generated;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The direct-vm component provides direct synchronous call to another endpoint
 * from any CamelContext in the same JVM.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.direct-vm")
public class DirectVmComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * If sending a message to a direct endpoint which has no active consumer
     * then we can tell the producer to block and wait for the consumer to
     * become active.
     */
    private Boolean block = true;
    /**
     * The timeout value to use if block is enabled.
     */
    private Long timeout = 30000L;
    /**
     * Sets a HeaderFilterStrategy that will only be applied on producer
     * endpoints (on both directions: request and response). Default value:
     * none.
     */
    @NestedConfigurationProperty
    private HeaderFilterStrategy headerFilterStrategy;
    /**
     * Whether to propagate or not properties from the producer side to the
     * consumer side and vice versa. Default value: true.
     */
    private Boolean propagateProperties = true;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public Boolean getBlock() {
        return block;
    }

    public void setBlock(Boolean block) {
        this.block = block;
    }

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }

    public Boolean getPropagateProperties() {
        return propagateProperties;
    }

    public void setPropagateProperties(Boolean propagateProperties) {
        this.propagateProperties = propagateProperties;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}