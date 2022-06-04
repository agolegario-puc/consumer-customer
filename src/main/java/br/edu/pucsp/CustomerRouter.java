package br.edu.pucsp;

import org.apache.camel.builder.RouteBuilder;

public class CustomerRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:queue:customers-integration-all")
                .log("${body}");

    }
}
