package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etnum1 = findViewById<EditText>(R.id.etnum1)
        val etnum2 = findViewById<EditText>(R.id.etnum2)
        val btnadd = findViewById<TextView>(R.id.buttonadd)
        val btnminus = findViewById<TextView>(R.id.buttonminus)
        val btnmultiply = findViewById<TextView>(R.id.buttonmultiply)
        val buttonmod = findViewById<TextView>(R.id.buttonmod)
        val tvAnswer = findViewById<TextView>(R.id.tvans)
        btnadd.setOnClickListener {
            if (etnum1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etnum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else {
                var num1 = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                var addAnswer = num1 + num2
                tvAnswer.text = "Total:${addAnswer}"

            }
        }
        btnminus.setOnClickListener {
            if (etnum1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etnum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()

            } else {
                var num1 = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                var minusAnswer = num1 - num2
                tvAnswer.text = "Total:${minusAnswer}"

            }

        }
        btnmultiply.setOnClickListener {
            if (etnum1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etnum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()

            } else {
                var num1 = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                var multiplyAnswer = num1 * num2
                tvAnswer.text = "Total:${multiplyAnswer}"

            }

        }
        buttonmod.setOnClickListener {
            if (etnum1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            } else if (etnum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()

            } else {
                var num1 = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                var modAnswer = num1 % num2
                tvAnswer.text = "Total:${modAnswer}"

            }
        }
    }}