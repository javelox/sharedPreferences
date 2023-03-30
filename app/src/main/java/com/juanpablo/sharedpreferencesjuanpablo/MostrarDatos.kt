package com.juanpablo.sharedpreferencesjuanpablo

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarDatos : AppCompatActivity() {
    var txtUsuario: TextView?=null
    var txtPass: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_datos)
        iniciarComponentes()
        cargarDatos()
    }
    private fun iniciarComponentes() {


        txtUsuario=findViewById(R.id.txtUsuario)
        txtPass=findViewById(R.id.txtPass)

    }
    private fun cargarDatos() {
        var preferences: SharedPreferences =getSharedPreferences("credenciales", Context.MODE_PRIVATE)

        var user: String? =preferences.getString("user","No existe la información")
        var pass: String? =preferences.getString("pass","No existe la información")

        txtUsuario?.text=user
        txtPass?.text=pass

    }

}