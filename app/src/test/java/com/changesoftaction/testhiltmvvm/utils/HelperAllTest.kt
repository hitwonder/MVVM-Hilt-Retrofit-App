package com.changesoftaction.testhiltmvvm.utils

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class HelperAllTest(val input: String, val expected: Boolean) {

    @Test
    fun TestAll() {
        val helper = Helper()
        val result = helper.stringContainEmail(input)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("@", true),
                arrayOf("", false),
                arrayOf("pk", false),
                arrayOf("@@", true)
            )
        }
    }
}