package com.tistory.mybstory.basedaggerproject.base.ui

import android.content.Context
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection

class BaseFragment : Fragment()  {

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

}