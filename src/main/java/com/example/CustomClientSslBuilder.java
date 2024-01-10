package com.example;

import io.micronaut.context.annotation.Replaces;
import io.micronaut.core.io.ResourceResolver;
import io.micronaut.http.client.netty.ssl.NettyClientSslBuilder;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyStore;
import java.util.Optional;

@Singleton
@Replaces(NettyClientSslBuilder.class)
public class CustomClientSslBuilder extends NettyClientSslBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(CustomClientSslBuilder.class);

    public CustomClientSslBuilder(ResourceResolver resourceResolver) {
        super(resourceResolver);
    }

    @Override
    protected KeyStore load(Optional<String> optionalType, String resource, Optional<String> optionalPassword) throws Exception {
        LOG.info("Load method called");
        return super.load(optionalType, resource, optionalPassword);
    }
}
