package com.類別與物件.列舉與印章

enum class Coin(val value: Int) { //enum -> 列舉
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUATER(25)
}

fun main() {
    val coin = Coin.NICKLE
    println(coin.value)
}