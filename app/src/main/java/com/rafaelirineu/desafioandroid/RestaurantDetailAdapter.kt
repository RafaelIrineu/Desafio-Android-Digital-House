package com.rafaelirineu.desafioandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RestaurantDetailAdapter(
    private val dataSet: List<Prato>,
    private val listener: (Prato) -> Unit): RecyclerView.Adapter<RestaurantDetailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantDetailViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_lista_pratos, parent, false)
        return RestaurantDetailViewHolder(view)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: RestaurantDetailViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }
}
