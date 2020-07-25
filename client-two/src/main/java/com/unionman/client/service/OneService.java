package com.unionman.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-one")
public interface OneService {

    @RequestMapping(value = "/one/sayhi",method = RequestMethod.GET)
    String sayHiFromClientTwo(@RequestParam(value = "name") String name);
}