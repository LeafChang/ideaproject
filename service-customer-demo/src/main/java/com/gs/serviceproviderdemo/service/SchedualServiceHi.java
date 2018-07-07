package com.gs.serviceproviderdemo.service;

import com.gs.serviceproviderdemo.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-provider-demo",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    String sayHiFromClientOne(@PathVariable("uid") Integer uid);

}
