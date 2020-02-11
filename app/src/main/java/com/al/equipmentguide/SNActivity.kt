package com.al.equipmentguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SNActivity : MenuActivity() {

    val snShip: ArrayList<SN> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sn_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_sn)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addSNShip()

        val adapter = SNAdapter(snShip)
        recyclerView.adapter = adapter
    }

    fun addSNShip() {
        val avrora = "https://i.imgur.com/McuR4SJ.png"

        snShip.add(SN(avrora))
    }
}