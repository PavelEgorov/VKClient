package com.egorovsoft.vkclient.ui.fragments

import com.egorovsoft.vkclient.R
import com.egorovsoft.vkclient.presenter.MainPresenter

class MainFragment(presenter: MainPresenter) : BaseFragment() {

    override val title = presenter.getStringResurce(R.string.namePageMain)
    override val layout = R.layout.fragment_main

}
