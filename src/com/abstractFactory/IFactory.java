package com.abstractFactory;

/**
 * Created by youx on 2017-06-26.
 */
public interface IFactory {
    User createUser();
    IUser loadDevice();
}
