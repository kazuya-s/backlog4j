package com.nulabinc.backlog4j.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BacklogClientImplTest {

    @Test
    public void userAgentTest() {
        BacklogHttpClient client = new BacklogHttpClientImpl();
        String version = BacklogHttpClientImpl.class.getPackage().getImplementationVersion();

        // default
        assertEquals(client.getUserAgent(), "backlog4j/" + version);

        // set the new value
        client.setUserAgent("test-agent");
        assertEquals(client.getUserAgent(), "test-agent");
    }
}
