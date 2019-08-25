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

    companion object{
        val FACTION_KEY = "FACTION"
    }

    init {
        view.setOnClickListener{

            // TODO: Add all other factions
            when (image){
                0 -> {
                    val intent = Intent(view.context, CategoryActivity::class.java)
                    intent.putExtra(FACTION_KEY, image as Int)
                    view.context.startActivity(intent)
                }
                2 -> {
                   val intent = Intent(view.context, FFNFActivity::class.java)
                    view.context.startActivity(intent)
                }
                3 -> {
                    val intent = Intent(view.context, CategoryActivity::class.java)
                    intent.putExtra(FACTION_KEY, image as Int)
                    view.context.startActivity(intent)
                }
                else -> println("KAPPA")
            }
        }
    }
}