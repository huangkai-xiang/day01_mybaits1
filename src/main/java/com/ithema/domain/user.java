package com.ithema.domain;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class user implements Serializable{
    private Integer id;
    private String name;
    private Integer age;
    private Integer score;
    private Date birthday;
    private Timestamp insert_time;

    public Integer getId() {
        System.out.println("12344545");
        System.out.println("push test");
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(Timestamp insert_time) {
        this.insert_time = insert_time;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", birthday=" + birthday +
                ", insert_time=" + insert_time +
                '}';
    }
}
