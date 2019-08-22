package com.example.azurlaneguide

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FFNFShipsActivity : AppCompatActivity() {

    val ffnfShips: ArrayList<FFNFData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ffnf_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_ffnf)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addFFNFShips()

        val adapter = FFNFShipsAdapter(ffnfShips)
        recyclerView.adapter = adapter
    }

    fun addFFNFShips(){
        ffnfShips.add(FFNFData(BitmapFactory.decodeResource(resources, R.drawable.emile_bertin_icon)))
        ffnfShips.add(FFNFData(BitmapFactory.decodeResource(resources, R.drawable.forbin_icon)))
        ffnfShips.add(FFNFData(BitmapFactory.decodeResource(resources, R.drawable.l_opiniatre_icon)))
        ffnfShips.add(FFNFData(BitmapFactory.decodeResource(resources, R.drawable.le_temeraire_icon)))
        ffnfShips.add(FFNFData(BitmapFactory.decodeResource(resources, R.drawable.le_triomphant_icon)))
        ffnfShips.add(FFNFData(BitmapFactory.decodeResource(resources, R.drawable.saint_louis_icon)))
        ffnfShips.add(FFNFData(BitmapFactory.decodeResource(resources, R.drawable.surcouf_icon)))
    }
}
