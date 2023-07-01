package com.krashkrosh748199.passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etFirst=findViewById<TextView>(R.id.etName)
        val etSecond=findViewById<TextView>(R.id.etAge)
        val etThird=findViewById<TextView>(R.id.etCountry)
        val btnFirst=findViewById<Button>(R.id.btnApply)

        btnFirst.setOnClickListener {
            val name=etFirst.text.toString()
            val age=etSecond.text.toString()
            val country=etThird.text.toString()
val person=Person(name,age,country)
            Intent(this,SecondActivity::class.java).also {
it.putExtra("Extra_Person",person)
                startActivity(it)
            }
        }
    }
}