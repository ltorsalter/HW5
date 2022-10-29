package com.example.hw_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity","onCreate")
        val adapter = ViewPagerAdapter(supportFragmentManager)
        findViewById<ViewPager>(R.id.viewPager).adapter=adapter
    }
    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity","onRestart")
    }
    override fun onStart() {
        super.onStart()
        Log.e("MainActivity","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("MainActivity","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy")
    }
}

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    //回傳對應位置的 Fragment，決定頁面的呈現順序
    override fun getItem(position: Int) = when(position) {
        0 -> Fragment_first() //第一頁要呈現的 Fragment
        1 -> Fragment_second() //第二頁要呈現的 Fragment
        else -> Fragment_third() //第三頁要呈現的 Fragment
    }
    //回傳 Fragment 頁數
    override fun getCount() = 3
}