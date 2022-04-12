package com.example.project1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodTruck(
    var ID: Int,
    var foodTruckName: String,
    var foodTruckImage: Int,
    var location: String,
    var timeOpen: String,
    var foodTruckDescription: String,
    var website: String
):Parcelable
