package com.ymm.ba03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by slade on 2019/9/28.
 */
@Component("mySchool")
public class School {
    @Value("JD")
    private String name;
    @Value("shangHai")
    private String Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
