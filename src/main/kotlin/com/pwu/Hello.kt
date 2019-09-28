package com.pwu

fun main(args: Array<String>) {
    val h = Human()
    h.Hello()
}

class Human() {
    fun Hello() {
        println("Hello Kotlin");
    }
}