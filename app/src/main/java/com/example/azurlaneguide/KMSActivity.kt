package com.example.azurlaneguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.azurlaneguide.KMSShip.addKMSAircraftCarrier
import com.example.azurlaneguide.KMSShip.addKMSBattleship
import com.example.azurlaneguide.KMSShip.addKMSDestroyer
import com.example.azurlaneguide.KMSShip.addKMSHeavyCruiser
import com.example.azurlaneguide.KMSShip.addKMSLightCruiser
import com.example.azurlaneguide.KMSShip.addKMSSubmarine

open class KMSActivity : MenuActivity() {

    companion object{
        val kmsShip: ArrayList<KMS> = ArrayList()
        var category: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kms_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_kms)
        recyclerView.layoutManager = LinearLayoutManager(this)

        category = intent.getIntExtra(CategoryViewHolder.CATEGORY_KEY, -1)

        when (category){
            0 -> {
                kmsShip.clear()
                addKMSDestroyer()
                val adapter = KMSAdapter(kmsShip)
                recyclerView.adapter = adapter
            }
            1 -> {
                kmsShip.clear()
                addKMSLightCruiser()
                val adapter = KMSAdapter(kmsShip)
                recyclerView.adapter = adapter
            }
            2 -> {
                kmsShip.clear()
                addKMSHeavyCruiser()
                val adapter = KMSAdapter(kmsShip)
                recyclerView.adapter = adapter
            }
            3 -> {
                kmsShip.clear()
                addKMSBattleship()
                val adapter = KMSAdapter(kmsShip)
                recyclerView.adapter = adapter
            }
            4 -> {
                kmsShip.clear()
                addKMSAircraftCarrier()
                val adapter = KMSAdapter(kmsShip)
                recyclerView.adapter = adapter
            }
            5 -> {
                kmsShip.clear()
                addKMSSubmarine()
                val adapter = KMSAdapter(kmsShip)
                recyclerView.adapter = adapter
            }
            else -> println("KAPPA")
        }
    }
}