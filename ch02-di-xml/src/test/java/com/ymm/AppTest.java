package com.ymm;

import static org.junit.Assert.assertTrue;

import com.ymm.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

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

    @Test
    public void test01() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("student: " + student);
    }

    @Test
    public void test02() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Date date = (Date) ctx.getBean("myDate");
        System.out.println(date);
    }

    @Test
    public void test03() {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        File file = (File) ctx.getBean("myFile");
        System.out.println(file);
    }

    @Test
    public void test04() {
        String config = "ba04/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student file = (Student) ctx.getBean("myStudent");
        System.out.println(file);
    }

    @Test
    public void test05() {
        String config = "ba05/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student file = (Student) ctx.getBean("myStudent");
        System.out.println(file);
    }

    @Test
    public void test06() {
        String config = "ba06/total.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student file = (Student) ctx.getBean("myStudent");
        System.out.println(file);
    }
}



