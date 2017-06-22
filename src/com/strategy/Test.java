package com.strategy;

/**
 * Created by zhangshuqing on 2017/6/22.
 */
public class Test {


    public static void main(String[] args) {
        ConcreateA a=new ConcreateA();
        ConcreateB b=new ConcreateB();
        ConContext con=new ConContext(a);
        con.contextInterface();
    }




}
