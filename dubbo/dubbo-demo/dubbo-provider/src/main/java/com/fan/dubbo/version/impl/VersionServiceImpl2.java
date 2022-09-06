package com.fan.dubbo.version.impl;

import com.fan.dubbo.version.VersionService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "v2.0")
public class VersionServiceImpl2 implements VersionService {
    @Override
    public String version(String s) {
        return "VersionServiceImpl2";
    }
}
