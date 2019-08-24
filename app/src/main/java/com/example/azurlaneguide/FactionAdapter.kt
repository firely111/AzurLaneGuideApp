package com.example.azurlaneguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class FactionAdapter (val list: ArrayList<Faction>) : RecyclerView.Adapter<FactionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactionViewHolder {
        return FactionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_faction_item, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: FactionViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class FactionViewHolder(view: View, var image: Int? = null) : RecyclerView.ViewHolder(view){

    fun bind(faction: Faction){
        val imageView: ImageView = itemView.findViewById(R.id.faction_image)
        Picasso.get().load(faction.image).into(imageView)
    }

    init {
        view.setOnClickListener{

            when (image){
                2 -> {
                   val intent = Intent(view.context, FFNFShipsActivity::class.java)
                    view.context.startActivity(intent)
                }
                else -> println("KAPPA")
            }
        }
    }
}