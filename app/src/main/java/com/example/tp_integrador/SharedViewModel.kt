package com.example.tp_integrador

import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    var userData: MutableList<User> = mutableListOf()
    var gameList: MutableList<Games> = mutableListOf()
}