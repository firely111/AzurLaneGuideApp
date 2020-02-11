package com.al.equipmentguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class HMSAdapter(val list: ArrayList<HMS>) : RecyclerView.Adapter<HMSViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HMSViewHolder {
        return HMSViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_hms_ship_item, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: HMSViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class HMSViewHolder(view: View, var image :Int? = null) : RecyclerView.ViewHolder(view){

    var category = HMSActivity.category

    fun bind(hms: HMS){
        val imageView: ImageView = itemView.findViewById(R.id.hms_image)
        Picasso.get().load(hms.image).fit().into(imageView)
    }

    companion object{
        val SHIP_KEY = "IMAGE"
        val CATEGORY_KEY = "CATEGORY"
    }

    init {
        view.setOnClickListener{
            val intent = Intent(view.context, HMSEquipmentActivity::class.java)
            intent.putExtra(SHIP_KEY,image as Int)
            intent.putExtra(CATEGORY_KEY, category)
            view.context.startActivity(intent)
        }
    }
}