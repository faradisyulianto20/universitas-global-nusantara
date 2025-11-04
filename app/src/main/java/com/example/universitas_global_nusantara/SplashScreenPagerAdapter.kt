package com.example.universitas_global_nusantara

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class SplashScreenPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 4 // total halaman splash

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Splash1Fragment()
            1 -> Splash2Fragment()
            2 -> Splash3Fragment()
            else -> Splash4Fragment()
        }
    }
}