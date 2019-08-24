package com.example.vrushabh.text_data_transfer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val editTextName = findViewById<EditText>(R.id.name)
        val editTextNumber = findViewById<EditText>(R.id.number)

        //handle button on click
        Send.setOnClickListener {
            //EditText
            val name = editTextName.text.toString()
            val number = editTextNumber.text.toString()

            //if name editTextView or number editTextView is empty
            if (name.isEmpty() || number.isEmpty() ) {
                Toast.makeText(this,"Plz enter your Name or Number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else {
                Toast.makeText(this,"Welcome", Toast.LENGTH_SHORT).show()
            }


            //Intent to start second Activity and send Data
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Number", number)
            startActivity(intent)
        }

        //Clean Button
        Clean.setOnClickListener {
            editTextName.setText("")
            editTextNumber.setText("")
        }

    }
}
