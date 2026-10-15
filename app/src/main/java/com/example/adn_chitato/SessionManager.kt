package com.example.adn_chitato

import android.content.Context

class SessionManager(context: Context) {

    private val prefs = context.getSharedPreferences("ADN_CHITATO_PREFS", Context.MODE_PRIVATE)

    companion object {
        private const val KEY_IS_LOGIN = "isLogin"
        private const val KEY_USERNAME = "username"
    }

    fun setLogin(isLogin: Boolean, username: String = "") {
        val editor = prefs.edit()
        editor.putBoolean(KEY_IS_LOGIN, isLogin)
        editor.putString(KEY_USERNAME, username)
        editor.apply()
    }

    fun isLoggedIn(): Boolean {
        return prefs.getBoolean(KEY_IS_LOGIN, false)
    }

    fun getUsername(): String {
        return prefs.getString(KEY_USERNAME, "") ?: ""
    }

    fun logout() {
        val editor = prefs.edit()
        editor.clear()
        editor.apply()
    }
}