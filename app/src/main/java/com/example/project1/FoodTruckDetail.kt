package com.example.project1

import android.content.Intent
import android.net.Uri
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

        val currentFoodTruck = intent.getParcelableExtra<FoodTruck>("Name")
        binding.foodImageView.setImageResource(currentFoodTruck!!.foodTruckImage)
        binding.locationTextView.text = currentFoodTruck!!.location
        binding.timeTextView.text = currentFoodTruck!!.timeOpen
        binding.descriptionTextView.text = currentFoodTruck!!.foodTruckDescription


        binding.linkTextView.setOnClickListener {
            val uri = Uri.parse(currentFoodTruck!!.website)
            val intentWebsite = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intentWebsite)
        }
    }
}