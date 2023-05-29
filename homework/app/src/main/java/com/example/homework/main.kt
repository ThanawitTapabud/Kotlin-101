package com.example.homework

import android.graphics.drawable.shapes.Shape

fun main() {
    // Print "Hello, POKER MASTER!!
    println("Hello, POKER MASTER!!")

    // val is fixed value such as must define type
    // .to__ convert type to another type
    val number: Int = 6
    val numberB: Byte = number.toByte()
    val s: String = number.toString()
    val f: Float = number.toFloat()

    val e = 35_000_000
    val a = 1_000

    println("Number is $number, i is ${number.toByte()}, s is $s")
    println("e + a = ${e + a}") // ${value} show value in string

    val x = 10
    // var seem like val but it unfixed value
    var y = 10

    y =  11
    println("x is $x, y is $y")

    // check GPA use if-else
    val c = 78
    val aa = 75

    if (c > 80) {
        println("A")
    } else if (c in 70..79) {
        println("B")
    } else if (c in 60..69) {
        println("C")
    } else if (c in 50 .. 59) {
        println("D")
    } else {
        println("F")
    }

    // check GPA again but use switch case
    when(c) {
        in 80..100 -> println("A")
        in 70..79 -> println("B")
        in 60..69 -> println("C")
        in 50..59 -> println("D")
        else -> println("F")
    }

    // loop decrement by decrease 2 until 0
    val z = c downTo 0 step 2
    for (i in z) {
        println(i)
    }

    val shape = Shape()
    shape.draw()
    shape.area()


}

// Must Implement function in class use this interface
interface Shapable {
    fun area(): Double
}

class Shape : Shapable {
    private val vertexCount: Int = 0

    open fun draw() {
        println("draw")
    }

    override fun area(): Double {
        return  0.0
    }

    //
    companion object {
        const val STATIC_VALUE = "this is static value"
    }
}