package com.jingoal

import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.util.Log
import com.jingoal.base.BaseActivity
import com.jingoal.base.IContextLifecycle
import com.jingoal.base.bindVandP
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {

    val items = mapOf(
            R.id.navigation_home to R.string.title_home,
            R.id.navigation_dashboard to R.string.title_dashboard,
            R.id.navigation_notifications to R.string.title_notifications
    )

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        content.currentItem = items.keys.indexOf(item.itemId)
        true
    }

    override fun bindView(): IContextLifecycle.ViewAndPresenter {
        return bindVandP(
                R.layout.activity_main,
                MainView(),
                MainPresenter()
        )
    }

    override fun viewStart() {
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        content.adapter = MainAdapter(supportFragmentManager, items.mapValues { getString(it.value) })
        content.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
                Log.v("onPageScrollStateChanged", "$state")
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                Log.v("onPageSelected", "$position")
                navigation.selectedItemId = items.keys.elementAt(position)
            }
        })
    }
}
