package com.egorovsoft.vkclient.ui.fragments

import com.egorovsoft.vkclient.R
import com.egorovsoft.vkclient.presenter.MainPresenter

class MusicFragment(val presenter: MainPresenter) : BaseFragment() {

    override val title = presenter.getStringResurce(R.string.namePageMusic)
    override val layout = R.layout.fragment_music

}
