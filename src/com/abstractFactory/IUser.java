package com.abstractFactory;

import java.util.List;

/**
 * Created by youx on 2017-06-26.
 */
public interface  IUser {
    void insert(User user);
    List<User> queryAll();
}
