package com.valentine.gojekui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.valentine.gojekui.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setTitle(getString(R.string.app_name))
        binding.toolbar.setTitleTextColor(Color.WHITE)
        supportActionBar?.setDisplayShowTitleEnabled(false)

    }
}