package com.sun.dpMain.creationalPattern.abstractFactory2;
/**
 * 用户表
 * @author jh
 *
 */
public class User {
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    private int uid;
    private String uname;
}
