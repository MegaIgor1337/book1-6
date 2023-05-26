package org.example.task2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean2 implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Wow");
    }

    public void init() {
        System.out.println("Good");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Yes");
    }

    public void doSomething() {
        System.out.println("MyBean2");
    }
}
