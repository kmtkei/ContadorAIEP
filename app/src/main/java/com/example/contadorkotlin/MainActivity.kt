package com.example.contadorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

        var contador = 0

        fun incrementar(view: View){
            this.contador++
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = this.contador.toString()
        }

        fun reiniciar(view: View){
            this. contador = 0
            val textView = findViewById<TextView>(R.id.textView)

            textView.text = this.contador.toString()
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        textView.setText("Primera aplicacion desde Kotlin")
    }
}