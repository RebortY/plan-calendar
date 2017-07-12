package com.jingoal

import android.util.Log
import com.jingoal.base.IView

class MainView: IView<MainPresenter> {

    override fun setPresenter(presenter: MainPresenter?) {
        Log.v("MainView",presenter.toString())
    }

}