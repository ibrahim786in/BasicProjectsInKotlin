package com.example.ibrahim.task1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_data_parcelable_test.*

class DataParcelableTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_parcelable_test)
        val parceTest = ParcelabeTestClass("Mohammad Ibrahim", 23, "ibrahim@avantari.org", 85528)
//        editTxtParceData.setText(parceTest.name,parceTest.age,parceTest.email,parceTest.phone)
        val string = "${parceTest.name} \n ${parceTest.age} \n ${parceTest.email} \n ${parceTest.phone}"

        val (name, age, email, phone) = parceTest
        backtoMainAct.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("parcelTest", parceTest)
//            Log.i("LogparceTest",parceTest)
            startActivity(intent)
        }
        editTxtParceData.setText(string)
        println(name)
        println(age)
        println(email)
        println(phone)
    }
}
