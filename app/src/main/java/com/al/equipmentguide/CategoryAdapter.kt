package com.al.equipmentguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CategoryAdapter (val list: ArrayList<Category>) : RecyclerView.Adapter<CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_category_item, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(list[position])
        holder.image = position
    }
}

class CategoryViewHolder(view: View, var image: Int? = null) : RecyclerView.ViewHolder(view){

    var faction = CategoryActivity.faction

    fun bind(category: Category){
        val imageView: ImageView = itemView.findViewById(R.id.category_image)
        Picasso.get().load(category.image).fit().into(imageView)
    }

    companion object{
        val CATEGORY_KEY = "CATEGORY"
    }

    init {
        view.setOnClickListener{
            when (faction){
                // Eagle Union
                1 -> {
                    val intent = Intent(view.context, USSActivity::class.java)
                    intent.putExtra(CATEGORY_KEY, image as Int)
                    view.context.startActivity(intent)
                }
                // IronBlood
                3 -> {
                    val intent = Intent(view.context, KMSActivity::class.java)
                    intent.putExtra(CATEGORY_KEY, image as Int)
                    view.context.startActivity(intent)
                }
                // Royal Navy
                5 -> {
                    val intent = Intent(view.context, HMSActivity::class.java)
                    intent.putExtra(CATEGORY_KEY, image as Int)
                    view.context.startActivity(intent)
                }
                // Sakura Empire
                6 -> {
                val intent = Intent(view.context, IJNActivity::class.java)
                intent.putExtra(CATEGORY_KEY, image as Int)
                view.context.startActivity(intent)
            }
                else -> println(faction)
            }
        }
    }
}