package com.rafaelirineu.desafioandroid

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    //private val foto = view.findViewById<ImageView>(R.id.restaurantImage)
    private val nome: TextView = view.findViewById(R.id.listRestaurantName)
    private val endereco: TextView = view.findViewById(R.id.listRestaurantAddress)
    private val horaFuncionamento: TextView = view.findViewById(R.id.listRestaurantHour)

    fun bind(restaurantName: String, restaurantAddress: String, restaurantHora: String) {

        nome.text = restaurantName
        endereco.text = restaurantAddress
        horaFuncionamento.text = restaurantHora
    }
}