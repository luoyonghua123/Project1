package com.my.package1;

import java.util.ArrayList;
/*
    如果希望向集合ArrayList当中存储基本数据类型 必须使用基本类型对应得"包装类"
    基本类型 包装类(引用类型 包装类都位于java.lang下)
    byte    Byte
    short   Short
    int     Integer 【特殊】
    long    Long
    float   Float
    double  Double
    boolean Boolean
    char    Character 【特殊】
*/
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList <String>list=new ArrayList<>();
        //错误写法 泛型只能是引用类型 不能是基本类型
       //ArrayList <int>listB=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(list2);
        int num=list2.get(2);
    }
}
