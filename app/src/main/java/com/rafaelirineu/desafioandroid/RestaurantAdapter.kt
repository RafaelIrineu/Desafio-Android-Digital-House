package com.rafaelirineu.desafioandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RestaurantAdapter(
    private val dataSet: List<Restaurant>,
    private val listener: (Restaurant) -> Unit
) :
    RecyclerView.Adapter<RestaurantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)

        return RestaurantViewHolder(view)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bind(dataSet[position].nome, dataSet[position].address, dataSet[position].horario)

        holder.itemView.setOnClickListener { listener(dataSet[position]) }
    }
}