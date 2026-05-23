package com.foodguardai.app

class LoginScreen {

    fun login(
        email: String,
        password: String
    ): Boolean {

        return email.isNotEmpty()
                && password.isNotEmpty()
    }
}
