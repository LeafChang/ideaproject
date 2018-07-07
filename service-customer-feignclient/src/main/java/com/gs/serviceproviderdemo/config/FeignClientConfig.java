package com.gs.serviceproviderdemo.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    //feign契约
    // 这里是开启feign的默认注解,如果不做设置，则使用springMVC的注解
    //例如
    // springMVC注解
    // @RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    // feign的默认注解
    // @RequestLine(value="GET /user/{uid}")
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }


}
