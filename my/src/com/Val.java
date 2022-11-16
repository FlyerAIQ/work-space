package com;

//分别定义相同的局部变量与成员变量；当名称相同时成员变量被隐藏
public class Val {
    static int times = 3;

    public static void main(String[] args) {
        int times = 4;
        System.out.println("times的值为："+times);
    }
}
