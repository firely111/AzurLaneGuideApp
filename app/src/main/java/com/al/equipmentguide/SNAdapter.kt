package com.al.equipmentguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class SNAdapter(val list: ArrayList<SN>) : RecyclerView.Adapter<SNViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SNViewHolder {
        return SNViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_sn_ship_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: SNViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class SNViewHolder(view: View, var image: Int? = null) : RecyclerView.ViewHolder(view){

    fun bind(sn: SN){
        val imageView:ImageView = itemView.findViewById(R.id.sn_image)
        Picasso.get().load(sn.image).fit().into(imageView)
    }

    companion object{
        val IMAGE_KEY = "IMAGE"
    }

    init {
        view.setOnClickListener{
            val intent = Intent(view.context, SNEquipmentActivity::class.java)
            intent.putExtra(IMAGE_KEY,image)
            view.context.startActivity(intent)

        }
    }
}
