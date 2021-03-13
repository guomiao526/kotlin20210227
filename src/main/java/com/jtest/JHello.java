package com.jtest;

import com.基礎語法.KHello;

public class JHello {
    public void callMe() {
        System.out.println("0921-443-123");
    }
    public static void main(String[] args) {
        System.out.println("Hello Java");
        //呼叫 callMe()
        JHello j = new JHello();
        j.callMe();
        //呼叫 KHello 的 callMe
        KHello k = new KHello();
        k.callMe();
    }

}
