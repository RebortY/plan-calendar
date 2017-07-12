package com.jingoal

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.util.Log

class MainAdapter : FragmentStatePagerAdapter {

    var items: Map<Int, String>
    var itemsTitle : List<String>

    constructor(fm: FragmentManager?) : super(fm) {
        items = mapOf()
        itemsTitle = emptyList()
    }

    constructor(fm: FragmentManager?, array: Map<Int, String>) : super(fm) {
        Log.v("constructor ", "${array.size}")
        items = array
        itemsTitle = array.map { it.value }
        Log.v("constructor items", "${items.size}")
    }


    override fun getItem(position: Int): Fragment? {
        val fragment = PlusOneFragment.newInstance(itemsTitle[position])
        return fragment
    }

    override fun getCount(): Int {
        Log.v("adapter getCount ", "${items.size}")
        return items.size
    }

}