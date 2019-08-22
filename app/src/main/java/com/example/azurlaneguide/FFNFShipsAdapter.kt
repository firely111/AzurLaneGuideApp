package com.example.azurlaneguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class FFNFShipsAdapter(val list: ArrayList<FFNFData>) : RecyclerView.Adapter<FFNFShipsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_ffnfshipitem, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }

    class ViewHolder(view: View, var image: Int?= null) : RecyclerView.ViewHolder(view){

        fun bind(data: FFNFData){
            val imageView:ImageView = itemView.findViewById(R.id.ffnf_image)
            imageView.setImageBitmap(data.image)
        }

        companion object{
            val IMAGE_KEY = "IMAGE"
            val NAME_KEY = "NAME"
        }

        init {
            view.setOnClickListener{
                val intent = Intent(view.context, EquipmentImageActivity::class.java)
                when (image){
                    0 -> {
                        intent.putExtra(IMAGE_KEY, R.drawable.emile_bertin_eq)
                        intent.putExtra(NAME_KEY, "Emile Bertin")
                    }
                    4 -> {
                        intent.putExtra(IMAGE_KEY, R.drawable.le_triomphant_eq)
                        intent.putExtra(NAME_KEY, "Le Triomphant")
                    }
                    else -> println("KAPPA")
                }
                view.context.startActivity(intent)

            }
        }
    }
}

