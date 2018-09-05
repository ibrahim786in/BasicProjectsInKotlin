package com.example.ibrahim.task1

import android.os.Parcel
import android.os.Parcelable

data class DataClassTest(var name: String = "Ibrahim", val age: Int = 23, val email: String = "md.ibrahim@avantari.org") : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt(),
            parcel.readString())

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<DataClassTest> {
        override fun createFromParcel(parcel: Parcel): DataClassTest {
            return DataClassTest(parcel)
        }

        override fun newArray(size: Int): Array<DataClassTest?> {
            return arrayOfNulls(size)
        }
    }


}