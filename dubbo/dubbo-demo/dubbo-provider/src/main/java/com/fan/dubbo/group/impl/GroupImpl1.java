package com.fan.dubbo.group.impl;

import com.fan.dubbo.group.Group;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "groupImpl1")
public class GroupImpl1 implements Group {
    @Override
    public String doSomething(String s) {
        return "GroupImpl1";
    }
}
