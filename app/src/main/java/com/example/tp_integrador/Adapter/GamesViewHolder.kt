package com.example.tp_integrador.Adapter

import android.text.Layout
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tp_integrador.Games
import com.example.tp_integrador.R
import com.google.android.material.snackbar.Snackbar

class GamesViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val TitlePreview = view.findViewById<TextView>(R.id.GameTitlePreView)
    val RatingPreview = view.findViewById<TextView>(R.id.GamesRatingPreView)
    val LogoPreview = view.findViewById<ImageView>(R.id.GamesLogosPreView)
    val LayoutPreview = view.findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.layoutPreview)

    fun render (GamesModel: Games,  onClickListener:(Games) -> Unit){
        TitlePreview.text = GamesModel.title
        RatingPreview.text = GamesModel.rating
        Glide.with(LogoPreview.context).load(GamesModel.photo).into(LogoPreview)
        //LayoutPreview.setOnClickListener{ Snackbar.make(it, "si", Snackbar.LENGTH_SHORT).show() }
        itemView.setOnClickListener{onClickListener(GamesModel)

        }

    }
}