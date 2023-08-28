package com.a_code.moneyplanner

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoGraph
import androidx.compose.material.icons.filled.FileUpload
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.a_code.moneyplanner.ui.theme.MoneyPlannerTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneyPlannerTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    bottomBar = {
                        NavigationBar(
                            containerColor = if (isSystemInDarkTheme()) {
                                Color.White
                            } else (Color.Black)
//                            MaterialTheme.colorScheme.primaryContainer,

                        ) {
                            //No: 1
                            NavigationBarItem(
                                selected = true,
                                onClick = { /*TODO*/ },
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.upload_expense),
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onBackground
                                    )
                                },
                                label = {
                                    Text(text = "Expenses")
                                }
                            )

                            //No: 2
                            NavigationBarItem(
                                selected = true,
                                onClick = { /*TODO*/ },
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.chart),
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onBackground
                                    )
                                },
                                label = {
                                    Text(text = "Report")
                                }
                            )


                        }
                    },
                    content = {
                        Surface(
                            modifier = Modifier
                                .padding(it)
                                .fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                        }
                    }
                )
            }
        }
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GreetingPreview() {
    MoneyPlannerTheme {
    }
}