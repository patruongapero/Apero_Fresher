package com.example.phamtruong.haui.hit.myapplication.activities

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.phamtruong.haui.hit.myapplication.R
import com.example.phamtruong.haui.hit.myapplication.adapters.MyAdapter
import com.facebook.common.util.UriUtil
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.material.tabs.TabLayout
import java.lang.String

class MainActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Fresco.initialize(this)

        var simpleDraweeView : SimpleDraweeView = findViewById(R.id.simpleDraweeView)
        val uri = Uri.Builder()
            .scheme(UriUtil.LOCAL_RESOURCE_SCHEME)
            .path(String.valueOf(R.drawable.avatar))
            .build()
        simpleDraweeView?.setImageURI(uri)

        tabLayout = findViewById<TabLayout>(R.id.tab)
        viewPager = findViewById<ViewPager>(R.id.vpg)

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Bulletin"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Activities"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("MMember"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Pendings"))
        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = MyAdapter(this, supportFragmentManager, tabLayout!!.tabCount)
        viewPager!!.adapter = adapter

        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager!!.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }

}