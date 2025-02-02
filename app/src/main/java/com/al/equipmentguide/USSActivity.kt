package com.al.equipmentguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.al.equipmentguide.USSShip.addUSSAircraftCarrier
import com.al.equipmentguide.USSShip.addUSSBattleship
import com.al.equipmentguide.USSShip.addUSSDestroyer
import com.al.equipmentguide.USSShip.addUSSHeavyCruiser
import com.al.equipmentguide.USSShip.addUSSLightCruiser
import com.al.equipmentguide.USSShip.addUSSSubmarine

open class USSActivity : MenuActivity() {

    companion object{
        val ussShip: ArrayList<USS> = ArrayList()
        var category: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uss_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_uss)
        recyclerView.layoutManager = LinearLayoutManager(this)

        category = intent.getIntExtra(CategoryViewHolder.CATEGORY_KEY, -1)

        when (category){
            0 -> {
                ussShip.clear()
                addUSSDestroyer()
                val adapter = USSAdapter(ussShip)
                recyclerView.adapter = adapter
            }
            1 -> {
                ussShip.clear()
                addUSSLightCruiser()
                val adapter = USSAdapter(ussShip)
                recyclerView.adapter = adapter
            }
            2 -> {
                ussShip.clear()
                addUSSHeavyCruiser()
                val adapter = USSAdapter(ussShip)
                recyclerView.adapter = adapter
            }
            3 -> {
                ussShip.clear()
                addUSSBattleship()
                val adapter = USSAdapter(ussShip)
                recyclerView.adapter = adapter
            }
            4 -> {
                ussShip.clear()
                addUSSAircraftCarrier()
                val adapter = USSAdapter(ussShip)
                recyclerView.adapter = adapter
            }
            5 -> {
                ussShip.clear()
                addUSSSubmarine()
                val adapter = USSAdapter(ussShip)
                recyclerView.adapter = adapter
            }
            else -> println("KAPPA")
        }
    }
}