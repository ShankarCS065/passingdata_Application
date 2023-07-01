package com.krashkrosh748199.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
val person=intent.getSerializableExtra("Extra_Person") as Person
        val  tvFirst=findViewById<TextView>(R.id.tvPerson)
        tvFirst.text=person.toString()
    }
}