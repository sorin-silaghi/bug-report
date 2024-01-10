package com.example;

import io.micronaut.http.client.netty.ssl.NettyClientSslBuilder;
import io.micronaut.http.ssl.ClientSslConfiguration;
import io.micronaut.http.ssl.SslConfiguration;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class BugReportTest {

    @Inject
    NettyClientSslBuilder nettyClientSslBuilder;

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        Assertions.assertNotNull(nettyClientSslBuilder);
        Assertions.assertEquals(CustomClientSslBuilder.class, nettyClientSslBuilder.getClass());
    }

}
