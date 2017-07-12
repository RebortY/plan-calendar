package com.jingoal

import android.os.Bundle
import android.support.v4.app.Fragment
import com.jingoal.base.BaseFragment
import com.jingoal.base.IContextLifecycle
import com.jingoal.base.bindVandP
import kotlinx.android.synthetic.main.fragment_plus_one.*

class PlusOneFragment : BaseFragment() {
    private var mParam1: String? = null
    private var mParam2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
            mParam2 = arguments.getString(ARG_PARAM2)
        }
    }

    override fun viewStart() {
        text?.text = mParam1
    }

    override fun bindView(): IContextLifecycle.ViewAndPresenter {
        return bindVandP(R.layout.fragment_plus_one)
    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.

         * @param param1 Parameter 1.
         * *
         * @param param2 Parameter 2.
         * *
         * @return A new instance of fragment PlusOneFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String? = null, param2: String? = null): Fragment {
            val fragment = PlusOneFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
