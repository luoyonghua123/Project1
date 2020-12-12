package com.my.package1.com.java300;

public class SxtStu {
    int id;
    String name;
    int age;
    Computer comp;
    void study(){
        System.out.println("我在学习"+comp.brand);
    }
    void play(){
        System.out.println("我在玩游戏 王者荣耀");
    }
    public SxtStu() {
    }

    public static void main(String[] args) {
        SxtStu stu=new SxtStu();
        stu.id=110;
        stu.age=18;
        stu.name="lyh";
        Computer c1=new Computer();
        c1.brand="联想";
        stu.comp=c1;

        stu.study();
        stu.play();


    }

}
class Computer{
     String brand;
}
