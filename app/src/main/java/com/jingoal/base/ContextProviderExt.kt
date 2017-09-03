package com.jingoal.base

fun IContextProvider.bindVandP(res: Int, view: IView<out IPresenter>? = null, presenter: IPresenter? = null): IContextLifecycle.ViewAndPresenter {
    @Suppress("UNCHECKED_CAST")
    return IContextLifecycle.ViewAndPresenter(res, view, presenter)
}
