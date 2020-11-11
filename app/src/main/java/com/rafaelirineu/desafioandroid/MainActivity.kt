package com.rafaelirineu.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            if (validaCamposLogin()) {

            }
        }

        btnGoToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
    
    fun validaCamposLogin(): Boolean {

        val emailLogin = edtEmailLogin.text.toString().trim()
        val passwordLogin = edtPasswordLogin.text.toString().trim()

        var resultado = true

        if (emailLogin.isEmpty()) {
            edtEmailLogin.error = "Campo vazio"
            resultado = false
        }
        if (passwordLogin.isEmpty()) {
            edtPasswordLogin.error = "Campo vazio"
            resultado = false
        }
        return resultado

    }
}