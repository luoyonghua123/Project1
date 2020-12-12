package com.my.package1;

public class Demo05FunctionReturn {
    public static void main(String[] args) {
//        int sum=add(1,0);
//        System.out.println(sum);
        add(1);
        System.out.println(sum);
    }
    public  static  int sum=0;
    public static void add(int num){
        if(num<=100){
            sum+=num;
            add(num+1);
        }
//        System.out.println(sum);

    }
}
