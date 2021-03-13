package com.類別與物件.介面與抽象

interface Job {
    fun workContent()
}

abstract class Worker() {
    abstract fun getHourlyPay(): Int
    open fun showOff() {
        println("社畜")
    }
}

class ParttimeWorker : Worker(), Job {
    override fun workContent() {
        println("App")
    }

    override fun getHourlyPay(): Int {
        return 5000
    }

    override fun showOff(){
        println("工讀生")
    }
}

fun ParttimeWorker.getPayByOneDay() = getHourlyPay() *8
fun main() {
    val p = ParttimeWorker()
    p.showOff()
    p.workContent()
    println(p.getHourlyPay() *8)
    println(p.getPayByOneDay())
}