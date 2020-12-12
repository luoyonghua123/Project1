package com.my.package1;

import java.util.ArrayList;
import java.util.Random;
/*
    题目。
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集含当中。要求使用自定义的方法来实现筛选。
分析;
1-需要创建一个大集合，用来存储int数字:<Integer>2．随机数字就用Random nextInt
3．循环20次,把随机数字放入大集合:for循环、add方法
4、定义一个方法，用来进行筛选。
筛选:根据大集合,筛选符合要求的元素，得到小集合。
三要素
返回值类型。Arraylist小集合(里面元素个数不确定)
方法名称: getSmalllist
参数列表。Arraylist大集合(装着20个随机数字)
5.判断(if）是偶数。num % 2== 0
6.如果是偶数，就放到小集合当中,否则不放。

*/
public class Test04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer>listA=new ArrayList<>();
//        ArrayList<Integer>listB=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i <20 ; i++) {
            int num=r.nextInt(100)+1;
            listA.add(num);
        }
        System.out.println(listA);
       ArrayList<Integer>smallList= getSmalllist(listA);
        System.out.println("偶数个数为"+ smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    //这个函数接收大集合参数 返回小集合
    public static ArrayList<Integer> getSmalllist(ArrayList<Integer>listA){
        ArrayList<Integer>listB=new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            int num=listA.get(i);
            if(num%2==0){
                listB.add(num);
            }
        }
        return listB;
    }
}
