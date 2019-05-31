package com.smartdiscover

fun sum(a: Int, b: Int): Int {
    return a+b
}

fun printMultiple(a: Int, b: Int) {
    println(a*b)
}

fun main(args: Array<String>) {
    println(sum(2, 3))
    printMultiple(3, 8)
}