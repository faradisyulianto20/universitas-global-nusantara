package com.example.universitas_global_nusantara

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import androidx.viewpager2.widget.ViewPager2
import com.example.universitas_global_nusantara.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_splash_screen)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val adapter = SplashScreenPagerAdapter(this)
        viewPager.adapter = adapter
   }
}