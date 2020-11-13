package com.rafaelirineu.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class DetalhePrato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_prato)

        val detalhesPratos = intent.extras!!.getInt("Foto")
        val titulo = intent.extras!!.getString("nome_do_prato")

        findViewById<TextView>(R.id.txtDetalhePrato).text = titulo.toString()

        Picasso.get()
            .load(detalhesPratos)
            .into(findViewById<ImageView>(R.id.imgDetalhePrato))
    }
}