package com.al.equipmentguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class KMSAdapter(val list: ArrayList<KMS>) : RecyclerView.Adapter<KMSViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KMSViewHolder {
        return KMSViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_kms_ship_item, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: KMSViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class KMSViewHolder(view: View, var image :Int? = null) : RecyclerView.ViewHolder(view){

    var category = KMSActivity.category

    fun bind(kms: KMS){
        val imageView: ImageView = itemView.findViewById(R.id.kms_image)
        Picasso.get().load(kms.image).fit().into(imageView)
    }

    companion object{
        val SHIP_KEY = "IMAGE"
        val CATEGORY_KEY = "CATEGORY"
    }

    init {
        view.setOnClickListener{
            val intent = Intent(view.context, KMSEquipmentActivity::class.java)
            intent.putExtra(SHIP_KEY,image as Int)
            intent.putExtra(CATEGORY_KEY, category)
            view.context.startActivity(intent)
        }
    }
}