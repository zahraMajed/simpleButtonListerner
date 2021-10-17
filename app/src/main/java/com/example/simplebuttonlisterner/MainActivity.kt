package com.example.simplebuttonlisterner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnKotlin:Button
    lateinit var btnXML:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKotlin=findViewById(R.id.btnKotlin)
        btnXML=findViewById(R.id.btnXML)

        btnKotlin.setOnClickListener(){
            Toast.makeText(applicationContext, "Coding",Toast.LENGTH_LONG).show()
        }


    }

    fun onClickk(view: android.view.View) {
        Toast.makeText(applicationContext,"onClick", Toast.LENGTH_LONG).show()
    }


}