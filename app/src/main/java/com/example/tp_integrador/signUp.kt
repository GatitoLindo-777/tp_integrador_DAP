package com.example.tp_integrador

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

class signUp : Fragment() {
    val sharedViewModel by activityViewModels()




companion object {
        fun newInstance() = signUp()
    }
    lateinit var ButtonRegister: Button
    lateinit var ButtonBack: Button
    lateinit var RegisterUsername: EditText
    lateinit var RegisterNickname: EditText
    lateinit var RegisterMail: EditText
    lateinit var RegisterPassword: EditText


    private lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=return inflater.inflate(R.layout.fragment_sign_up, container, false)
        ButtonRegister=FindViewById(R.id.buttonRegister)
        ButtonBack=FindViewById(R.id.buttonBack)
        RegisterUsername=FindViewById(R.id.RegisterUsername)
        RegisterNickname=FindViewById(R.id.RegisterNickname)
        RegisterMail=FindViewById(R.id.RegisterMail)
        RegisterPassword=FindViewById(R.id.RegisterPassword)

        ButtonBack.setOnClickListener {
            findNavController().navigate(R.id.action_signUp_to_logIn)
        }

        return view
    }
    btnSignUp.setOnClickListener {
        val inputUser: String = RegisterUsername.text.toString()
        val inputPass: String = RegisterPassword.text.toString()
        val inputMail: String = RegisterMail.text.toString()
        val inputNick: String = RegisterNickname.text.toString()

        var userEncontrado: User? = sharedViewModel.userData.find { u -> u.username == inputUser}
        var passEncontrada: User? = sharedViewModel.userData.find { u -> u.password == inputPass}
        var mailEncontrado: User? = sharedViewModel.userData.find { u -> u.mail == inputMail}
        var nickEncontrado: User? = sharedViewModel.userData.find { u -> u.nickname == inputNick}

        if (!inputUser.isEmpty() && !inputPass.isEmpty()) {
            if (userEncontrado == null && passEncontrada == null && mailEncontrado ==null && nickEncontrado == null) {
                sharedViewModel.userData.add(User(inputUser, inputPass, inputMail, inputNick))
                //label.text = "ususario creado"
                Snackbar.make(it, "ususario creado", Snackbar.LENGTH_SHORT).show()
            }
            else if (userEncontrado != null || passEncontrada != null || mailEncontrado != null || nickEncontrado != null) {
                //label.text = "usuario o contraseña ya existente"
                Snackbar.make(it, "usuario o contraseña ya existente", Snackbar.LENGTH_SHORT).show()
            }
        }else if (inputUser.isEmpty() || inputPass.isEmpty()) {
            //label.text = inputText
            Snackbar.make(it, "ingrese texto", Snackbar.LENGTH_SHORT).show()
        }
}








