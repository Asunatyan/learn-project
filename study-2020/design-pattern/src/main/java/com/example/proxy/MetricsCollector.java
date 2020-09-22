package com.example.proxy;

public class MetricsCollector {
    public void recordRequest(RequestInfo recordRequest) {
        System.out.println("recordRequest,被执行了");
    }
}
