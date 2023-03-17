package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        val lambda: (View) -> Unit = { Log.d("LOGTAG", "Hola Mundo") }

        btnSaludo.setOnClickListener(lambda)

        //la version de arriba y esta funcionan igual
        /*btnSaludo.setOnClickListener{
            Log.d("LOGTAG", "Hola Mundo")
        }*/
    }
}