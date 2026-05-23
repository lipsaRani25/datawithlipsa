package com.foodguardai.viewmodel

class LoginViewModel {

    fun validateUser(
        email: String,
        password: String
    ): Boolean {

        return email.contains("@")
                && password.length >= 6
    }
}
