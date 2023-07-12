package com.example.tp_integrador

import android.content.ClipData
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.provider.ContactsContract.Contacts.Photo
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tp_integrador.Adapter.GamesAdapter
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {
    val sharedViewModel : SharedViewModel by activityViewModels()

    lateinit var v: View
    lateinit var recyclerGames: RecyclerView
    companion object {
        fun newInstance() = HomeFragment()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_home, container, false)


        //recyclerGames= v.findViewById(R.id.RecyclerGames)

        initRecyclerView()


        return v
    }
    fun initRecyclerView(){
        val RecyclerView = v.findViewById<RecyclerView>(R.id.RecyclerGames)
        //recyclerGames.setHasFixedSize(true)
        RecyclerView.layoutManager = LinearLayoutManager(requireContext())
        RecyclerView.adapter = GamesAdapter(sharedViewModel.GamesList) { onItemSelected(it) }
        view?.findNavController()?.navigate(R.id.action_homeFragment_to_itemFragment)

                //

    }

    fun onItemSelected(games: Games, ) {
        //Snackbar.make(v, "", Snackbar.LENGTH_SHORT).show()
        findNavController().navigate(R.id.action_homeFragment_to_itemFragment)
    }
}




