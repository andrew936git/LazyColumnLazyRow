package com.example.lazycolumnlazyrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 38.dp, start = 5.dp, end = 5.dp)
                    .border(2.dp, Color.Black)
                    .background(Color.DarkGray)
            ) {
                Text(
                    text = "Фрукты",
                    fontSize = 32.sp,
                    color = Color.White
                )
            }

            Surface(
                border = BorderStroke(2.dp, Color.Black),
                modifier = Modifier
                    .padding(top = 80.dp, start = 10.dp, end = 10.dp)
                    .fillMaxWidth()
            ) {
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                ) {

                    items(Fruits.fruitsList) { fruits ->
                        FruitsRow(fruits)
                        Spacer(modifier = Modifier.padding(8.dp))
                    }
                }
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 200.dp, start = 5.dp, end = 5.dp)
                    .border(2.dp, Color.Black)
                    .background(Color.DarkGray)
            ) {
                Text(
                    text = "Другие фрукты",
                    fontSize = 32.sp,
                    color = Color.White
                )
            }

                Surface(
                    modifier = Modifier
                        .padding(top = 242.dp, start = 8.dp, end = 8.dp, bottom = 40.dp)
                        .border(2.dp, Color.Black)
                ) {
                    LazyColumn(
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.DarkGray)
                    ) {
                        items(Fruits.fruitsList) { fruits ->
                            FruitsRow(fruits)
                            Spacer(modifier = Modifier.padding(8.dp))
                        }
                    }


            }

        }
    }
}

@Composable
fun FruitsRow(fruits: Fruits){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Image(
            painter = painterResource(id = fruits.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Column {
            Text(
                text = fruits.name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(6.dp)
            )
            Text(
                text = fruits.price,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(6.dp)
            )
        }


    }
}


