package com.al.equipmentguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ROCAdapter(val list: ArrayList<ROC>) : RecyclerView.Adapter<ROCViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ROCViewHolder {
        return ROCViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_roc_ship_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ROCViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

    class ROCViewHolder(view: View, var image: Int? = null) : RecyclerView.ViewHolder(view){

        fun bind(roc: ROC){
            val imageView:ImageView = itemView.findViewById(R.id.roc_image)
            Picasso.get().load(roc.image).fit().into(imageView)
        }

        companion object{
            val IMAGE_KEY = "IMAGE"
        }

        init {
            view.setOnClickListener{
                val intent = Intent(view.context, ROCEquipmentActivity::class.java)
                intent.putExtra(IMAGE_KEY,image)
                view.context.startActivity(intent)

            }
        }
    }


