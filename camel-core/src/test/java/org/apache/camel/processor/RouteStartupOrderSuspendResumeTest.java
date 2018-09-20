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
package org.apache.camel.processor;

import java.util.List;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.RouteStartupOrder;
import org.junit.Test;

/**
 * @version 
 */
public class RouteStartupOrderSuspendResumeTest extends ContextTestSupport {

    @Test
    public void testRouteStartupOrderSuspendResume() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);

        template.sendBody("direct:start", "Hello World");

        assertMockEndpointsSatisfied();

        context.suspend();
        context.resume();

        // assert correct order
        DefaultCamelContext dcc = (DefaultCamelContext) context;
        List<RouteStartupOrder> order = dcc.getRouteStartupOrder();

        assertEquals(4, order.size());
        assertEquals("direct://foo", order.get(0).getRoute().getEndpoint().getEndpointUri());
        assertEquals("direct://start", order.get(1).getRoute().getEndpoint().getEndpointUri());
        assertEquals("direct://baz", order.get(2).getRoute().getEndpoint().getEndpointUri());
        assertEquals("direct://bar", order.get(3).getRoute().getEndpoint().getEndpointUri());
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").routeId("B").startupOrder(2).to("direct:foo");

                from("direct:foo").routeId("A").startupOrder(1).to("mock:result");

                from("direct:bar").routeId("D").startupOrder(9).to("direct:bar");

                from("direct:baz").routeId("C").startupOrder(5).to("mock:other");
            }
        };
    }
}