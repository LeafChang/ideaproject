package com.gs.serviceproviderdemo.service;

import com.gs.serviceproviderdemo.config.FeignClientConfig;
import com.gs.serviceproviderdemo.service.impl.SchedualServiceHiHystric;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-provider-demo",fallback = SchedualServiceHiHystric.class,configuration = FeignClientConfig.class)
public interface SchedualServiceHi {

    //@RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    @RequestLine(value="GET /user/{uid}")
    String sayHiFromClientOne(@Param("uid") Integer uid);

}
