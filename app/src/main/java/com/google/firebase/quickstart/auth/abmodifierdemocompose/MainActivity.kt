package com.google.firebase.quickstart.auth.abmodifierdemocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.quickstart.auth.abmodifierdemocompose.ui.theme.AbModifierDemoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbModifierDemoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                     DemoScreen()
                }
            }
        }
    }
}
@Composable
fun CustomImage(image: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(image),
        contentDescription = null,
        modifier
    )
}

@Composable
fun DemoScreen() {
    val modifier = Modifier
        .border(width = 2.dp, color = Color.Black)
        .padding(all = 10.dp)

    Column(
        Modifier.padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Text(
            "Abaynhe Abitew",
            modifier = modifier,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(16.dp))
        CustomImage(R.drawable.aabitew,
            Modifier
                .padding(16.dp)
                .width(270.dp)
                .clip(shape = RoundedCornerShape(30.dp))
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AbModifierDemoComposeTheme {
        DemoScreen()

    }
}