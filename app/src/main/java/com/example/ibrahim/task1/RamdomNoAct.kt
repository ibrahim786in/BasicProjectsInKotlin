package com.example.ibrahim.task1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_ramdom_no.*
import java.util.*
import kotlin.collections.ArrayList

class RamdomNoAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ramdom_no)
        val arraySize = 30
        val list: ArrayList<Int> = ArrayList(arraySize)
        val randomGenerator = Random()

        for (i in 1 until list.size) list.add(i)

        Log.d("ramd", list.toString())

        ramdBtn.setOnClickListener {
            while (list.size > 0) {
                val index = randomGenerator.nextInt(list.size)
                Log.d("ramdon", list.toString())
                ramdTextView.text = index.toString()
//                index=list.remove()
            }
        }
    }

}
