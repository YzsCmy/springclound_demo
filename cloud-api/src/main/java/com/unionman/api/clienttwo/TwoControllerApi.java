package com.unionman.api.clienttwo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(tags="微服务two的接口")
public interface TwoControllerApi {

    /* 测试调用one的服务 */
    @ApiOperation("two调用one的服务接口")
    @ApiImplicitParam(name="name",value="姓名",paramType = "query",dataType="String",required = true)
    @RequestMapping(value = "/two/sayhione", method = RequestMethod.GET)
    public String clientOneSayHiTwo(@RequestParam String name);

    /* 测试调用自身的服务 */
    @ApiOperation("two调用自身的服务接口")
    @ApiImplicitParam(name="name",value="姓名",paramType = "query",dataType="String",required = true)
    @RequestMapping(value = "/two/sayhi", method = RequestMethod.GET)
    public String clientTwoSayHi(@RequestParam String name);
}
