package com.example.tp_integrador

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tp_integrador.Adapter.GamesAdapter
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {
    val sharedViewModel : SharedViewModel by activityViewModels()
    lateinit var v: View

    companion object {
        fun newInstance() = HomeFragment()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_home, container, false)

        initRecyclerView()

        return v
    }
    fun initRecyclerView(){
        val RecyclerView = v.findViewById<RecyclerView>(R.id.RecyclerGames)
        RecyclerView.layoutManager = LinearLayoutManager(requireContext())
        RecyclerView.adapter = GamesAdapter(SharedViewModel.GamesList)
        {onItemSelected(it)}
    }
    fun onItemSelected(games: Games, ) {
        //Snackbar.make(v, "si", Snackbar.LENGTH_SHORT).show()
        findNavController().navigate(R.id.action_homeFragment_to_itemFragment)
    }


}