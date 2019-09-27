package com.ymm.service;

/**
 * Created by slade on 2019/9/27.
 */
public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("无参构造");
    }

    @Override
    public void doSome() {
        System.out.println("SomeServiceImpl方法");
    }
}
