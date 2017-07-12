package com.jingoal.base

interface IContextLifecycle {

    data class ViewAndPresenter(val res: Int, val view: IView<in IPresenter>?, val presenter: IPresenter?)

    /**
     * view初始化已完成会调用此方法
     */
    fun viewStart()

    /**
     * 绑定view和presenter
     *
     */
    fun bindView(): ViewAndPresenter

}