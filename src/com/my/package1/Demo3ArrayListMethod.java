package com.my.package1;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有：

public boolean add(E e):向集合中添加元素，参数的类型和泛型一致
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合来说，add不一定成功
public E get(int index):从集合中获取元素，参数是索引的编号，返回值就是对应位置的元素
public E remove(int index)
public int size()

*/
public class Demo3ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        System.out.println(list);
//        添加元素
        boolean success= list.add("刘岩");
        System.out.println(list);
        System.out.println("是否成功"+success);
        list.add("lyh");
        list.add("ll");
        list.add("zhz");
        System.out.println(list);
        //获取元素 索引从0开始
       String name2= list.get(2);
        System.out.println("索引为2的名字为"+name2);
        //删除元素 索引从0开始
        String removeName=list.remove(3);
        System.out.println("被删除的人的名字是"+removeName);
        //获取元素的个数
        int size=list.size();
        System.out.println("长度为"+size);
    }
}
