package com.my.package1;
/*题目:
        自定义4个学生对象,添加到集合,并遍历。
        思路,
        1.自定义student学生类,四个部分。
        2．创建一个集合，用来存储学生对象。泛型,<Test02Student>
        3，根据类,创建4个学生对象。
        4.将4个学生对象添加到集合中:add
        5．遍历集合:for、 size、 get
 */

import java.util.ArrayList;

public class Test02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Test02Student> list=new ArrayList<>();
        Test02Student one =new Test02Student("李小龙1",30);
        Test02Student two =new Test02Student("李小龙2",40);
        Test02Student three =new Test02Student("李小龙3",50);
        Test02Student four =new Test02Student("李小龙4",60);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getName()+" "+list.get(i).getAge());
            Test02Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+"，年龄"+stu.getAge());
        }
    }
}
