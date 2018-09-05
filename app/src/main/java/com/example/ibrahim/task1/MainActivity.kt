package com.example.ibrahim.task1

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val obj = "siMainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(obj, "onCreate")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simpleLayout.setOnClickListener {
            val intent = Intent(this, SimpleLayout::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
        scrollViewTest.setOnClickListener {
            val intent = Intent(this, ScrollView::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
        recycleViewVertical.setOnClickListener {
            val intent = Intent(this, RecycleViewVertical::class.java)

            startActivity(intent)
        }
        recycleViewHorizontal.setOnClickListener {
            val intent = Intent(this, HorizonList::class.java)
            startActivity(intent)
        }
        dataParcelableTest.setOnClickListener {
            val intent = Intent(this, DataParcelableTest::class.java)
            startActivity(intent)
        }

        Toast.makeText(this, intent.getStringExtra("parcelTest"), Toast.LENGTH_SHORT).show()

    }

    override fun onBackPressed() {
        finish()
        Intent.FLAG_ACTIVITY_SINGLE_TOP
        super.onBackPressed()
    }

//    override fun onNewIntent(intent: Intent?) {
//        super.onNewIntent(intent)
//    }

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

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.i("MainActivity", "Is this method is going executed or not")
        if (newConfig?.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "orientation is landscape", Toast.LENGTH_SHORT).show()
        } else if (newConfig?.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "orientation is portrait", Toast.LENGTH_SHORT).show()
        }
    }


}
