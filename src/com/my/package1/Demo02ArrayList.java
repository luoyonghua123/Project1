package com.my.package1;

import java.util.ArrayList;

/*
* 数组的长度不可以改变
* 而arraylist可以改变
*对于ArrayList来说，有一个尖括号<E>代表泛型
* 泛型也就是装在集合当中的所以元素，全部都是统一的什么类型
* 泛型只能是引用类型，不能是基础类型
* 注意事项：
* 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
* 如果内容为空，得到空的中括号：[]
**/
public class Demo02ArrayList {
    public static void main(String[] args) {
//        创建了一个ArrayList集合，集合的名称是list，里面装的全部都是String字符串类型的数据
//        备注：从jdk1.7开始右侧的尖括号里面都不用写内容，但是<>本身还是要写
        ArrayList<String>list=new ArrayList<>();
        System.out.println(list);//[]
        //向集合中添加数据 add方法
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        list.add("古力拉扎");
        list.add("马尔扎哈");
        System.out.println(list);

    }
}
