package com.example.tp_integrador;

class User (var username: String, var password: String, var mail: String, var nickname: String)
public class sharedViewModel: ViewModel() {
        var userData: MutableList<User> = mutableListOf()

}
