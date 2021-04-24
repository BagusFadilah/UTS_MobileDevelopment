package uts.bagus.mobile.activity.login

import uts.bagus.mobile.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}