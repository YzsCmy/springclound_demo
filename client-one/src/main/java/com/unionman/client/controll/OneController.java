package com.unionman.client.controll;

import com.unionman.api.clientone.OneControllerApi;
import com.unionman.client.service.TwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController implements OneControllerApi {

    @Autowired
    private TwoService twoService;


    /* 测试调用two的服务 */
    @RequestMapping(value = "/one/sayhitwo", method = RequestMethod.GET)
    public String clientOneSayHiTwo(@RequestParam String name) {
        return twoService.sayHiFromClientOne(name);
    }

    /* 测试调用自身的服务 */
    @RequestMapping(value = "/one/sayhi", method = RequestMethod.GET)
    public String clientOneSayHi(@RequestParam String name) {
        return "this is client one , name : " + name;
    }

}
