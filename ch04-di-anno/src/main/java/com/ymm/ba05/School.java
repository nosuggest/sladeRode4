package com.ymm.ba05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by slade on 2019/9/28.
 */
@Component("myFirstSchool")
public class School {
    @Value("VIVO")
    private String name;
    @Value("NanJing")
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
