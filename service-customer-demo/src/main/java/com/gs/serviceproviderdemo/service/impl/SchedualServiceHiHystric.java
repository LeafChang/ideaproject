package com.gs.serviceproviderdemo.service.impl;

import com.gs.serviceproviderdemo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(Integer uid) {
        return "error";
    }
}
