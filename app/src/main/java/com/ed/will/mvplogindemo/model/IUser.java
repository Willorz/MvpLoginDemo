package com.ed.will.mvplogindemo.model;

/**
 * Created by will on 17-10-23.
 */

public interface IUser {
    String getName();
    String getPasswd();

    int checkUserValidity(String name,String passwd);
}
