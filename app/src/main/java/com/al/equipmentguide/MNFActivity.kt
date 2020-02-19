package com.al.equipmentguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MNFActivity : MenuActivity() {

    val mnfShip: ArrayList<MNF> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mnf_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_mnf)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addMNFShip()

        val adapter = MNFAdapter(mnfShip)
        recyclerView.adapter = adapter
    }

    fun addMNFShip(){
        val dunkerque = "https://i.imgur.com/1ANaDcT.png"
        val gascogne = "https://i.imgur.com/P3BbHEl.png"
        val gascogneMuse = "https://i.imgur.com/C7MNidJ.jpg"
        val jeanBart = "https://i.imgur.com/U24r7kr.png"
        val leMalin = "https://i.imgur.com/h6GiN4W.png"
        val leMars = "https://i.imgur.com/9sfVJiV.png"

        mnfShip.add(MNF(dunkerque))
        mnfShip.add(MNF(gascogne))
        mnfShip.add(MNF(gascogneMuse))
        mnfShip.add(MNF(jeanBart))
        mnfShip.add(MNF(leMalin))
        mnfShip.add(MNF(leMars))
    }
}
