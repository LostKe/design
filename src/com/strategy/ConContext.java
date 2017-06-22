package com.strategy;

/**
 * Created by zhangshuqing on 2017/6/22.
 */

/**
 * 具体使用的类
 * 通过构造函数来获取不同的策略，
 */
public class ConContext {

    Strategy strategy;

    public ConContext(Strategy strategy){
        this.strategy=strategy;
    }

    public void contextInterface(){
        strategy.doSomething();
    }
}
