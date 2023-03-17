package com.challenge3.food_mvvm.ui.detail.player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.challenge3.food_mvvm.R
import com.challenge3.food_mvvm.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

        }
    }
}