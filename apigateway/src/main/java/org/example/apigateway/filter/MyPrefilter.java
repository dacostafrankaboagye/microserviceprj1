package org.example.apigateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class MyPrefilter implements GlobalFilter {

    private final Logger logger = LoggerFactory.getLogger(MyPrefilter.class);


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        logger.info("Prefilter executed");

        var requestPath = exchange.getRequest().getPath().toString();

        logger.info("Prefilter -> Request path = {}", requestPath);


        return chain.filter(exchange);
    }
}
