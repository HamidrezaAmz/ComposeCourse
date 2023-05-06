package com.example.composecourse.view.course_7

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class Course7Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.LightGray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ComposeTextField()
                Spacer(modifier = Modifier.height(12.dp))
                ComposePasswordField()
                Spacer(modifier = Modifier.height(12.dp))
                ComposeButton()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposeTextField() {

    val context = LocalContext.current.applicationContext

    var textFieldValue by remember {
        mutableStateOf("")
    }

    var isValid by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = textFieldValue,
            modifier = Modifier.fillMaxWidth(0.9f),
            onValueChange = { newTextValue ->
                textFieldValue = newTextValue
                isValid = validateUserName(newTextValue)
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Person Email"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person Icon"
                )
            },
            label = { Text(text = "Email") },
            placeholder = { Text(text = "Please enter your email") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    Toast.makeText(
                        context,
                        "On Search Click: value = $textFieldValue",
                        Toast.LENGTH_SHORT
                    ).show()
                })
        )

        if (isValid.not()) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(0.9f),
                text = "Username is not valid!",
                color = MaterialTheme.colors.error,
                textAlign = TextAlign.Start
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComposePasswordField() {

    val context = LocalContext.current.applicationContext

    var passwordFieldValue by remember {
        mutableStateOf("")
    }

    var showPassword by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = passwordFieldValue,
            modifier = Modifier.fillMaxWidth(0.9f),
            onValueChange = { newTextValue ->
                passwordFieldValue = newTextValue
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = "Lock icon"
                )
            },
            trailingIcon = {
                IconButton(onClick = { showPassword = !showPassword }) {
                    Icon(
                        imageVector = if (showPassword) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility,
                        contentDescription = if (showPassword) "Show Password" else "Hide Password"
                    )
                }
            },
            visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Please enter your password") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                Toast.makeText(
                    context,
                    "On Search Click: value = $passwordFieldValue",
                    Toast.LENGTH_SHORT
                ).show()
            })
        )
    }
}

@Composable
fun ComposeButton() {

    val context = LocalContext.current.applicationContext

    Column(modifier = Modifier.fillMaxWidth(0.9f)) {
        Button(
            modifier = Modifier
                .width(150.dp)
                .align(Alignment.End),
            shape = RoundedCornerShape(2.dp),
            onClick = {
                Toast.makeText(context, "we are here!", Toast.LENGTH_SHORT).show()
            }) {
            Text(text = "Click Me!")
        }
    }
}

fun validateUserName(userName: String): Boolean {
    if (userName.isEmpty())
        return false
    else if (userName.length < 3)
        return false
    return true
}

fun validateUserPassword(password: String): Boolean {
    if (password.isEmpty())
        return false
    else if (password.length < 5)
        return false
    return true
}


