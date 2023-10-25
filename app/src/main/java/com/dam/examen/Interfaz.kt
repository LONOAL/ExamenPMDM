package com.dam.examen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun IU(miViewModel: MyViewModel) {


    Column {

        if ( miViewModel.data.name.length > 3) {
            Text(
                text = "Nombre: ${ miViewModel.data.name}!",
                fontSize = 24.sp,

                )
            Modifier.padding(18.dp)
        }
        OutlinedTextField(
            value = miViewModel.data.name,
            onValueChange = {
                miViewModel.data.name = it
            },
            label = { Text(text = "Name") }
        )



    }

    Column {
        Text(
            text = "Numero aleatorio: ${miViewModel.getNumero()}"+"\n Lista de nums: ${miViewModel.getLista()}" ,
            modifier = Modifier.padding(100.dp),
            color = Color.DarkGray
        )
        Button(
            onClick = {
                miViewModel.funcionRandom()
                Log.d("Tag", "Estoy en Onclick")
            },
            modifier = Modifier.padding(64.dp)

        )
        {
            Image(
                painter = painterResource(id = R.drawable.lol_logo),

                contentDescription = "Generar numeros",
                Modifier.padding(8.dp)

            )
        }
    }

}






















