package com.jingoal.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


abstract class BaseActivity : AppCompatActivity(), IContextProvider {

    var viewAndPresenter: IContextLifecycle.ViewAndPresenter? = null

    override fun getContext(): Context? = this


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewAndPresenter = bindView()
        viewAndPresenter?.view?.setPresenter(viewAndPresenter?.presenter)
        setContentView(viewAndPresenter!!.res)
        viewStart()
    }

}