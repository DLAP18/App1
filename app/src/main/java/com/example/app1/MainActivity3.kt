package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity(), View.OnClickListener{
    private lateinit var tvSaludo: TextView
    private lateinit var btnSaludo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnSaludo = findViewById<Button>(R.id.btnSaludo)
        tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        tvSaludo.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.btnSaludo -> {
                tvSaludo.text = "Hola mundillo"
            }

            R.id.tvSaludo -> {
                tvSaludo.text = "Hola yo"
            }
        }
    }
}