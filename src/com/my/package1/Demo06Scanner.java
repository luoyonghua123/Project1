package com.my.package1;

import java.util.Scanner;

public class Demo06Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的名字：");
        String uname=scanner.nextLine();
        System.out.println("用户姓名"+uname);
    }
}
