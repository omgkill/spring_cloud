package com.example.hello_consumer;

import com.example.hello_consumer.consumer.RemoteService;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements RemoteService{
    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
