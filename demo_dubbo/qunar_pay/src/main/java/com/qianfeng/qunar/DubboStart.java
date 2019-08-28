package com.qianfeng.qunar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboStart {
    /*
    * 启动dubbo
    * */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        applicationContext.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
