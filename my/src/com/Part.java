package com;

//3.5例子：申明常量只能变动一次
public class Part {
    //申明常量PI,此时如不对PI进行赋值，则会出现错误提示
    static final double PI = 3.14;
    static int age = 23;

    public static void main(String[] args){
        final int number;
        number = 1235;
        age = 22;
        //常量进行二次赋值，取消注释时会报错
        //number = 1236;
        System.out.println("常量PI的值为："+PI);
        System.out.println("赋值后number的值为："+number);
        System.out.println("int型变量age的值为"+age);
    }
}
