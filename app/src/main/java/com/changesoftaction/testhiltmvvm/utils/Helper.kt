package com.changesoftaction.testhiltmvvm.utils

class Helper {

    fun stringContainEmail(email: String): Boolean {
        if (email.contains("@")) {
            return true
        }
        return false
    }
}