package com.example.azurlaneguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

open class IJNActivity : MenuActivity() {

    companion object{
        val ijnShip: ArrayList<IJN> = ArrayList()
        var category: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ijn_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_ijn)
        recyclerView.layoutManager = LinearLayoutManager(this)

        category = intent.getIntExtra(CategoryViewHolder.CATEGORY_KEY, -1)

        when (category){
            0 -> {
                ijnShip.clear()
                IJNShip.addIJNDestroyer()
                val adapter = IJNAdapter(ijnShip)
                recyclerView.adapter = adapter
            }
            1 -> {
                ijnShip.clear()
                IJNShip.addIJNLightCruiser()
                val adapter = IJNAdapter(ijnShip)
                recyclerView.adapter = adapter
            }
            2 -> {
                ijnShip.clear()
                IJNShip.addIJNHeavyCruiser()
                val adapter = IJNAdapter(ijnShip)
                recyclerView.adapter = adapter
            }
            3 -> {
                ijnShip.clear()
                IJNShip.addIJNBattleship()
                val adapter = IJNAdapter(ijnShip)
                recyclerView.adapter = adapter
            }
            4 -> {
                ijnShip.clear()
                IJNShip.addIJNAircraftCarrier()
                val adapter = IJNAdapter(ijnShip)
                recyclerView.adapter = adapter
            }
            5 -> {
                ijnShip.clear()
                IJNShip.addIJNSubmarine()
                val adapter = IJNAdapter(ijnShip)
                recyclerView.adapter = adapter
            }
            else -> println("KAPPA")
        }
    }
}