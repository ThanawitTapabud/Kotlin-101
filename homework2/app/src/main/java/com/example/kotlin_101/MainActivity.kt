package com.example.kotlin_101

import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import coil.compose.rememberImagePainter
import com.example.kotlin_101.ui.theme.Kotlin101Theme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin101Theme {
                Mytweet("อาจารย์แดง", "ท่านผู้เจริญ", "อ่ะจ๊ะเอ๋ตัวเอง!!")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name",
        modifier = Modifier
    )
}

@Composable
fun Mytweet(title: String, subTitle: String, content: String) {
    Column(Modifier.padding(20.dp)) {
        Row {
            Image(
                painter = painterResource(R.drawable.red), // Replace with your image resource
                contentDescription = "My Image",
                modifier = Modifier
                    .width(90.dp)
                    .clip(CircleShape)
            )
            Column(modifier = Modifier.padding(
                top = 10.dp,
                start = 20.dp,
            )) {
                Text(text = "${title}",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(text = "@${subTitle}",
                        style = androidx.compose.ui.text.TextStyle(
                        fontSize = 20.sp,
                        color = Color.Gray
                    )
                )
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp), contentAlignment = Alignment.TopCenter) {
            Text(text = "${content}",
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 33.sp,
                    color = Color.Black
                )
            )
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp), contentAlignment = Alignment.TopCenter) {
            Row {
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    modifier = Modifier.clip(CircleShape)
                ) {
                    Image(painter = painterResource(R.drawable.chat), contentDescription = "",
                        modifier = Modifier
                            .width(24.dp)
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    modifier = Modifier.clip(CircleShape)
                ) {
                    Image(painter = painterResource(R.drawable.retweet), contentDescription = "",
                        modifier = Modifier
                            .width(24.dp)
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    modifier = Modifier.clip(CircleShape)
                ) {
                    Image(painter = painterResource(R.drawable.heart), contentDescription = "",
                        modifier = Modifier
                            .width(24.dp)
                    )
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    modifier = Modifier.clip(CircleShape)
                ) {
                    Image(painter = painterResource(R.drawable.call), contentDescription = "",
                        modifier = Modifier
                            .width(24.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Kotlin101Theme {
        Greeting("Android")
    }
}