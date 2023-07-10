package com.example.tp_integrador

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class mutablelist
//data class User (var username: String, var password: String, var mail: String, var nickname: String)

class logIn : Fragment() {
    val sharedViewModel : SharedViewModel by activityViewModels()
    lateinit var v: View

    companion object {
        fun newInstance() = logIn()
    }
    lateinit var buttonSignup : Button
    lateinit var buttonSignin : Button
    lateinit var inputUser : EditText
    lateinit var inputPassword : EditText


 //   var userData: MutableList<User> = mutableListOf()

       // private lateinit var viewModel: SharedViewModel

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         v = inflater.inflate(R.layout.fragment_log_in, container, false)

        buttonSignup = v.findViewById(R.id.buttonSignUp)
        buttonSignin = v.findViewById(R.id.buttonSignIn)
        inputUser = v.findViewById(R.id.editTextUser)
        inputPassword = v.findViewById(R.id.editTextPassword)

        sharedViewModel.userData.add(User("gaspar0", "0", "mail0", "gaspi0"))
        sharedViewModel.userData.add(User("gaspar1", "1", "mail1", "gaspi1"))
        sharedViewModel.userData.add(User("gaspar2", "2", "mail2", "gaspi2"))
        sharedViewModel.userData.add(User("gaspar3", "3", "mail3", "gaspi3"))
        sharedViewModel.userData.add(User("gaspar4", "4", "mail4", "gaspi4"))

        buttonSignin.setOnClickListener {
            val inputUser: String = inputUser.text.toString()
            val inputPass: String = inputPassword.text.toString()

            var userEncontrado: User? = sharedViewModel.userData.find { u -> u.username == inputUser }

            if (userEncontrado != null && userEncontrado.password == inputPass) {
                findNavController().navigate(R.id.action_logIn_to_homeFragment)

            } else if (inputUser.isEmpty() || inputPass.isEmpty()) {
                //label.text = inputText
                Snackbar.make(v, "ingrese texto", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(v, "usuario o contraseña incorrecto", Snackbar.LENGTH_SHORT).show()
            }
        }
        buttonSignup.setOnClickListener{

            findNavController().navigate(R.id.action_logIn_to_signUp)
        }
        return v
    }










}