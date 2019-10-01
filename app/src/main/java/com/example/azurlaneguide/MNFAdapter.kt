package com.example.azurlaneguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MNFAdapter(val list: ArrayList<MNF>) : RecyclerView.Adapter<MNFViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MNFViewHolder {
        return MNFViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_mnf_ship_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: MNFViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class MNFViewHolder(view: View, var image: Int? = null) : RecyclerView.ViewHolder(view){

    fun bind(mnf: MNF){
        val imageView:ImageView = itemView.findViewById(R.id.mnf_image)
        Picasso.get().load(mnf.image).fit().into(imageView)
    }

    companion object{
        val IMAGE_KEY = "IMAGE"
    }

    init {
        view.setOnClickListener{
            val intent = Intent(view.context, MNFEquipmentActivity::class.java)
            intent.putExtra(IMAGE_KEY,image)
            view.context.startActivity(intent)
        }
    }
}
