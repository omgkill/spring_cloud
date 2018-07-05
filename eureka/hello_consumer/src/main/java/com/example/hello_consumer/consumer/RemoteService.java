package com.example.hello_consumer.consumer;

import com.example.hello_consumer.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "produce2",fallback = HelloRemoteHystrix.class )
public interface RemoteService {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "param") String param);
}
