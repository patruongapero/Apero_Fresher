package com.example.phamtruong.haui.hit.myapplication.adapters


import android.content.Context;
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.phamtruong.haui.hit.myapplication.fragments.BulletinFragment

class MyAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return BulletinFragment()
            }
            1 -> {
                return BulletinFragment()
            }
            2 -> {
                return BulletinFragment()
            }
            3 -> {
                return BulletinFragment()
            }
            else -> return BulletinFragment()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}