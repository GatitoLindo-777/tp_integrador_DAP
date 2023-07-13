package com.example.tp_integrador.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tp_integrador.Games
import com.example.tp_integrador.R


class GamesAdapter(val GamesList:List<Games>,  private val onClickListener:(Games) -> Unit): RecyclerView.Adapter<GamesViewHolder> (){

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            return GamesViewHolder(layoutInflater.inflate(R.layout.item_games, parent, false))
    }

    override fun getItemCount(): Int = GamesList.size

    override fun onBindViewHolder(holder: GamesViewHolder, position: Int) {
        val item = GamesList[position]
        holder.render(item, onClickListener)
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
    var onItemClickListener: OnItemClickListener? = null

}