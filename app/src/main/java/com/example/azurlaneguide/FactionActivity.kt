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
        val dragonEmpery = "https://i.imgur.com/aw2EvFQ.png"
        val eagleUnion = "https://i.imgur.com/t1MHIyr.png"
        val irisLibre = "https://i.imgur.com/qpwwRMp.png"
        val ironblood = "https://i.imgur.com/53tGIRl.png"
        val northernParliament = "https://i.imgur.com/fKpPnbX.png"
        val royalNavy = "https://i.imgur.com/Oom5ire.png"
        val sakuraEmpire = "https://i.imgur.com/3oXJxuH.png"
        val sardegnaEmpire = "https://i.imgur.com/ocV1zE5.jpg"
        val vichyaDominion = "https://i.imgur.com/EPqekcz.png"

        faction.add(Faction(dragonEmpery))
        faction.add(Faction(eagleUnion))
        faction.add(Faction(irisLibre))
        faction.add(Faction(ironblood))
        faction.add(Faction(northernParliament))
        faction.add(Faction(royalNavy))
        faction.add(Faction(sakuraEmpire))
        faction.add(Faction(sardegnaEmpire))
        faction.add(Faction(vichyaDominion))
    }

}
