package com.example.ibrahim.task1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            val intent = Intent(this, SimpleLayout::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, ScrollView::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, RecycleView::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, HorizonList::class.java)
            startActivity(intent)
        }

    }
}
