package com.example.azurlaneguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class IJNAdapter(val list: ArrayList<IJN>) : RecyclerView.Adapter<IJNViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IJNViewHolder {
        return IJNViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_ijn_ship_item, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: IJNViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class IJNViewHolder(view: View, var image :Int? = null) : RecyclerView.ViewHolder(view){

    var category = IJNActivity.category

    fun bind(ijn: IJN){
        val imageView: ImageView = itemView.findViewById(R.id.ijn_image)
        Picasso.get().load(ijn.image).fit().into(imageView)
    }

    companion object{
        val SHIP_KEY = "IMAGE"
        val CATEGORY_KEY = "CATEGORY"
    }

    init {
        view.setOnClickListener{
            val intent = Intent(view.context, IJNEquipmentActivity::class.java)
            intent.putExtra(SHIP_KEY,image as Int)
            intent.putExtra(CATEGORY_KEY, category)
            view.context.startActivity(intent)
        }
    }
}