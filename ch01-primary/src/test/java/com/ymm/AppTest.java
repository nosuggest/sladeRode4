package com.ymm;

import static org.junit.Assert.assertTrue;

import com.ymm.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /*
    * 测试方法，使用junit
    * 使用@Test
    * */
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ctx.getBean("someService");
        service.doSome();
    }

    @Test
    public void test02() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service1 = (SomeService) ctx.getBean("someService1");
        SomeService service2 = (SomeService) ctx.getBean("someService1");
        if (service1.equals(service2)){
            System.out.println("单例模式");
        }
        SomeService service3 = (SomeService) ctx.getBean("someService2");
        if (service1.equals(service3)){
            System.out.println("单例模式");
        }else {
            System.out.println("原型模式");
        }

    }


}

