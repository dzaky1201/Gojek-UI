package com.dzakyhdr.gojekui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.dzakyhdr.gojekui.data.MenuAdapter
import com.dzakyhdr.gojekui.data.menu.MenuObject
import com.dzakyhdr.gojekui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setTitle(getString(R.string.app_name))
        binding.toolbar.setTitleTextColor(Color.WHITE)

//        val adapter = MenuAdapter()
//        adapter.setData(MenuObject.list)
//        binding.rvMenu.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false)
//        binding.rvMenu.adapter = adapter
//        binding.rvMenu.setHasFixedSize(true)
    }
}