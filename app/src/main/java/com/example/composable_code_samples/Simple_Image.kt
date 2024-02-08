package com.example.composable_code_samples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.composable_code_samples.ui.theme.Composable_Code_SamplesTheme

class Simple_Image : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composable_Code_SamplesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2()
                }
            }
        }
    }
}

@Composable
fun Greeting2() {
    Column {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), // Replace R.drawable.your_image with your image resource
            contentDescription = "launcher image",
            modifier = Modifier
                .size(200.dp)
                .padding(26.dp),
            contentScale = ContentScale.Crop // Adjust content scale as per your requirement
        )


        //coil
        AsyncImage(
            model = "https://dfstudio-d420.kxcdn.com/wordpress/wp-content/uploads/2019/06/digital_camera_photo-1080x675.jpg",
            contentDescription = "some image on internet",
                    modifier = Modifier
                    .size(300.dp)
        )


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Composable_Code_SamplesTheme {
        Greeting2()
    }
}