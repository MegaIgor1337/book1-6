package org.example.task4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            Bean bean = (Bean) context.getBean("Bean");
            System.out.println(bean.getList());
        }
    }
}
