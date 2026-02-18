package com.example.simpleloging

import android.os.Bundle
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Preview( showBackground = true, showSystemUi = true)
@Composable
fun AllBasicText(modifier: Modifier = Modifier) {
    var textValue by remember { mutableStateOf("") }
    var outlinedTextValue by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Basic Text Field Project",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Text(
            text = "Filled TextField",
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        TextField(
            value = textValue,
            onValueChange = { textValue = it },
            label = { Text("Name") },
            placeholder = { Text("Type your name here") },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "Outlined TextField",
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = outlinedTextValue,
            onValueChange = { outlinedTextValue = it },
            label = { Text("Email") },
            placeholder = { Text("example@gmail.com") },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        if (textValue.isNotEmpty()) {
            Text(
                text = "Hello, $textValue!",
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}
