package com.a_code.moneyplanner

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.a_code.moneyplanner.screens.ExpensesScreen
import com.a_code.moneyplanner.screens.SettingsScreen
import com.a_code.moneyplanner.ui.theme.MoneyPlannerTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneyPlannerTheme {
                // NavController
                val navController = rememberNavController()
                // NavController is passed via parameter
                val backStackEntry = navController.currentBackStackEntryAsState()

                // A surface container using the 'background' color from the theme
                Scaffold(
                    bottomBar = {
                        NavigationBar(
                            containerColor = MaterialTheme.colorScheme.primaryContainer
                            /**
                            if (isSystemInDarkTheme()) {
                            Color.White
                            } else (Color.Black)
                             */

                        ) {
                            //No: 1
                            NavigationBarItem(
                                selected = backStackEntry.value?.destination?.route == "expenses",
                                onClick = { navController.navigate("expenses") },
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.upload_expense),
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onBackground
                                    )
                                },
                                label = {
                                    Text(
                                        text = "Expenses",
                                        color = MaterialTheme.colorScheme.onBackground,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            )

                            //No: 2
                            NavigationBarItem(
                                selected = backStackEntry.value?.destination?.route == "reports",
                                onClick = { navController.navigate("reports") },
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.chart),
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onBackground
                                    )
                                },
                                label = {
                                    Text(
                                        text = "Reports",
                                        color = MaterialTheme.colorScheme.onBackground,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            )

                            //No: 3
                            NavigationBarItem(
                                selected = backStackEntry.value?.destination?.route == "add",
                                onClick = { navController.navigate("add") },
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.add),
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onBackground
                                    )
                                },
                                label = {
                                    Text(
                                        text = "Add",
                                        color = MaterialTheme.colorScheme.onBackground,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            )


                            //No: 4
                            NavigationBarItem(
                                selected = backStackEntry.value?.destination?.route == "settings",
                                onClick = { navController.navigate("settings") },
                                icon = {
                                    Icon(
                                        painterResource(id = R.drawable.settings),
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onBackground
                                    )
                                },
                                label = {
                                    Text(
                                        text = "Settings",
                                        color = MaterialTheme.colorScheme.onBackground,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            )

                        }
                    },
                    content = { innerPadding ->

                        NavHost(navController = navController, startDestination = "expenses") {
                            composable("expenses") {
                                Surface(
                                    modifier = Modifier
                                        .padding(innerPadding)
                                        .fillMaxSize(),
                                    color = MaterialTheme.colorScheme.background
                                ) {
                                    ExpensesScreen(navController = navController, name = "Expenses")
                                }
                            }

                            composable("reports") {
                                Surface(
                                    modifier = Modifier
                                        .padding(innerPadding)
                                        .fillMaxSize(),
                                    color = MaterialTheme.colorScheme.background
                                ) {
                                    Greeting("reports")
                                }
                            }

                            composable("add") {
                                Surface(
                                    modifier = Modifier
                                        .padding(innerPadding)
                                        .fillMaxSize(),
                                    color = MaterialTheme.colorScheme.background
                                ) {
                                    Greeting("add")
                                }
                            }

                            composable("settings") {
                                Surface(
                                    modifier = Modifier
                                        .padding(innerPadding)
                                        .fillMaxSize(),
                                    color = MaterialTheme.colorScheme.background
                                ) {
                                   SettingsScreen(navController = navController)
                                }
                            }

                            composable("settings/categories") {
                                Surface(
                                    modifier = Modifier
                                        .padding(innerPadding)
                                        .fillMaxSize(),
                                    color = MaterialTheme.colorScheme.background
                                ) {
                                    Greeting("categories")
                                }
                            }

                        }

                    }
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name")
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GreetingPreview() {
    MoneyPlannerTheme {
    }
}