package com.jingoal.base

import android.content.Context

interface IContextProvider : IContextLifecycle{
    fun getContext(): Context?
}