package com.al.equipmentguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RNActivity : MenuActivity() {

    val rnShip: ArrayList<RN> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rn_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_rn)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addRNShip()

        val adapter = RNAdapter(rnShip)
        recyclerView.adapter = adapter
    }

    fun addRNShip(){
        val carabiniere = "https://i.imgur.com/3wPgtJQ.png"
        val conteDiCavour = "https://i.imgur.com/73XjhIZ.png"
        val giulioCesare = "https://i.imgur.com/WDaXm6I.png"
        val littorio = "https://i.imgur.com/6ARLlXq.png"
        val trento = "https://i.imgur.com/4L6Qqrk.png"
        val zara = "https://i.imgur.com/m9VgNyC.png"

        rnShip.add(RN(carabiniere))
        rnShip.add(RN(conteDiCavour))
        rnShip.add(RN(giulioCesare))
        rnShip.add(RN(littorio))
        rnShip.add(RN(trento))
        rnShip.add(RN(zara))
    }
}
