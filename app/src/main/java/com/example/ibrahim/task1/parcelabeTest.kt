package com.example.ibrahim.task1

import android.os.Parcel
import android.os.Parcelable

class parcelabeTest() :Parcelable {
    constructor(parcel: Parcel) : this()

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<parcelabeTest> {
        override fun createFromParcel(parcel: Parcel): parcelabeTest {
            return parcelabeTest(parcel)
        }

        override fun newArray(size: Int): Array<parcelabeTest?> {
            return arrayOfNulls(size)
        }
    }
}