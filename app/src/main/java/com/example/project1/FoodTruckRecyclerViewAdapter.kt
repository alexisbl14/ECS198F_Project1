package com.example.project1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodTruckRecyclerViewAdapter(private var foodTrucks: List<FoodTruck>)
    : RecyclerView.Adapter<FoodTruckRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.foodTruckNameText)
        val locationTextView: TextView = itemView.findViewById(R.id.locationText)
        val timeTextView: TextView = itemView.findViewById(R.id.timeText)
        val truckImageView: ImageView = itemView.findViewById(R.id.foodTruckImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.food_truck_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodTruck = foodTrucks[position]

        holder.apply {
            nameTextView.text = foodTruck.foodTruckName
            locationTextView.text = foodTruck.location
            timeTextView.text = foodTruck.timeOpen
            truckImageView.setImageResource(foodTruck.foodTruckImage)
        }

        holder.itemView.setOnClickListener {
            var intent = Intent(it.context, FoodTruckDetail::class.java)
            intent.putExtra("Name", foodTruck.foodTruckName)
            intent.putExtra("Description", foodTruck.foodTruckDescription)
            intent.putExtra("Time", foodTruck.timeOpen)
            intent.putExtra("Location", foodTruck.location)
            intent.putExtra("Website", foodTruck.website)
            intent.putExtra("Image", foodTruck.foodTruckImage)
            it.context.startActivity(intent);
        }
    }

    override fun getItemCount() = foodTrucks.size
}
