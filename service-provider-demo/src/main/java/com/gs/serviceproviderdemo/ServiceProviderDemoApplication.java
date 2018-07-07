package com.gs.serviceproviderdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gs.serviceproviderdemo.mapper")
public class ServiceProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderDemoApplication.class, args);
	}


	/*@RequestMapping("/hi")
	public String home(@RequestParam String name){
		return  "hi "+name+",i am from port:" +port;
	}*/


}
