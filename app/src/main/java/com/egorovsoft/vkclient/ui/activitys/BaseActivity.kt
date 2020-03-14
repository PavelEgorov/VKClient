package com.egorovsoft.vkclient.ui.activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.egorovsoft.vkclient.presenter.MainPresenter
import com.egorovsoft.vkclient.view.MainView

abstract class BaseActivity: AppCompatActivity(), MainView {
    abstract val presenter:MainPresenter
    abstract val layoutRes: Int?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutRes?.let { setContentView(it) }
    }

    final override fun getStringResurceById(id: Int): String {
        return getString(id)
    }
}