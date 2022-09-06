package com.fan.dubbo.validation;


import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

public class ValidationParameter implements Serializable {

    private static final long serialVersionUID = 8465104156840297649L;

    @NotNull
    @Size(min = 2,max = 20)
    private String name;

    @Min(18L)
    @Max(100L)
    private int age;

    @Past
    private Date loginDate;

    @Future
    private Date expiryDate;

    public ValidationParameter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ValidationParameter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", loginDate=" + loginDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
