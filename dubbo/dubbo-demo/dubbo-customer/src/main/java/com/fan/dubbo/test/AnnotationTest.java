package com.fan.dubbo.test;

import com.fan.dubbo.config.ConsumerConfiguration;
import com.fan.dubbo.group.Group;
import com.fan.dubbo.service.UserService;
import com.fan.dubbo.validation.ValidationParameter;
import com.fan.dubbo.validation.ValidationService;
import com.fan.dubbo.version.VersionService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConsumerConfiguration.class})
public class AnnotationTest {

    @DubboReference(check = false,url = "dubbo://localhost:20880",retries = 3,timeout = 1000,cluster = "failover",loadbalance = "random")
    private UserService userService;

    //@DubboReference(group = "groupImpl2")
    @DubboReference(check = false,group = "*",parameters = {"merger","true"}) //*代表所有合并
    private Group group;

    @DubboReference(check = false,version = "v1.0")
    private VersionService versionService;

    @DubboReference(check = false,validation = "true")
    private ValidationService validationService;

    @Test
    public void test1(){
        String fan = userService.queryUser("fan");

        System.out.println(fan);
    }

    @Test
    public void refService(){
        //应用信息
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo_consumer");

        //注册信息
        RegistryConfig registryConfig = new RegistryConfig();

        registryConfig.setAddress("zookeeper://127.0.0.1:2181");

        //引用api
        ReferenceConfig<UserService> referenceConfig = new ReferenceConfig<UserService>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(UserService.class);

        //服务引用,引用过程非常重量,如果想用API的方式引用服务,这个对象需要缓存
        UserService userService = referenceConfig.get();
        System.out.println("userService.queryUser(\"wang\") = " + userService.queryUser("wang"));

    }

    @Test
    public void group(){
        System.out.println(group.doSomething("work"));
    }

    @Test
    public void version(){
        System.out.println(versionService.version("version"));
    }

    @Test
    public void validation(){
        ValidationParameter parameter = new ValidationParameter();
        parameter.setName("a11");
        parameter.setAge(100);
        parameter.setLoginDate(new Date(System.currentTimeMillis() - 10000000));
        parameter.setExpiryDate(new Date(System.currentTimeMillis() + 10000000));
        validationService.save(parameter);
    }
}
