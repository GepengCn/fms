package com.itonglian.fms.controller;


import com.itonglian.fms.entity.FmsFileExample;
import com.itonglian.fms.service.FmsFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Api(value="测试接口Controller")
public class TestController {
    @Autowired
    FmsFileService fmsFileService;
    @ApiOperation(value="测试用接口", notes="测试用接口" ,httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name", value="用户姓名", dataType = "String", required=true, paramType="form"),
            @ApiImplicitParam(name="id", value="id", dataType = "int", required=false, paramType="form")
    })
    @RequestMapping("word")
    public long HelloWord(String name,Integer id) {
        FmsFileExample fmsFileExample = new FmsFileExample();
        fmsFileExample.or().andStatusEqualTo(100);
        long count = fmsFileService.countByExample(fmsFileExample);
        return count;
    }


}
