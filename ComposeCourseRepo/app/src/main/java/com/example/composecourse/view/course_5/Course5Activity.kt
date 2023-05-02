package com.example.composecourse.view.course_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.R

class Course5Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.lato_thin, FontWeight.Thin),
            Font(R.font.lato_light, FontWeight.Light),
            Font(R.font.lato_regular, FontWeight.Normal),
            Font(R.font.lato_bold, FontWeight.Bold),
        )

        setContent {
            Box(
                modifier = Modifier
                    .background(Color(0Xff010101))
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                color = Color.Green,
                                fontSize = 36.sp
                            )
                        ) {
                            append("J")
                        }
                        append("etpack ")

                        withStyle(
                            SpanStyle(
                                color = Color.Green,
                                fontSize = 36.sp
                            )
                        ) {
                            append("C")
                        }
                        append("ompose!")

                    },
                    fontSize = 36.sp,
                    color = Color.White,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Thin,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}

@Composable
fun DrawStyledText() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "HERE WE ARE...",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = Color.Red,
            fontSize = 30.sp
        )
    }
}
