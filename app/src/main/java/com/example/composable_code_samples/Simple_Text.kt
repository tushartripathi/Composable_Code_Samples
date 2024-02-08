package com.example.composable_code_samples

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composable_code_samples.ui.theme.Composable_Code_SamplesTheme

class Simple_Text : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composable_Code_SamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Developer")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Text(
        text = "Hello $name!",
        fontSize = 20.sp, // Text size in sp
        color = Color.Black, // Text color
        modifier = modifier
            .padding(16.dp) // Adding padding around the text
            .background(Color.Blue) // Setting the background color to blue
            .clickable { Toast.makeText(context,"Hello $name!",Toast.LENGTH_LONG).show() } // Making the text clickable
            .size(200.dp) // Setting the size of the text
            .offset(20.dp, 20.dp) // Offset the text by (10.dp, 20.dp)
            .background(Color.Gray) // Setting background color again (will be drawn above previous background)
            .fillMaxSize()
    // Fills the maximum available size
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Composable_Code_SamplesTheme {
        Greeting("Developers")
    }
}