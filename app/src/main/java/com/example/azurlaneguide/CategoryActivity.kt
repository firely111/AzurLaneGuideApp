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
        val destroyer = "https://i.imgur.com/clGqyyN.png"
        val l_cruiser = "https://i.imgur.com/LADxoCN.png"
        val h_cruiser = "https://i.imgur.com/mDkd7Eu.png"
        val battleship = "https://i.imgur.com/fierJci.png"
        val aircraft_carrier = "https://i.imgur.com/TCZzPvq.png"
        val submarine = "https://i.imgur.com/AQ22Uzj.png"

        category.add(Category(destroyer))
        category.add(Category(l_cruiser))
        category.add(Category(h_cruiser))
        category.add(Category(battleship))
        category.add(Category(aircraft_carrier))
        category.add(Category(submarine))
    }
}