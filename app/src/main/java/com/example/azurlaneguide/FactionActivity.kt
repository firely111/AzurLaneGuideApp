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
        val eagle_union = "https://i.imgur.com/ECMtVCz.png"
        val eastern_radiance = "https://i.imgur.com/NpEpTov.png"
        val iris_libre = "https://i.imgur.com/ivXHeRb.png"
        val ironblood = "https://i.imgur.com/IVUeEoa.png"
        val north_union = "https://i.imgur.com/Go8nSkJ.png"
        val royal_navy = "https://i.imgur.com/lXbpENL.png"
        val sakura_empire = "https://i.imgur.com/6uc3q2l.png"
        val vichya_dominion = "https://i.imgur.com/6ciqjsx.png"

        faction.add(Faction(eagle_union))
        faction.add(Faction(eastern_radiance))
        faction.add(Faction(iris_libre))
        faction.add(Faction(ironblood))
        faction.add(Faction(north_union))
        faction.add(Faction(royal_navy))
        faction.add(Faction(sakura_empire))
        faction.add(Faction(vichya_dominion))
    }

}
