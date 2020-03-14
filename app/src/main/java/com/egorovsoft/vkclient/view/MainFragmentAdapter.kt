package com.egorovsoft.vkclient.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.egorovsoft.vkclient.presenter.MainPresenter
import com.egorovsoft.vkclient.ui.fragments.MainFragment
import com.egorovsoft.vkclient.ui.fragments.MusicFragment
import com.egorovsoft.vkclient.ui.fragments.ProfileFragment
import com.egorovsoft.vkclient.ui.fragments.VideoFragment

class MainFragmentAdapter(fragmentManager: FragmentManager, val presenter: MainPresenter): FragmentPagerAdapter(fragmentManager) {

    val fragments = mutableListOf(
        MainFragment(presenter),
        MusicFragment(presenter),
        VideoFragment(presenter),
        ProfileFragment(presenter)
    )

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size

    override fun getPageTitle(position: Int): CharSequence? = fragments[position].title


}