package com.函式呼叫.集合聚合操作

fun main() {
    var numbers = listOf(5, 42, 10, 4)
    println("Count:${numbers.count()}")
    println("Sum:${numbers.sum()}")
    println("Avg: ${numbers.average()}")
    println("Max: ${numbers.max()}")
    println("Min: ${numbers.min()}")
    println("Max: ${numbers.maxByOrNull { it }}")
    println("Min: ${numbers.minByOrNull { it }}")
    //numbers 中 %3 的最小值 利用minBy
    //(5,42,10,4) %3 (2,0,1,1)
    //42
    println("%3 min: ${numbers.minByOrNull { it % 3 }}")

    val strings = listOf("one", "two", "three", "four")
    val longestString = strings.maxByOrNull { it.length }
    println("longst string = $longestString")
    //利用 maxwith
    val longstString = strings.maxWithOrNull(compareBy { it.length })
    println("longst string = $longestString")

}