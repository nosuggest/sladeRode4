package com.ymm.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by slade on 2019/9/28.
 */
@Component(value = "myStudent")
public class Student {
    private String name;
    private int age;

    /*
    * 引用类型：
    * @Resources:来自jdk，可以给引用类型赋值，Spring框架支持，默认byName
    *
    * */
//    默认是byName，失败的情况下会使用byType
//    如果只想使用byName，指定bean的id(名称)
    @Resource(name = "myFirstSchool")
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    @Value("jack")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("20")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
