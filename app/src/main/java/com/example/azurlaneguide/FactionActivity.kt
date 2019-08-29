package com.example.azurlaneguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FactionActivity : MenuActivity() {

    val faction: ArrayList<Faction> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faction_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_faction)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addFaction()

        val adapter = FactionAdapter(faction)
        recyclerView.adapter = adapter
    }

    fun addFaction(){
        val dragon_empery = "https://i.imgur.com/ZrIFyqy.jpg"
        val eagle_union = "https://i.imgur.com/gQP7I3z.jpg"
        val iris_libre = "https://i.imgur.com/51vmeac.jpg"
        val ironblood = "https://i.imgur.com/dWCaXGY.jpg"
        val northern_parliament = "https://i.imgur.com/uNsUmIm.png"
        val royal_navy = "https://i.imgur.com/P6awAK8.png"
        val sakura_empire = "https://i.imgur.com/w49gVNx.jpg"
        val vichya_dominion = "https://i.imgur.com/IIAIq64.jpg"

        faction.add(Faction(dragon_empery))
        faction.add(Faction(eagle_union))
        faction.add(Faction(iris_libre))
        faction.add(Faction(ironblood))
        faction.add(Faction(northern_parliament))
        faction.add(Faction(royal_navy))
        faction.add(Faction(sakura_empire))
        faction.add(Faction(vichya_dominion))
    }

}
