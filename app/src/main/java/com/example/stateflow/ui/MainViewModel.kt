package com.example.stateflow.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

val color = savedStateHandle.getStateFlow("color",0xFFFFFFFF)

    fun generateNewColor(){
        val color = Random.nextLong(0xFFFFFFFF)
        savedStateHandle["color"] = color
    }

}