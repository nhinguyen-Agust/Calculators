package com.example.calculators

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculators.ui.theme.CalculatorsTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx. compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.Alignment
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Calculators()
            }
        }
    }


@Composable
fun Calculators() {
    var number1 by remember { mutableStateOf(" ") }
    var number2 by remember { mutableStateOf(" ") }
    var result by remember { mutableStateOf(" ") }
    Box(
        modifier = Modifier.fillMaxSize(),
        Alignment.TopCenter
    ) {
        Column {
            TextField(
                value = number1, onValueChange = { number1 = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                visualTransformation = VisualTransformation.None,
                modifier = Modifier.fillMaxWidth()
                    .padding(15.dp)
            )

            TextField(
                value = number2, onValueChange = { number2 = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                visualTransformation = VisualTransformation.None,
                modifier = Modifier.fillMaxWidth()
                    .padding(16.dp)
            )
            TextField(
                value = result, onValueChange = {},
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                visualTransformation = VisualTransformation.None,
                label = { Text(text = "ket qua") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            Row {
                Button(
                    onClick = {
                        result = (number1.toDouble() +
                                number2.toDouble()).toString()
                    },
                    Modifier.padding(5.dp)
                ) {
                    Text(text = "+")
                }
                /*cac nut tt*/
                Button(
                    onClick = {
                        result = (number1.toDouble() -
                                number2.toDouble()).toString()
                    },
                    Modifier.padding(5.dp)
                )
                {
                    Text(text = "-")
                }

                Button(
                    onClick = {
                        result = (number1.toDouble() *
                                number2.toDouble()).toString()
                    },
                    Modifier.padding(5.dp)
                )
                {
                    Text(text = "*")
                }
                Button(
                    onClick = {
                        result = (number1.toDouble() /
                                number2.toDouble()).toString()
                    },
                    Modifier.padding(5.dp)
                )
                {
                    Text(text = "/")
                }
                Button(
                    onClick = {
                        number1 = ""
                        number2 = ""
                        result = ""
                    },
                    Modifier.padding(5.dp)
                )
                {
                    Text(text = "Del")
                }
            }
        }


    }


}