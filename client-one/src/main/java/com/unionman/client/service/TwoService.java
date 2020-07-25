package com.unionman.client.service;

import com.unionman.client.failback.TwoFailback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-two", fallback = TwoFailback.class)
public interface TwoService {

    @RequestMapping(value = "/two/sayhi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}