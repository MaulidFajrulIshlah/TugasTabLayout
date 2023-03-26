package com.geminiboy.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.geminiboy.tablayout.fragment.FavoritFragment
import com.geminiboy.tablayout.fragment.HomeFragment
import com.geminiboy.tablayout.fragment.SettingFragment
import com.geminiboy.tablayout.fragment.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        var tabs = findViewById<TabLayout>(R.id.tabs)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoritFragment(), "Favorit")
        adapter.addFragment(SettingFragment(), "Setting")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.baseline_settings_24)

    }

}