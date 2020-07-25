package com.unionman.client.failback;

import com.unionman.client.service.TwoService;
import org.springframework.stereotype.Component;

@Component
public class TwoFailback implements TwoService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hello " + name + " , this messge send failed ";
    }
}