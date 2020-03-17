package com.egorovsoft.vkclient.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.egorovsoft.vkclient.R

abstract class BaseFragment: Fragment() {
    abstract val title:String
    abstract val layout:Int?

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        layout?.let { return inflater.inflate(it, container, false) }

        return inflater.inflate(R.layout.fragment_error, container, false)
    }
}