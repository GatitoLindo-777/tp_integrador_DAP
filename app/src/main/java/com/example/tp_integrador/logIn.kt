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
    val sharedViewModel by activityViewModels()

    companion object {
        fun newInstance() = logIn()
    }
    lateinit var buttonSignup : Button
    lateinit var buttonSignin : Button
    lateinit var inputUser : EditText
    lateinit var inputPassword : EditText
    private var user0: String = "gaspar0"
    private var user1: String = "gaspar1"
    private var user2: String = "gaspar2"
    private var user3: String = "gaspar3"
    private var user4: String = "gaspar4"
    private var password0: String = "0"
    private var password1: String = "1"
    private var password2: String = "2"
    private var password3: String = "3"
    private var password4: String = "4"
    private var mail0: String = "mail0"
    private var mail1: String = "mail1"
    private var mail2: String = "mail2"
    private var mail3: String = "mail3"
    private var mail4: String = "mail4"
    private var nickname0: String = "gaspi0"
    private var nickname1: String = "gaspi1"
    private var nickname2: String = "gaspi2"
    private var nickname3: String = "gaspi3"
    private var nickname4: String = "gaspi4"

 //   var userData: MutableList<User> = mutableListOf()

        private lateinit var viewModel: LogInViewModel

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_log_in, container, false)

        sharedViewModel.userData.add(User(user0, password0, mail0, nickname0))
        sharedViewModel.userData.add(User(user1, password1, mail1, nickname1))
        sharedViewModel.userData.add(User(user2, password2, mail2, nickname2))
        sharedViewModel.userData.add(User(user3, password3, mail3, nickname3))
        sharedViewModel.userData.add(User(user4, password4, mail4, nickname4))


        buttonSignup = findViewById(R.id.buttonSignUp)
        buttonSignin = findViewById(R.id.buttonSignIn)
        inputUser = findViewById(R.id.editTextUser)
        inputPassword = findViewById(R.id.editTextPassword)


        buttonSignin.setOnClickListener {
            val inputUser: String = inputUser.text.toString()
            val inputPass: String = inputPassword.text.toString()

            var userEncontrado: User? = sharedViewModel.userData.find { u -> u.username == inputUser }

            if (userEncontrado != null && userEncontrado.password == inputPass) {
                findNavController().navigate(R.id.action_logIn_to_homeFragment)

            } else if (inputUser.isEmpty() || inputPass.isEmpty()) {
                //label.text = inputText
                Snackbar.make(it, "ingrese texto", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(it, "usuario o contraseña incorrecto", Snackbar.LENGTH_SHORT).show()
            }
        }
        buttonSignup.setOnClickListener{

            findNavController().navigate(R.id.action_logIn_to_signUp)
        }
        return view
    }








override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LogInViewModel::class.java)
        // TODO: Use the ViewModel
    }

}