package com.jingoal.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment : Fragment(), IContextProvider {

    var viewAndPresenter: IContextLifecycle.ViewAndPresenter? = null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        viewAndPresenter = bindView()
        viewAndPresenter?.view?.setPresenter(viewAndPresenter?.presenter)
        return inflater!!.inflate(viewAndPresenter!!.res, null)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewStart()
    }

    override fun getContext(): Context? = activity

}