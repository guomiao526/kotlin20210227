package com.基礎語法

data class Account(val name: String) {
    var balance: Int = 0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}

fun main() {
    val act = Account("John")
    println(act.balance)
    act.balance = 100
    println(act.balance)
    println(act)

}
