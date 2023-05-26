package org.example.task2;

import org.example.task1.MyBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            MyBean1 myBean1 = (MyBean1) context.getBean("myBean1");
            MyBean2 myBean2 = (MyBean2) context.getBean("myBean2");
            myBean2.doSomething();

            myBean1.sayNice();
        }
    }
}
