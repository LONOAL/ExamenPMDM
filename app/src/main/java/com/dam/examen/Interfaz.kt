package com.dam.examen

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam.examen.ui.theme.ExamenTheme


@Composable
fun IU(miViewModel: MyViewModel) {

    Column  (horizontalAlignment = Alignment.End, modifier = Modifier.padding(10.dp)) {

        Text(
                text = "RONDA",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(10.dp)
                )


        Box(modifier = Modifier
            .padding(end = 10.dp)
            .border(1.dp, Color.Black)
            .width(80.dp)) {
            Text(

                text = miViewModel.num.toString(),
                fontSize = miViewModel.fontSize.sp,
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.Center)
            )
        }



    }

    Column (Modifier.padding(top = 180.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Row {
            Button(
                onClick = {
                    Log.d("ButtonBlue", "Estoy en Onclick")
                },
                shape= RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                modifier = Modifier
                    .padding(20.dp)
                    .size(150.dp)
                    .border(3.dp, Color.Black),
                )
            {
            }
            Button(
                onClick = {
                    Log.d("ButtonGreen", "Estoy en Onclick")
                },
                shape= RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                modifier = Modifier
                    .padding(20.dp)
                    .size(150.dp)
                    .border(3.dp, Color.Black),
                )
            {
            }
        }
        Row {
            Button(
                onClick = {
                    Log.d("ButtonRed", "Estoy en Onclick")
                },
                shape= RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                modifier = Modifier
                    .padding(20.dp)
                    .size(150.dp)
                    .border(3.dp, Color.Black),
            )
            {
            }
            Button(
                onClick = {
                    Log.d("ButtonYellow", "Estoy en Onclick")
                },
                shape= RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
                modifier = Modifier
                    .padding(20.dp)
                    .size(150.dp)
                    .border(3.dp, Color.Black),
            )
            {
            }
        }
        Row(Modifier.padding(top = 40.dp)) {
            Button(
                onClick = {
                    if (miViewModel.text.equals("START")){
                        Log.d("ButtonStart", "Juego iniciado")
                        miViewModel.text="RESET"
                    }else{
                        Log.d("ButtonStart", "Juego terminado")
                        miViewModel.text="START"
                        miViewModel.num=0
                        miViewModel.fontSize=24
                    }
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier
                    .width(180.dp)
                    .height(130.dp)
                    .padding(20.dp)
                    .border(1.dp, Color.Black),
            ) {
            Text(text = miViewModel.text
                , fontSize = 24.sp
                , color = Color.Black)
        }
            Button(
                onClick = {
                    if (miViewModel.text.equals("RESET")) {
                        if (miViewModel.num == 10) {
                            miViewModel.fontSize = 48
                            Log.d("ButtonStart", "Ronda 10 superada")
                        }
                        Log.d("ButtonRound", "Ronda pasada")
                        miViewModel.num++
                    }
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                modifier = Modifier
                    .width(180.dp)
                    .height(130.dp)
                    .padding(20.dp)
                    .border(1.dp, Color.Black),
            ) {
                Icon(painter = painterResource(id = R.drawable.paper_plane), contentDescription = "Pasar_Ronda")
            }
        }
    }
}
@Preview
@Composable
fun IUPreview() {
    ExamenTheme {
        val viewModel = remember { MyViewModel() }
        IU(miViewModel = viewModel)
    }

    }























