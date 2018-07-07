package com.gs.serviceproviderdemo.service;

import com.gs.serviceproviderdemo.config.FeignClientConfig2;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "xxx", url = "http://localhost:8761/", configuration = FeignClientConfig2.class)
public interface FeignClientDemo {

    @RequestLine(value = "GET /eureka/apps/{serviceName}/")
    public String findServiceInfoFromEurekaByServiceName(@Param("serviceName") String serviceName);


}
