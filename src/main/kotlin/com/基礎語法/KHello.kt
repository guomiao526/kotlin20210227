package com.基礎語法

import com.jtest.JHello

class KHello {
    fun callMe() {
        print("pc@school.com")
    }
}

fun main(args: Array<String>) {
    println("Hello Kotlin")
    Thread.sleep(1000)
    println("Hello Kotlin")
    Thread.sleep(1000)
    println("Hello Kotlin")
    Thread.sleep(1000)
    //呼叫JHello 的 callMe
    val j = JHello()
    j.callMe()
    val k = KHello()
    k.callMe()
}