package com.ymm;

import com.ymm.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 创建Spring的配置文件，位置是在类路径的根目录之下
        String config = "applicationContext.xml";

//        创建Spring 容器，根据Spring的配置文件，使用接口的不同实现类
//        如果配置文件是在类路径（classpath），使用ClassPathXmlApplicationContext
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

//        从容器中获取对象，使用getBean(<bean>中的id)
//        Spring默认调用无参构造构造方法，如果没有，会报错
//        singleton：默认作用区域是单例的，prototype：原型作用区域，每次创建都是一个新的，还有request、session
        SomeService service = (SomeService) ctx.getBean("someService");

//        调用业务方法
        service.doSome();


        /*获取容器中的对象信息*/
//        获取对象个数
        int numbers = ctx.getBeanDefinitionCount();
        System.out.println("对象个数" + numbers);
//        获取对象名称
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}

/*
*   容器创建对象时间？
*   默认是创建容器对象时，把配置文件都创建出来，放到容器中
*
*   优点：快
*   缺点：占内存
* */