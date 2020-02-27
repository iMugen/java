package com.test;

/**
 * @author Daniel Liu 2020/2/27 7:55
 */
public class AccountT {
    private Integer id;

    private String name;

    private float money;

    public Integer getId() {
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

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "AccountT{" + "id=" + id + ", name='" + name + '\'' + ", money=" + money + '}';
    }
}