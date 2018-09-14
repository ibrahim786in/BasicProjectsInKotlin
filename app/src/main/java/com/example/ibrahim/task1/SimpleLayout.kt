package com.example.ibrahim.task1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_simple_layout.*

class SimpleLayout : AppCompatActivity() {
    val obj = "SimpleLayout"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_layout)
        Log.d(obj, "onCreate")

        val person1=DataClassTest("Shafiq",23,"Shafiq@avantari")
        val  person2=DataClassTest("Mirza",24)
        val person3= DataClassTest()
        val dubli1=person3.copy()
        val dubl2=person3.copy(age = 22)

        back1.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("Simple_Act_Name",first_name.text.toString())
            intent.putExtra("complete_object",person1)

//            intent.flags=Intent.FLAG_ACTIVITY_SINGLE_TOP
//            intent.flags=Intent.FLAG_ACTIVITY_CLEAR_TOP
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
