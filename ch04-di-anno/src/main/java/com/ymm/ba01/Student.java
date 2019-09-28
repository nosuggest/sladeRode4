package com.ymm.ba01;

import org.springframework.stereotype.Component;

/**
 * Created by slade on 2019/9/28.
 */
//创建student的对象，名字叫myStudent，对象存放在容器之中，默认是单例的
//等价于<bean id="myStudent" class="com.ymm.ba01.Student"/>
//    不指定对象名称，框架会给对象默认名称，默认值是类名字母小写
@Component(value = "myStudent")
/*和@Component功能相同的其他注解：
*   1、@Repository：Dao层实现类上，创建dao对象，这样的对象是访问数据库的
*   2、@Service：Service层实现类上，创建Service对象，表示业务层对象，事务功能
*   3、@Controller：处理器上，创建处理器对象，接受用户的请求
*
*   @Repository、@Service、@Controller 都能创建对象：
*       使用这三个注解，能够使业务分层
*
* */
public class Student {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
