package com.example.azurlaneguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryActivity : MenuActivity() {

    val category: ArrayList<Category> = ArrayList()

    companion object{
        var faction: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_rv)

        faction = intent.getIntExtra(FactionViewHolder.FACTION_KEY, -1)

        val recyclerView: RecyclerView = findViewById(R.id.rv_category)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addCategory()

        val adapter = CategoryAdapter(category)
        recyclerView.adapter = adapter
    }

    fun addCategory() {
        val destroyer = "https://i.imgur.com/ppVvYb3.png"
        val l_cruiser = "https://i.imgur.com/hOEqJQh.png"
        val h_cruiser = "https://i.imgur.com/fSFdMbD.png"
        val battleship = "https://i.imgur.com/MVj3myY.png"
        val aircraft_carrier = "https://i.imgur.com/mXduiTQ.png"
        val submarine = "https://i.imgur.com/NJuGuSY.png"

        category.add(Category(destroyer))
        category.add(Category(l_cruiser))
        category.add(Category(h_cruiser))
        category.add(Category(battleship))
        category.add(Category(aircraft_carrier))
        category.add(Category(submarine))
    }
}