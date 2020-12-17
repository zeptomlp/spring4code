package com.albers.demo1;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/12/14
 * @description:
 */
public class test2 {
    public synchronized void m1(){
        System.out.println("外");
        m2();
    }public synchronized void m2(){
        System.out.println("中");
        m3();
    }public synchronized void m3(){
        System.out.println("内");
    }

    public static void main(String[] args) {
       new test2().m1();
    }
}
