package com

fun main() {
    //集合 Set(集合內容不會重複), List(集合內容可以重複), Map
    val set = hashSetOf<Int>(1, 5, 2, 7, 6, 3)
    val list = arrayListOf<Int>(1, 5, 7, 3)
    val map = hashMapOf<Int, String>(
        1 to "One", 5 to "five", 7 to "seven", 3 to "three"
    )
    println(set)
    println(list)
    println(map)

    println(set.max())
    println(set.maxOrNull())

    val nums = hashSetOf<Int>(10, 42, 5, 18) // 除以 3 的餘數(1,0,2,1)
    //set 除以3的餘數 最大值
    println(nums.maxByOrNull { n ->n % 3 })
    //set 除以3的餘數 最小值
    println(nums.minByOrNull { it % 3 }) // it = 裡面每一個值

    val set2 = hashSetOf<Int>(1, 5, 2, 7, 6, 3)
    //set 求出偶數的最大值
    println(set2.filter { it % 2 == 0 }.maxOrNull())
    //println(set2.filter {n -> n % 2 == 0 }.maxOrNull())

    //動動腦 - 請問誰的名字最長
    //使用 maxWithOrNull
    val names = hashSetOf<String>("Helen","John","Jackson","Anita")
    println(names.maxByOrNull { it.length })
    println(names.maxWithOrNull(compareBy(){it.length }))
    //動動腦 - 請問誰的名字最短
    //使用 minWithOrNull
    println(names.minWithOrNull(compareBy(){it.length}))
}