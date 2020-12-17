package com.albers.demo1;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/12/14
 * @description:
 */
public class test {
    static Object obj = new Object();

    public static void m1() {
        new Thread(() -> {
            synchronized (obj) {
                System.out.println(Thread.currentThread().getName() + "外层调用");
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + "中层调用");
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "内外层调用");
                    }
                }
            }
        }, "t1").start();
    }

    public static void main(String[] args) {
        m1();
    }
}
