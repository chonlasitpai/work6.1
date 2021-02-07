package com.example.work61


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mark: TextView = findViewById(R.id.mark)
        var result: TextView = findViewById(R.id.total)
        var num1: EditText = findViewById(R.id.num1)
        var num2: EditText = findViewById(R.id.num2)

        var btnplus: Button = findViewById(R.id.plus)
        var btnmult: Button = findViewById(R.id.mul)
        var btnminus: Button = findViewById(R.id.minus)
        var btnvidider: Button = findViewById(R.id.div)
        var btnmodulo: Button = findViewById(R.id.mod)
        var btnclear: Button = findViewById(R.id.clear)
        //บวก
        btnplus.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งNumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            } else {
                total = num1.toString().toInt() + num2.toString().toInt()
                mark.setText("+")
                result.setText(total.toString())

            }
        }

        //ลบ
        btnminus.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            } else {
                total = num1.toString().toInt() - num2.toString().toInt()
                mark.setText("-")
                result.setText(total.toString())

            }
        }

        //คูณ
        btnmult.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.000
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            } else {
                total = num1.toString().toDouble() * num2.toString().toDouble()
                mark.setText("*")
                result.setText(total.toString())

            }
        }

        //หาร
        btnvidider.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.00
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            } else {
                total = num1.toString().toDouble() / num2.toString().toDouble()
                mark.setText("/")
                result.setText(total.toString())

            }
        }

        //มอด
        btnmodulo.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.00
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้งnumber1 และ Number2", Toast.LENGTH_LONG)
                toast.show()
            } else if (num2 == "0") {
                val toast1 =
                    Toast.makeText(applicationContext, "ห้ามกรอกค่า number2 = 0", Toast.LENGTH_LONG)
                toast1.show()
            } else {
                total = num1.toString().toDouble() % num2.toString().toDouble()
                mark.setText("%")
                result.setText(total.toString())

            }
        }

        btnclear.setOnClickListener() {
            num1.setText("")
            num2.setText("")
            mark.setText("")
            result.setText("")
        }
    }
}