package com.example.azurlaneguide

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
        Picasso.get().load(category.image).into(imageView)
    }

    companion object{
        val CATEGORY_KEY = "CATEGORY"
    }

    init {
        view.setOnClickListener{
// TODO: Add redirection to Eagle Union, Royal Navy, Sakura Empire
            when (faction){
                3 -> {
                    val intent = Intent(view.context, KMSActivity::class.java)
                    intent.putExtra(CATEGORY_KEY, image as Int)
                    view.context.startActivity(intent)
                }
                else -> println(faction)
            }
        }
    }
}