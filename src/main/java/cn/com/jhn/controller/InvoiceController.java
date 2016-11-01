package cn.com.jhn.controller;

import cn.com.jhn.domain.BaseBenchBasicInfo;
import cn.com.jhn.interfaces.IBaseBenchBasicInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Rest 入口，用于测试
 * @author 陈琳
 * @create 2016-10-20 上午 10:52
 **/
@RestController
@RequestMapping("/spring-cloud-client-mysql")
public class InvoiceController {

    @Autowired
    protected IBaseBenchBasicInfoDao baseBenchBasicInfoDaoImpl;
    /**
     * @description:spring cloud  mysql client  config 测试
     * @author:陈琳
     * @return:
     * @param
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BaseBenchBasicInfo test() {
        Map<String,Object> condiMap=new HashMap<>();
        condiMap.put("benchType", 1);
        condiMap.put("benchCode",2);
        /*return "Welcome to Spring Cloud mysql client config read !"+
               this.baseBenchBasicInfoDaoImpl.getAllocationIdByTypeCode(condiMap).toString();*/
        BaseBenchBasicInfo baseInfo=new BaseBenchBasicInfo();
        baseInfo.setAllocationId(1L);
        return baseInfo;

    }

}
