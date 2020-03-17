package com.egorovsoft.vkclient.ui.fragments

import com.egorovsoft.vkclient.R
import com.egorovsoft.vkclient.presenter.MainPresenter

class ProfileFragment(val presenter: MainPresenter) : BaseFragment() {

    override val title = presenter.getStringResurce(R.string.namePageProfile)
    override val layout = R.layout.fragment_profile

}
