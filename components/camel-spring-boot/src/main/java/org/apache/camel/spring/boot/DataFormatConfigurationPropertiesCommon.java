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
package org.apache.camel.spring.boot;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

public class DataFormatConfigurationPropertiesCommon {
    /**
     * Global option to enable/disable dataformat auto-configuration, default is true.
     */
    private boolean enabled = true;

    @NestedConfigurationProperty
    private CustomizerProperties customizer = new CustomizerProperties();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public CustomizerProperties getCustomizer() {
        return customizer;
    }

    // ********************************
    // Customizer
    // ********************************

    public class CustomizerProperties {
        /**
         * Global option to enable/disable dataformat customizers, default is true.
         */
        private boolean enabled = true;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
    }
}
