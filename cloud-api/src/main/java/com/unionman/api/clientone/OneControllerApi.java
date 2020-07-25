package com.unionman.api.clientone;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(tags="微服务one的接口")
public interface OneControllerApi {

    /* 测试调用two的服务 */
    @ApiOperation("one调用two的服务接口")
    @ApiImplicitParam(name="name",value="姓名",paramType = "query",dataType="String",required = true)
    @RequestMapping(value = "/one/sayhitwo", method = RequestMethod.GET)
    public String clientOneSayHiTwo(@RequestParam String name);

    /* 测试调用自身的服务 */
    @ApiOperation("one调用自身的服务接口")
    @ApiImplicitParam(name="name",value="姓名",paramType = "query",dataType="String",required = true)
    @RequestMapping(value = "/one/sayhi", method = RequestMethod.GET)
    public String clientOneSayHi(@RequestParam String name);
}
