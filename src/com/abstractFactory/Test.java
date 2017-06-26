package com.abstractFactory;

/**
 * Created by youx on 2017-06-26.
 */
public class Test {


    public static void main(String[] args) {
        User user=new User();
        IFactory factory=SQLServerFactory.getInstance();
        factory.createUser();

    }
}
