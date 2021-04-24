package com.example.lesson1


import org.junit.Assert
import org.junit.Test


class UserRegistratorTest {

    private val users = listOf("Igor", "Anna", "Bari")
    
    @Test
    fun `if user empty`() {
        val result = UserRegistratorForm().validatorUser("", "2123")
        Assert.assertFalse(result)
    }


}