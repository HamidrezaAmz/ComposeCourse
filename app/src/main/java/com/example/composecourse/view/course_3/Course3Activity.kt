package com.example.composecourse.view.course_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class Course3Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Row {
                    Text(
                        text = "Hello", modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .background(Color.Red)
                            .padding(16.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .background(Color.Magenta)
                        .border(width = 5.dp, color = Color.Yellow)
                        .padding(5.dp)
                        .border(width = 5.dp, color = Color.Gray)
                        .padding(5.dp)
                        .border(width = 5.dp, color = Color.Green)
                        .padding(5.dp)
                        .border(width = 10.dp, color = Color.White)
                        .padding(10.dp)
                ) {
                    Text(text = "World", modifier = Modifier.padding(8.dp))
                }

                Row(modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        // this is my first click effect
                    }) {
                    Text(text = "HERE WE ARE")
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "NA BABA!")
                }
            }
        }
    }
}
