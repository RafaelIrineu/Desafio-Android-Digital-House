package com.rafaelirineu.desafioandroid

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rafaelirineu.desafioandroid.R.mipmap
import com.squareup.picasso.Picasso

class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val foto: ImageView = view.findViewById(R.id.restaurantImage)
    private val nome: TextView = view.findViewById(R.id.listRestaurantName)
    private val endereco: TextView = view.findViewById(R.id.listRestaurantAddress)
    private val horaFuncionamento: TextView = view.findViewById(R.id.listRestaurantHour)

    fun bind(restaurant: Restaurant) {

        nome.text = restaurant.nome
        endereco.text = restaurant.address
        horaFuncionamento.text = restaurant.horario

        Picasso.get()
            .load(restaurant.imagem)
            .into(foto)
    }
}
