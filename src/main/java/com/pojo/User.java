package com.pojo;

public class User {
    private String num;
    private String pwd;
    private String name;
    private int type;

    public User(String num, String pwd, String name, int type) {
        this.num = num;
        this.pwd = pwd;
        this.name = name;
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "num='" + num + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
