package com.a_code.moneyplanner.screens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.a_code.moneyplanner.R
import com.a_code.moneyplanner.component.TableRow
import com.a_code.moneyplanner.component.UnstyledTextField
import com.a_code.moneyplanner.ui.theme.G_one
import com.a_code.moneyplanner.ui.theme.G_three
import com.a_code.moneyplanner.ui.theme.G_two

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddScreen(navController: NavController) {

    var addAmount by remember { mutableStateOf("") }
    var addNote by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            LargeTopAppBar(
                title = {
                    Text(
                        text = "Add",
                        style = MaterialTheme.typography.headlineLarge,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.font_main_extra_bold)))
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = G_three
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
                            containerColor = G_two
//                            if (isSystemInDarkTheme()) G_one else (G_two)
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 8.dp
                        ),
                        shape = RoundedCornerShape(7.dp)
                    ) {

                        TableRow(
                            label = "Amount:"
                        ) {
                            UnstyledTextField(
                                modifier = Modifier
                                    .padding(end = 2.dp)
                                    .fillMaxWidth(),
                                value = addAmount,
                                onValueChange = { addAmount = it },
                                textStyle = TextStyle(
                                    textAlign = TextAlign.End,
                                    fontSize = 11.sp
                                ),
                                label = {
                                    Text(
                                        text = "Add amount",
                                        modifier = Modifier
                                            .fillMaxWidth(),
                                        textAlign = TextAlign.End,
                                        fontSize = 11.sp,
                                        color = G_three,
                                        fontFamily = FontFamily(Font(R.font.font_main_extra_light)))
                                },
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Number,
                                    imeAction = ImeAction.Done
                                ),
                            )
                        }


                        Divider()

                        TableRow(
                            label = "Recurrences:"
                        )

                        Divider()

                        TableRow(
                            label = "Date:"
                        )

                        Divider()

                        TableRow(
                            label = "Note:"
                        ) {
                            UnstyledTextField(
                                modifier = Modifier
                                    .padding(end = 2.dp)
                                    .fillMaxWidth(),
                                value = addNote,
                                onValueChange = { addNote = it },
                                label = {
                                    Text(
                                        text = "Add note",
                                        modifier = Modifier
                                            .fillMaxWidth(),
                                        textAlign = TextAlign.End,
                                        fontSize = 11.sp,
                                        color = G_three,
                                        fontFamily = FontFamily(Font(R.font.font_main_extra_light)))
                                },
                                textStyle = TextStyle(
                                    textAlign = TextAlign.End,
                                    fontSize = 11.sp
                                ),
                                keyboardOptions = KeyboardOptions(
                                    imeAction = ImeAction.Done
                                ),
//                                trailingIcon = {
//                                    Icon(
//                                        painterResource(id = R.drawable.add_note),
//                                        contentDescription = "",
//                                        tint = Color.Gray,
//                                    )
//                                },
                            )
                        }

                        Divider()

                        TableRow(
                            label = "Category:"
                        )

                        Divider()

                        TableRow(
                            label = "Scan Receipt:"
                        )
                    }
                }

            }

        }

    )

}