package com.example.lesson1

import org.junit.Test
import org.junit.Assert.assertEquals


class CalculatorTest {

    @Test
    fun `When put 2 and 2 Except 4`() {
        val calculator = Calculator()

        val value = calculator.sum(2, 2)
        val except = 4

        assertEquals(except, value)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `When secondNum 0`() {
        val calculator = Calculator()
        calculator.devide(4, 0)
    }

    @Test
    fun`Put 5 and subtract 3 excpect 2`(){
        val calculator = Calculator()
        calculator.subtraction(5, 3)
    }

    @Test
    fun`Put 5 multiply 3 excpect 15`(){
        val calculator = Calculator()
        calculator.multiply(5, 3)
    }
}