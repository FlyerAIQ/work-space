package com;

//教材38页编程训练1（仓库储粮计算）
public class Granary {
    public static void main(String[] args){
        final double PI= 3.14;
        int diameter = 10;
        int height = 3;
        double volume = diameter/2*diameter/2*PI*height;
        System.out.println("该粮仓的体积="+volume+"m³");
        int weight = 750;
        System.out.println("该粮仓一共可存储"+volume*weight+"千克粮食");
    }
}
