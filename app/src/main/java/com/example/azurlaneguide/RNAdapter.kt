package com.example.azurlaneguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RNAdapter(val list: ArrayList<RN>) : RecyclerView.Adapter<RNViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RNViewHolder {
        return RNViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_rn_ship_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RNViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class RNViewHolder(view: View, var image: Int? = null) : RecyclerView.ViewHolder(view){

    fun bind(rn: RN){
        val imageView:ImageView = itemView.findViewById(R.id.rn_image)
        Picasso.get().load(rn.image).fit().into(imageView)
    }

    companion object{
        val IMAGE_KEY = "IMAGE"
    }

    init {
        view.setOnClickListener{
            val intent = Intent(view.context, RNEquipmentActivity::class.java)
            intent.putExtra(IMAGE_KEY,image)
            view.context.startActivity(intent)

        }
    }
}
