package com.quitsmoking.quitsmoking.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
    private int id;
    private String nam;
    private int age;
    private String gender;
    private int years;
    private int months;
    private int n;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNam() {
        return nam;
    }
    public void setNam(String name) {
        this.nam = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
    public int getMonths() {
        return months;
    }
    public void setMonths(int months) {
        this.months = months;
    }
    public int getN() {
        return n;
    }
    public void setN(int number) {
        this.n = number;
    }
    

    
}
