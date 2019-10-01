package com.example.azurlaneguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.azurlaneguide.HMSShip.addHMSAircraftCarrier
import com.example.azurlaneguide.HMSShip.addHMSBattleship
import com.example.azurlaneguide.HMSShip.addHMSDestroyer
import com.example.azurlaneguide.HMSShip.addHMSHeavyCruiser
import com.example.azurlaneguide.HMSShip.addHMSLightCruiser

open class HMSActivity : MenuActivity() {

    companion object{
        val hmsShip: ArrayList<HMS> = ArrayList()
        var category: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hms_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_hms)
        recyclerView.layoutManager = LinearLayoutManager(this)

        category = intent.getIntExtra(CategoryViewHolder.CATEGORY_KEY, -1)

        when (category){
            0 -> {
                hmsShip.clear()
                addHMSDestroyer()
                val adapter = HMSAdapter(hmsShip)
                recyclerView.adapter = adapter
            }
            1 -> {
                hmsShip.clear()
                addHMSLightCruiser()
                val adapter = HMSAdapter(hmsShip)
                recyclerView.adapter = adapter
            }
            2 -> {
                hmsShip.clear()
                addHMSHeavyCruiser()
                val adapter = HMSAdapter(hmsShip)
                recyclerView.adapter = adapter
            }
            3 -> {
                hmsShip.clear()
                addHMSBattleship()
                val adapter = HMSAdapter(hmsShip)
                recyclerView.adapter = adapter
            }
            4 -> {
                hmsShip.clear()
                addHMSAircraftCarrier()
                val adapter = HMSAdapter(hmsShip)
                recyclerView.adapter = adapter
            }
            else -> println("KAPPA")
        }
    }
}