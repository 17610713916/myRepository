package com.mozat.bean;

public class User {

    private Integer id;
    private String name;
    private Integer income;
    private double height;

    public User(){
      super();
    }

    public User(Integer id, String name, Integer income, double height) {
        this.id = id;
        this.name = name;
        this.income = income;
        this.height = height;
    }

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

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
