package com.example.api;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import org.junit.Test;

import java.net.URI;

/**
 * java9 httpclient
 */
public class TestHttp {
    
    @Test
    public void test() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.qq.com")).GET().build();
        HttpResponse<String> response = client.send(req, HttpResponse.BodyHandler.asString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
        System.out.println(response.version().name());
    }
}
