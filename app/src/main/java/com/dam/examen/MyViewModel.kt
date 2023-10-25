package com.dam.examen

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var num by mutableStateOf(0)
    var text by mutableStateOf("START")
    var fontSize by mutableStateOf(24)
    fun getNumero(): Int {
        return num
    }

}
