package com.changesoftaction.testhiltmvvm.utils

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setup() {
        helper = Helper()
        println("Setup now")
    }

    @After
    fun completed() {
        println("Done Test")
    }

    @Test
    fun stringContainEmail() {


        val result = helper.stringContainEmail("@")

        assertEquals(true, result)

    }

    @Test
    fun checkIfEmpty() {

        val result = helper.stringContainEmail("")

        assertEquals(false, result)

    }
}