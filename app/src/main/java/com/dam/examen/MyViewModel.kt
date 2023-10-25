package com.dam.examen

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var data by mutableStateOf(RandomData())

    fun funcionRandom() {
        data.num = (0..3).random()
        data.numList.add(data.num)
        Log.d("Tag", "Estoy en el random")
    }

    fun getNumero(): Int {
        return data.num
    }

    fun getLista(): List<Int> {
        return data.numList
    }
}
