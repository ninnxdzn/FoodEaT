package com.example.hell.onboard

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


// NOT A INNER CLASS OR PRIVATE

class ViewPagerAdapter(
    list: ArrayList<Fragment>,
    fm : FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle){

    // fragmentlist is important to create the slides screen (dont forgot)

    private val fragmentList: ArrayList<Fragment> = list
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    // to give it a position

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}