package com.example.ibrahim.task1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ParcelabeTestClass(val name: String, val age: Int, val email: String, val phone: Long) : Parcelable