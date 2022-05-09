package com.alatai.entity;

import java.util.Date;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/12 15:00
 */
public class Student {

    private Long id;
    private String name;
    private Date birthDate;
    private String remark;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
