package com.rafaelirineu.desafioandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val restaurantes = arrayListOf(
            Restaurant("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 22:00",R.drawable.tony),
            Restaurant("Aoyama - Moema","Alameda dos Arapanés, 532 - Moema",
                "Fecha às 00:00",R.drawable.aoyama),
            Restaurant("Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo",
                "Fecha às 00:00",R.drawable.outback),
            Restaurant("Sí Señor!","Alameda Jauaperi, 626 - Moema",
                "Fecha às 01:00",R.drawable.sisenor)
        )

        val viewManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.restaurantList)

        val viewAdapter = RestaurantAdapter(restaurantes) {
            var intent = Intent(this@HomeActivity, RestaurantDetail::class.java)
            intent.putExtra("Imagem",it.imagem)
            intent.putExtra("Nome do Restaurante", it.nome)
            startActivity(intent)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter

            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
}