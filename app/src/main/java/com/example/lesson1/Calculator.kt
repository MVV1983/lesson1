package com.example.lesson1

class Calculator() {

    fun sum(firstNum: Int, secondNum: Int): Int = firstNum + secondNum

    fun subtraction(firstNum: Int, secondNum: Int): Int = firstNum - secondNum

    fun multiply(firstNum: Int, secondNum: Int): Int = firstNum * secondNum

    fun devide(firstNum: Int, secondNum: Int): Int =
            if (secondNum != 0) {
                firstNum / secondNum
            } else {
                throw IllegalArgumentException("Second number cannot be zero")
            }

}