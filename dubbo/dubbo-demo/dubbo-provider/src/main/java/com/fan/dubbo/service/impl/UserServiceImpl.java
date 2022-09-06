package com.fan.dubbo.service.impl;

import com.fan.dubbo.service.UserService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.rpc.RpcContext;


@DubboService(methods = {@Method(name = "dokill",executes = 10,actives = 10)},connections = 10,protocol = "dubbo")
public class UserServiceImpl implements UserService {
    @Override
    public String queryUser(String var1) {
        String username = RpcContext.getContext().getAttachment("username");
        System.out.println(username);
        System.out.println("======provider=====" + var1);
        return "OK--" + var1;
    }

    @Override
    public void dokill(String var1) {
        System.out.println("======provider======");
    }
}
