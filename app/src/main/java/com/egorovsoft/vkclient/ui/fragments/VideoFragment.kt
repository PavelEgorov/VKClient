package com.egorovsoft.vkclient.ui.fragments

import com.egorovsoft.vkclient.R
import com.egorovsoft.vkclient.presenter.MainPresenter

class VideoFragment(val presenter: MainPresenter) : BaseFragment() {

    override val title = presenter.getStringResurce(R.string.namePageVideo)
    override val layout = R.layout.fragment_video

}
