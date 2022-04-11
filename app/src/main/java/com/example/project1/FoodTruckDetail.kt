package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project1.databinding.ActivityFoodTruckDetailBinding

class FoodTruckDetail : AppCompatActivity() {
    private lateinit var binding: ActivityFoodTruckDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodTruckDetailBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }
}