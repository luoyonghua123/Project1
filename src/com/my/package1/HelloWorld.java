package com.my.package1;

public class HelloWorld {
    public static  void main(String[] args){
//       int []array=new int[3];
        Person[]array=new Person[3];
        System.out.println(array[0]);
        Person one=new Person("迪丽热巴",20);
        Person two=new Person("古力娜扎",28);
        Person three=new Person("马尔扎哈",20);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        //输出的是地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());//古力娜扎
    }
}
