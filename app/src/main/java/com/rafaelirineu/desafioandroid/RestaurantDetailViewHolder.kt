package com.rafaelirineu.desafioandroid

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RestaurantDetailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val nome: TextView = view.findViewById(R.id.txtNomeDoRestaurante)
    private val foto: ImageView = view.findViewById(R.id.imagemRestaurante)

    fun bind(prato: Prato) {
        nome.text = prato.nome

        Picasso.get()
            .load(prato.imagem)
            .into(foto)
    }
}

