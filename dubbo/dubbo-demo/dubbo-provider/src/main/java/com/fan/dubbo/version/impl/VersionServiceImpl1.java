package com.fan.dubbo.version.impl;

import com.fan.dubbo.version.VersionService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "v1.0")
public class VersionServiceImpl1 implements VersionService {
    @Override
    public String version(String s) {
        return "VersionServiceImpl1";
    }
}
