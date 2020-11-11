package com.rafaelirineu.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister.setOnClickListener {

            if (validaCampos()) {
                finish()
            }
        }
    }

    fun validaCampos(): Boolean {

        val emailRegistro = edtEmailRegister.text.toString().trim()
        val name = edtName.text.toString().trim()
        val passwordRegistro = edtPasswordRegister.text.toString().trim()
        val passwordRepeat = edtPasswordRepeat.text.toString().trim()

        var resultado = true

        if (emailRegistro.isEmpty()) {
            edtEmailRegister.error = "Campo vazio"
            resultado = false
        }
        if (name.isEmpty()) {
            edtName.error = "Campo vazio"
            resultado = false
        }
        if (passwordRegistro.isEmpty()) {
            edtPasswordRegister.error = "Campo vazio"
            resultado = false
        }
        if (passwordRepeat.isEmpty()) {
            edtPasswordRepeat.error = "Campo vazio"
            resultado = false
        }
        if (passwordRegistro != passwordRepeat) {
            edtPasswordRepeat.error = "A senha não confere"
            resultado = false
        }
        return resultado

    }
}
