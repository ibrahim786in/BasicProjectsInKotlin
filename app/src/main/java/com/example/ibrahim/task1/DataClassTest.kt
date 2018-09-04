package com.example.ibrahim.task1

import android.os.Parcel
import android.os.Parcelable

data class DataClassTest(var name: String = "Ibrahim", val age: Int = 23, val email: String = "md.ibrahim@avantari.org") : Parcelable {
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}