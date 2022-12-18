package com.example.stateflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.stateflow.ui.MainViewModel
import com.example.stateflow.ui.theme.StateFLowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateFLowTheme {
                val viewmodel = viewModel<MainViewModel>()
                val color by viewmodel.color.collectAsState()
                Box(
                    modifier = Modifier
                        .background(color = Color(color))
                        .fillMaxSize()
                        .clickable { viewmodel.generateNewColor() }
                )
            }
        }
    }

}


