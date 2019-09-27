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

}
