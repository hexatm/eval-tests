package com.hexatm.eval

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Assert
import org.junit.Test

class UserUnitTest {

    private var users : MutableList<User> = mutableListOf()

    @Test
    fun addUser() {
        users?.add(User(1, "Akumu", 32))
        Assert.assertEquals(1,users!!.size)
    }

    @Test
    fun deleteUser() {
        users?.remove(User(1, "Akumu", 32))
        Assert.assertEquals(0, users!!.size)
    }

    @Test
    fun updateUser() {
        Assert.assertEquals(1,users!!.size)
        val user = users!![0]
        user.name = "fgds"
        Assert.assertEquals("Akumu", users!![0].name)
    }
}