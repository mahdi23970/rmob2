package com.example.mahdi10

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController



@Composable
fun Welcome(navController: NavController){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        repeat(10){
            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                repeat(2){
                    GridCell()
                }

            }
        }
    }
}

@Composable
fun GridCell(){
    Card(elevation = 16.dp,
        modifier = Modifier.padding(8.dp)) {
        Box(modifier = Modifier
            .requiredSize(180.dp, 180.dp)
            .padding(8.dp)) {

            Image(painter = painterResource(id = com.example.mahdi10.R.drawable.bicycle),
                contentDescription ="bicycle")
            Text(text = "Bicycle", fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .background(Color.Cyan)
                    .align(Alignment.BottomEnd))
        }

    }
}