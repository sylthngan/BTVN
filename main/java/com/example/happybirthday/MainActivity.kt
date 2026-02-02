package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardBirth(

                    )
                }
            }
        }
    }
}
@Composable
fun ContactItem(text: String) {

    Text(
        text = text,
        modifier = Modifier.padding(8.dp),
        fontSize = 16.sp
    )
}

@Composable
fun CardBirth(  modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
            modifier = Modifier.fillMaxSize()

        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.padding(top = 150.dp),

                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.size(120.dp)
                )

                Text(
                    modifier = Modifier.padding(top = 30.dp),

                    text = "Thuy Ngan",
                    fontSize = 32.sp
                )

                Text(
                    modifier = Modifier.padding(top = 10.dp),

                    text = "Developer",
                    fontSize = 23.sp
                )
            }
            Column(
                modifier = Modifier.padding(bottom = 100.dp)
            ) {

                ContactItem(stringResource(R.string.sdt_infor))
                ContactItem(stringResource(R.string.social_media))
                ContactItem(stringResource(R.string.email))
            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    CardBirth(

        modifier = Modifier.padding(18.dp)

    )

}