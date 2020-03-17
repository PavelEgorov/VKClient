package com.egorovsoft.vkclient.ui.activitys

import android.os.Bundle
import com.egorovsoft.vkclient.R
import com.egorovsoft.vkclient.presenter.MainPresenter
import com.egorovsoft.vkclient.view.MainFragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override val layoutRes = R.layout.activity_main
    override val presenter = MainPresenter(this)

    private lateinit var fragmentAdapter : MainFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fragmentAdapter = MainFragmentAdapter(supportFragmentManager, presenter)
        viewpager.adapter   =   fragmentAdapter

        tabs.setupWithViewPager(viewpager)
    }
}
