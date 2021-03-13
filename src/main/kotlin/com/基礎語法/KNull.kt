package com.基礎語法

fun main(args: Array<String>) {
    val chinese: Int? = null
    val english: Int? = 90
    val math: Int? = 80
    //若沒考放入 null, 計算總分的時候已0分計算之
    //請計算總分
    var sum = (chinese ?:0) + (english ?: 0) + (math ?:0)
    println(sum)
    var sum2 = chinese?.plus(english?:0) ?:0 // 我今天有國文才要加英文
    println(sum2)

}