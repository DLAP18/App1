package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity(){
    //private lateinit var -> promesa de inicializacion tardia
    private lateinit var tvSaludo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        tvSaludo = findViewById<TextView>(R.id.tvSaludo)
    }
    fun miClick(view: View) {
        when(view.id){
            R.id.tvSaludo -> {
                tvSaludo.text = "Hola mundoo!"
            }
            R.id.btnSaludo -> {
                tvSaludo.text = "Hello again yo!"
            }
        }
    }
}