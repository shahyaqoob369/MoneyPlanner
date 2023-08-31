package com.a_code.moneyplanner.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.a_code.moneyplanner.component.TableRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreen(navController: NavController) {

    Scaffold(
        topBar = {
            LargeTopAppBar(
                title = {
                    Text(
                        text = "Add",
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.Bold

                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        },
        content = { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                Column(
                    modifier = Modifier
                        .padding(6.dp)
                        .fillMaxWidth()
                ) {
                    Card(
                        modifier = Modifier
                            .padding(1.dp)
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.onSurface
//                            if (isSystemInDarkTheme()) Color.DarkGray else (Color.LightGray)
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 8.dp
                        ),
                        shape = RoundedCornerShape(7.dp)
                    ) {

                        TableRow(
                            label = "Amount"
                        ) {
                            TextField(value = "Hello", onValueChange = {})
                        }


                        Divider()

                        TableRow(
                            label = "Recurrences"
                        )

                        Divider()

                        TableRow(
                            label = "Date"
                        )

                        Divider()

                        TableRow(
                            label = "Note"
                        )

                        Divider()

                        TableRow(
                            label = "Category"
                        )

                        Divider()

                        TableRow(
                            label = "Scan Receipt"
                        )
                    }
                }

            }

        }

    )

}