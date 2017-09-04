package com.jingoal.base

interface IView<in T>{

    fun setPresenter(presenter: T?)
}