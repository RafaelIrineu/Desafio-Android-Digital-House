package com.rafaelirineu.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_restaurant_detail.*

class RestaurantDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_detail)

        val pratos = arrayListOf(Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama),
            Prato("Salada com molho de gengibre", R.drawable.aoyama))

        val viewAdapter = RestaurantDetailAdapter(pratos) {
            var intent = Intent(this@RestaurantDetail, DetalhePrato::class.java)
            intent.putExtra("nome_do_prato", it.nome)
            intent.putExtra("Foto",it.imagem)
            startActivity(intent)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.listaDePratos)
        val viewManager = GridLayoutManager(this, 2)

        recyclerView.apply {

            layoutManager = viewManager
            setHasFixedSize(true)
            adapter = viewAdapter
        }
    }
}