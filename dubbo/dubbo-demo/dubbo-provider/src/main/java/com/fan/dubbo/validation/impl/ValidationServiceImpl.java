package com.fan.dubbo.validation.impl;

import com.fan.dubbo.validation.ValidationParameter;
import com.fan.dubbo.validation.ValidationService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class ValidationServiceImpl implements ValidationService {
    @Override
    public void save(ValidationParameter validationParameter) {
        System.out.println("ValidationServiceImpl.save");
    }

    @Override
    public void update(ValidationParameter validationParameter) {
        System.out.println("validationParameter.update");
    }

    @Override
    public void delete(long l, String s) {
        System.out.println("validationParameter.delete");
    }
}
