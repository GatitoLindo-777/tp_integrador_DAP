package com.example.tp_integrador

import android.icu.text.CaseMap
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide

import com.example.tp_integrador.Games




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ItemFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ItemFragment : Fragment() {
    val sharedViewModel : SharedViewModel by activityViewModels()
    lateinit var viewModel: GamesListViewModel
    lateinit var v: View
   // lateinit var GamesModel: Games
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v=  inflater.inflate(R.layout.fragment_item, container, false)


        val Title = view?.findViewById<TextView>(R.id.GameTitle)
        val Rating = view?.findViewById<TextView>(R.id.GamesRating)
        val Description = view?.findViewById<TextView>(R.id.GamesDescription)
        val Logo = view?.findViewById<ImageView>(R.id.GamesLogos)

        //viewModel = ViewModelProvider(requireActivity()).get(DescriptionViewModel::class.java)
        //viewModelBookList = ViewModelProvider(requireActivity()).get(BookListViewModel::class.java)



        Title.text = viewModel.GameTitle
        Description.text = viewModel.GameDescription
        Rating.text = viewModel.GameRating



        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)






        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
    }
}