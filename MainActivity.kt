package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val number1:EditText=findViewById(R.id.number1)
        val number2:EditText=findViewById(R.id.number2)
        val sonuc:TextView=findViewById(R.id.textViewSonuc)
        val btnTopla:Button=findViewById(R.id.btnTopla)
        val btnCıkar:Button=findViewById(R.id.btnCıkar)
        val btnBolme:Button=findViewById(R.id.btnBol)
        val btnCarp:Button=findViewById(R.id.btnCarp)


        btnTopla.setOnClickListener{
            val sayi1:Int=Integer.parseInt(number1.text.toString())
            val sayi2:Int=Integer.parseInt(number2.text.toString())
            val isonuc = sayi1+sayi2
            sonuc.text=isonuc.toString()
        }
        btnCıkar.setOnClickListener {
            val sayi1:Int=Integer.parseInt(number1.text.toString())
            val sayi2:Int=Integer.parseInt(number2.text.toString())
            val isonuc = sayi1-sayi2
            sonuc.text=isonuc.toString()
        }
        btnBol.setOnClickListener {
            val sayi1:Int=Integer.parseInt(number1.text.toString())
            val sayi2:Int=Integer.parseInt(number2.text.toString())
            val isonuc = sayi1/sayi2
            sonuc.text=isonuc.toString()


    }
        btnCarp.setOnClickListener {
            val sayi1: Int = Integer.parseInt(number1.text.toString())
            val sayi2: Int = Integer.parseInt(number2.text.toString())
            val isonuc = sayi1 * sayi2
            sonuc.text = isonuc.toString()
        }
}}