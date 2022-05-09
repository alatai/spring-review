package com.saihou.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 22:01
 */
public class Account implements Serializable {

    private String username;
    private String password;
    private Double money;

    // 引用类型
    // private User user;

    // 集合类型
    private List<User> list;
    private Map<String, User> map;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
