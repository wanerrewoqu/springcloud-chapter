package com.forezp.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author Chenshu
 * @date 2018/9/16 0016 下午 6:59
 * @application
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
