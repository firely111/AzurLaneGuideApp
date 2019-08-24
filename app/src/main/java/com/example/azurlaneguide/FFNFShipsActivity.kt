package com.example.azurlaneguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FFNFShipsActivity : MenuActivity() {

    val ffnfShip: ArrayList<FFNF> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ffnf_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_ffnf)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addFFNFShip()

        val adapter = FFNFShipsAdapter(ffnfShip)
        recyclerView.adapter = adapter
    }

    fun addFFNFShip(){
        val emile_bertin = "https://i.imgur.com/1MqX4Mv.png"
        val forbin = "https://i.imgur.com/gBeecs3.png"
        val l_opiniatre = "https://i.imgur.com/cKbVFd8.png"
        val le_temeraire = "https://i.imgur.com/4zLKb3g.png"
        val le_triomphant = "https://i.imgur.com/jUuLk5b.png"
        val saint_louis = "https://i.imgur.com/fVtTkGv.png"
        val surcouf = "https://i.imgur.com/URyq2Wv.png"


        ffnfShip.add(FFNF(emile_bertin))
        ffnfShip.add(FFNF(forbin))
        ffnfShip.add(FFNF(l_opiniatre))
        ffnfShip.add(FFNF(le_temeraire))
        ffnfShip.add(FFNF(le_triomphant))
        ffnfShip.add(FFNF(saint_louis))
        ffnfShip.add(FFNF(surcouf))
    }
}
