package com.templateMethod;

/**
 * Created by youx on 2017-06-23.
 */
public class Person extends AbstractClass {
    @Override
    public void doSomething_a() {
        System.out.println("person doSomething a");
    }

    @Override
    public void doSomething_b() {
        System.out.println("person doSomething b");
    }
}
