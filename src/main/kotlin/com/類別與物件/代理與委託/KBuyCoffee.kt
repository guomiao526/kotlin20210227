package com.類別與物件.代理與委託

interface BuyCoffee {
    fun buy()
}

class Son : BuyCoffee {
    override fun buy() {
        println("兒子買咖啡")
    }
}

class Father : BuyCoffee by Son() {
    override fun buy() {
        println("爸爸叫額子買咖啡")
        Son().buy()
    }
}

fun main() {

    val f = Father()
    f.buy()
}