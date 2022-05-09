package com.saihou.entity;

import java.io.Serializable;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 17:00
 */
public class Account implements Serializable {

    private Integer id;
    private Integer uid;
    private Integer money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}
