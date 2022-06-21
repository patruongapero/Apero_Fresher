package com.example.phamtruong.haui.hit.buoi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val host = NavHostFragment.create(R.navigation.navigation_login)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, host).setPrimaryNavigationFragment(host).commit()
    }
}