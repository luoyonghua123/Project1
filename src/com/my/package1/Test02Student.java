package com.my.package1;

public class Test02Student {
    private String name;
    private  int age;

    public Test02Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Test02Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
