package com.abstractFactory;

/**
 * Created by youx on 2017-06-26.
 */
public class MySqlFactory implements IFactory {
    static MySqlFactory mySqlFactory;
    private  MySqlFactory(){

    }

   public static MySqlFactory getInstance(){
        if(mySqlFactory==null){
            synchronized (MySqlFactory.class){
                if(mySqlFactory==null){
                    mySqlFactory=new MySqlFactory();
                }
            }
        }
        return mySqlFactory;
   }
    @Override
    public User createUser() {
        return null;
    }

    @Override
    public IUser loadDevice() {
        return null;
    }
}
