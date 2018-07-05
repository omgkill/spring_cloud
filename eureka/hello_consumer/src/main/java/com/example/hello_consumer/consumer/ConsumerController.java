package com.example.hello_consumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    private String url = "http://PRODUCE/hello?param=";

    @Autowired
    private RestTemplate restTemplate; // HTTP 访问操作类

    @Autowired
    private RemoteService remoteService;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        String providerMsg =restTemplate.getForEntity(url+name, String.class).getBody();

        return providerMsg;
    }

    @GetMapping("hello/hys/{name}")
    public String index2(@PathVariable("name") String name) {
        return remoteService.hello(name);
    }
}
