package com.example.simpleloging

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontFamily.Companion.Cursive
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun textAttribute(modifier: Modifier = Modifier) {
    Column() {
        Text(text="hello world")
//        color
       Text(text="hello world",color= Color.Red)
        Text(text="hello world")
//        text size
        Text(text="hello world" , fontSize = 30.sp)
//        fontstyle
        Text(text="hello world", fontStyle = FontStyle.Italic)
//        bold karne ke liye
        Text(text="hello world", fontWeight = FontWeight.Bold)
        Text(text="hello world",
            fontFamily = Cursive)
//        space dene ke liye
        Text(text="hello world",
            letterSpacing = 5.sp)
        Text(text="hello world",textDecoration = TextDecoration.Underline)
         Text(text="ab kiya hon re tera bhai",
             textAlign = TextAlign.Center,
             textDecoration = TextDecoration.LineThrough,
             style = MaterialTheme.typography.labelLarge
         )
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun textAttributePreview() {
    textAttribute()
}