package com.linyz.a01;

public class User {
    private String name;
    private String passwd;
    private String sfz;
    private String phoneNum;

    public User() {
    }

    public User(String name, String passwd, String sfz, String phoneNum) {
        this.name = name;
        this.passwd = passwd;
        this.sfz = sfz;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getphoneNum() {
        return phoneNum;
    }

    public void setphoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
