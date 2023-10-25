package com.dam.examen

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    val data = RandomData()

    fun funcionRandom() {
        data.num.value = (0..3).random()
        data.numList.add(data.num.value)
        Log.d("Tag", "Estoy en el random")
    }


    fun getNumero(): Int {
        return data.num.value
    }

    fun getName(): String {
        return data.name.value
    }

    fun getLista(): List<Int> {
        return data.numList
    }
}
