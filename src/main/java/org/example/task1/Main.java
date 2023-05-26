package org.example.task1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            MyBean myBean = (MyBean) context.getBean("myBean");

            myBean.sayHahaha();
        }
    }
}