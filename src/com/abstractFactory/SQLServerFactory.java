package com.abstractFactory;

/**
 * Created by youx on 2017-06-26.
 */
public class SQLServerFactory implements  IFactory {
    static SQLServerFactory  sqlServerFactory;

    private SQLServerFactory(){

    }

    public static SQLServerFactory getInstance(){
        if(sqlServerFactory==null){
            synchronized (SQLServerFactory.class){
                if(sqlServerFactory==null){
                    sqlServerFactory=new SQLServerFactory();
                }
            }
        }
        return sqlServerFactory;
    }

    @Override
    public User createUser() {
        System.out.println("SQLServerFactory createUser");
        return null;
    }

    @Override
    public IUser loadDevice() {
        return null;
    }
}
