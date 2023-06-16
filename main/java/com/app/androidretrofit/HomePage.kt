package com.app.androidretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.androidretrofit.databinding.ActivityHomePageBinding
import com.bumptech.glide.Glide

class HomePage : AppCompatActivity() {
    lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

       var imageuri = intent.getStringExtra("IMAGE",)
           Glide.with(this)
               .load(imageuri)
               .into(binding.image)
    }
}