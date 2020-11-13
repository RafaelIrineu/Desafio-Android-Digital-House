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
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

        btnGoToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
    
    private fun validaCamposLogin(): Boolean {

        val emailLogin = edtEmailLogin.text
        val passwordLogin = edtPasswordLogin.text

        var resultado = true

        if (emailLogin.isNullOrEmpty()) {
            edtEmailLogin.error = getString(R.string.campo_vazio)
            resultado = false
        }
        if (passwordLogin.isNullOrEmpty()) {
            edtPasswordLogin.error = getString(R.string.campo_vazio)
            resultado = false
        }
        return resultado

    }
}