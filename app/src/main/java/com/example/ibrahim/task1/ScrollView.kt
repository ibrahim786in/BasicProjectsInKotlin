package com.example.ibrahim.task1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_scroll_view.*

class ScrollView : AppCompatActivity() {
    val obj = "SicrollView"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)
        Log.d(obj, "onCreate")
        back2.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onRestart() {
        Log.d(obj, "onRestart")
        super.onRestart()
    }
    override fun onStart() {
        Log.d(obj, "onStart")
        super.onStart()
    }
    override fun onResume() {
        Log.d(obj, "onResume")
        super.onResume()
    }
    override fun onPause() {
        Log.d(obj, "onPause")
        super.onPause()
    }
    override fun onStop() {
        Log.d(obj, "onStop")
        super.onStop()
    }
    override fun onDestroy() {
        Log.d(obj, "onDestroy")
        super.onDestroy()
    }
}
