package com.example.azurlaneguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FFNFActivity : MenuActivity() {

    val ffnfShip: ArrayList<FFNF> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ffnf_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_ffnf)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addFFNFShip()

        val adapter = FFNFAdapter(ffnfShip)
        recyclerView.adapter = adapter
    }

    fun addFFNFShip(){
        val emileBertin = "https://i.imgur.com/GBH7SYM.png"
        val forbin = "https://i.imgur.com/XG7OOhp.png"
        val lOpiniatre = "https://i.imgur.com/AL6sHgB.png"
        val leTemeraire = "https://i.imgur.com/xa9b4Av.png"
        val leTriomphant = "https://i.imgur.com/gavKxpC.png"
        val saintLouis = "https://i.imgur.com/eMrkbpm.png"
        val surcouf = "https://i.imgur.com/UOVBbue.png"


        ffnfShip.add(FFNF(emileBertin))
        ffnfShip.add(FFNF(forbin))
        ffnfShip.add(FFNF(lOpiniatre))
        ffnfShip.add(FFNF(leTemeraire))
        ffnfShip.add(FFNF(leTriomphant))
        ffnfShip.add(FFNF(saintLouis))
        ffnfShip.add(FFNF(surcouf))
    }
}
