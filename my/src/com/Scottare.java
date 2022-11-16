package com;

//教材38页编程训练2(员工交税判断）
public class Scottare {
    public static void main(String[] args){
        int salaryA = 4500;
        int salaryB = 5500;
        int standard = 5000;
        System.out.println("员工A的月薪为4500，员工A是否需要交税"+(standard < salaryA));
        System.out.println("员工A的月薪为4500，员工A是否需要交税"+(standard < salaryB));
    }
}
