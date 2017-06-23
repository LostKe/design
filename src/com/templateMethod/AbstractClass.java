package com.templateMethod;

/**
 * Created by youx on 2017-06-23.
 */
public abstract class AbstractClass {
    /**
     * 一些抽象行为，放到子类去实现
     */
    public abstract void doSomething_a();
    public abstract void doSomething_b();

    /**
     * 模版方法，给出逻辑的骨架，而逻辑的组成是一些相应的抽象操作，他们都推迟到子类去实现
     */
    public void play(){
        doSomething_a();
        System.out.println("执行play方法");
        doSomething_b();
    }
}
