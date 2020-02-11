package com.al.equipmentguide

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ROCActivity : MenuActivity() {

    val rocShip: ArrayList<ROC> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roc_rv)

        val recyclerView: RecyclerView = findViewById(R.id.rv_roc)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addROCShip()

        val adapter = ROCAdapter(rocShip)
        recyclerView.adapter = adapter
    }

    fun addROCShip(){
        val ah_shan = "https://i.imgur.com/wpIjcDS.png"
        val chang_chun = "https://i.imgur.com/EmTFiuU.png"
        val fu_shun = "https://i.imgur.com/q3MXgg8.png"
        val ning_hai = "https://i.imgur.com/rGxy7U5.png"
        val ping_hai = "https://i.imgur.com/OZq34rl.png"
        val tai_yuan = "https://i.imgur.com/IqyBuqG.png"
        val yat_sen = "https://i.imgur.com/Sdf1Fp1.png"


        rocShip.add(ROC(ah_shan))
        rocShip.add(ROC(chang_chun))
        rocShip.add(ROC(fu_shun))
        rocShip.add(ROC(ning_hai))
        rocShip.add(ROC(ping_hai))
        rocShip.add(ROC(tai_yuan))
        rocShip.add(ROC(yat_sen))

    }
}
