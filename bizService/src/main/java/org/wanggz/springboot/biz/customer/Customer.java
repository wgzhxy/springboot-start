package org.wanggz.springboot.biz.customer;

public class Customer {

    /**
     * 名字
     */
    String name;
    /**
     * 昵称
     */
    String nickName;
    /**
     * 地址
     */
    String address;
    /**
     * 年龄
     */
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
