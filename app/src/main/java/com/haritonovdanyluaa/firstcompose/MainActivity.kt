package com.haritonovdanyluaa.firstcompose

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.haritonovdanyluaa.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorld(name = "Android")
        }
    }
}


@Preview
@Composable
fun ShowPreview()
{
    HelloWorld(name = "name")
}

@Composable
fun HelloWorld(name: String) {

    Column {
        Spacer(modifier = Modifier.height(10.dp))
        UserRow()
        Spacer(modifier = Modifier.height(10.dp))
        UserRow()
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Composable
fun UserRow()
{
    Row(modifier = Modifier
        .clip(RoundedCornerShape(10.dp))
        .background(Color.LightGray)
        .fillMaxWidth()
        .padding(all = 10.dp)
        .border(width = 2.dp, color = Color.Transparent)) {
        Image(
            painter = painterResource(id = R.drawable.user_icon),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .padding(5.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Column(modifier = Modifier.padding(start = 10.dp)) {
            Text(text = "Hello, Android",
                color = Color.Blue,
                letterSpacing = 3.sp)
            Text("Pen red pen",
                color = Color.Black)
        }
    }
}
