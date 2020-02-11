package com.al.equipmentguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class USSAdapter(val list: ArrayList<USS>) : RecyclerView.Adapter<USSViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): USSViewHolder {
        return USSViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_uss_ship_item, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: USSViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class USSViewHolder(view: View, var image :Int? = null) : RecyclerView.ViewHolder(view){

    var category = USSActivity.category

    fun bind(uss: USS){
        val imageView: ImageView = itemView.findViewById(R.id.uss_image)
        Picasso.get().load(uss.image).fit().into(imageView)
    }

    companion object{
        val SHIP_KEY = "IMAGE"
        val CATEGORY_KEY = "CATEGORY"
    }

    init {
        view.setOnClickListener{
            val intent = Intent(view.context, USSEquipmentActivity::class.java)
            intent.putExtra(SHIP_KEY,image as Int)
            intent.putExtra(CATEGORY_KEY, category)
            view.context.startActivity(intent)
        }
    }
}