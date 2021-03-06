package com.ktest

//複合元素集合
fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf<Person>(
        Person("John", 18),
        Person("Mary", 20),
        Person("Helen", 19)
    )
    //請問誰年紀最大?
    println(people.maxByOrNull { it.age })
    //請問平均幾歲
    println(people.stream().mapToInt(Person::age).average().asDouble)
}