package com.fan.dubbo.group.impl;

import com.fan.dubbo.group.Group;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService(group = "groupImpl2")
public class GroupImpl2 implements Group {
    @Override
    public String doSomething(String s) {
        return "GroupImpl2";
    }
}
