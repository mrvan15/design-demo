package com.fan.dubbo;


import com.fan.dubbo.config.ProviderConfiguration;
import org.apache.dubbo.config.ProviderConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

public class DubboProviderApplication {
    public static void main(String[] args) throws InterruptedException {
        //new embeddedz
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        System.out.println("dubbo service start");
        new CountDownLatch(1).await();
    }
}
