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
package org.apache.camel.component.snakeyaml.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.component.snakeyaml.SnakeYAMLDataFormat;
import org.apache.camel.model.dataformat.YAMLLibrary;
import org.apache.camel.model.dataformat.YAMLTypeFilterDefinition;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * YAML is a data format to marshal and unmarshal Java objects to and from YAML.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.yaml-snakeyaml")
public class SnakeYAMLDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the yaml-snakeyaml data format.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Which yaml library to use. By default it is SnakeYAML
     */
    private YAMLLibrary library = YAMLLibrary.SnakeYAML;
    /**
     * Class name of the java type to use when unarmshalling
     */
    private String unmarshalTypeName;
    /**
     * BaseConstructor to construct incoming documents.
     */
    private String constructor;
    /**
     * Representer to emit outgoing objects.
     */
    private String representer;
    /**
     * DumperOptions to configure outgoing objects.
     */
    private String dumperOptions;
    /**
     * Resolver to detect implicit type
     */
    private String resolver;
    /**
     * Use ApplicationContextClassLoader as custom ClassLoader
     */
    private Boolean useApplicationContextClassLoader = true;
    /**
     * Force the emitter to produce a pretty YAML document when using the flow
     * style.
     */
    private Boolean prettyFlow = false;
    /**
     * Allow any class to be un-marshaled
     */
    private Boolean allowAnyType = false;
    /**
     * Set the types SnakeYAML is allowed to un-marshall
     */
    private List<YAMLTypeFilterDefinition> typeFilter;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format if the data format is capable of doing so. For
     * example application/xml for data formats marshalling to XML, or
     * application/json for data formats marshalling to JSon etc.
     */
    private Boolean contentTypeHeader = false;

    public YAMLLibrary getLibrary() {
        return library;
    }

    public void setLibrary(YAMLLibrary library) {
        this.library = library;
    }

    public String getUnmarshalTypeName() {
        return unmarshalTypeName;
    }

    public void setUnmarshalTypeName(String unmarshalTypeName) {
        this.unmarshalTypeName = unmarshalTypeName;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getRepresenter() {
        return representer;
    }

    public void setRepresenter(String representer) {
        this.representer = representer;
    }

    public String getDumperOptions() {
        return dumperOptions;
    }

    public void setDumperOptions(String dumperOptions) {
        this.dumperOptions = dumperOptions;
    }

    public String getResolver() {
        return resolver;
    }

    public void setResolver(String resolver) {
        this.resolver = resolver;
    }

    public Boolean getUseApplicationContextClassLoader() {
        return useApplicationContextClassLoader;
    }

    public void setUseApplicationContextClassLoader(
            Boolean useApplicationContextClassLoader) {
        this.useApplicationContextClassLoader = useApplicationContextClassLoader;
    }

    public Boolean getPrettyFlow() {
        return prettyFlow;
    }

    public void setPrettyFlow(Boolean prettyFlow) {
        this.prettyFlow = prettyFlow;
    }

    public Boolean getAllowAnyType() {
        return allowAnyType;
    }

    public void setAllowAnyType(Boolean allowAnyType) {
        this.allowAnyType = allowAnyType;
    }

    public List<YAMLTypeFilterDefinition> getTypeFilter() {
        return typeFilter;
    }

    public void setTypeFilter(List<YAMLTypeFilterDefinition> typeFilter) {
        this.typeFilter = typeFilter;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }
}