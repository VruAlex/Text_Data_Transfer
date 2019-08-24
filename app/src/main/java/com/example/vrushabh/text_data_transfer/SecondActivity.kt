package com.example.vrushabh.text_data_transfer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        //SecondActivity TextView
        val firstName = findViewById<TextView>(R.id.first)
        val secondNumber = findViewById<TextView>(R.id.second)

        //Get data from MainActivity intent
        val name = intent.getStringExtra("Name")
        val number = intent.getStringExtra("Number")


        //put data in Text View
        firstName.text = "My name is "+name+ " and i an ready  to learn kotlin"

        secondNumber.text = number
    }
}
