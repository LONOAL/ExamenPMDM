package com.dam.examen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class RandomData(
    var num: MutableState<Int> = mutableStateOf(0),
    var name: MutableState<String> = mutableStateOf(""),
    var numList: MutableList<Int> = mutableListOf()
)