package com.al.equipmentguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class FFNFAdapter(val list: ArrayList<FFNF>) : RecyclerView.Adapter<FFNFViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FFNFViewHolder {
        return FFNFViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_ffnf_ship_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: FFNFViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

    class FFNFViewHolder(view: View, var image: Int? = null) : RecyclerView.ViewHolder(view){

        fun bind(ffnf: FFNF){
            val imageView:ImageView = itemView.findViewById(R.id.ffnf_image)
            Picasso.get().load(ffnf.image).fit().into(imageView)
        }

        companion object{
            val IMAGE_KEY = "IMAGE"
        }

        init {
            view.setOnClickListener{
                val intent = Intent(view.context, FFNFEquipmentActivity::class.java)
                intent.putExtra(IMAGE_KEY,image)
                view.context.startActivity(intent)

            }
        }
    }


