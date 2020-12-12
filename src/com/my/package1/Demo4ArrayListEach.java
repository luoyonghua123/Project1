package com.my.package1;

import java.util.ArrayList;

public class Demo4ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("迪丽热巴");
        list.add("李小龙");
        list.add("肖战");
        list.add("蔡徐坤");
        //遍历
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
