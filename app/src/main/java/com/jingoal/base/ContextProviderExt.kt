package com.jingoal.base

fun IContextProvider.bindVandP(res: Int, view: IView<*>? = null, presenter: IPresenter? = null): IContextLifecycle.ViewAndPresenter {
    @Suppress("UNCHECKED_CAST")
    return IContextLifecycle.ViewAndPresenter(res, view as IView<IPresenter>?, presenter)
}
