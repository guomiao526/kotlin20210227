package com.類別與物件.類別成員與SingleTon

import java.util.*

/*
* class -> 可創建許多物件
* object -> 單例
* 以下為例: 如果是class 則會創立多個物件.則印出的數字不同
* object 只會創建單一物件 故印出的數字相同*/
object  KSingleTon {
    private var num: Int = 0

    init {
        num = Random().nextInt(100)
    }

    // fun getNum(): Int = this.num
    fun getNum(): Int{
        return this.num
    }
}

fun main() {
    val a1 = KSingleTon
    println(a1.getNum())
    val a2 = KSingleTon
    println(a2.getNum())
}