package com.example.azurlaneguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class ROCEquipmentActivity : MenuActivity() {

    val anShan = "https://i.imgur.com/VAIDc5D.png"
    val changChun = "https://i.imgur.com/VAIDc5D.png"
    val fuShun = "https://i.imgur.com/VAIDc5D.png"
    val ningHai = "https://i.imgur.com/V3ozULt.png"
    val pingHai = "https://i.imgur.com/V3ozULt.png"
    val taiYuan = "https://i.imgur.com/4EBCPxA.png"
    val yatSen = "https://i.imgur.com/LZO01h6.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView((R.layout.activity_roc_equipment))

        val image = intent.getIntExtra(ROCViewHolder.IMAGE_KEY, -1)
        val imageView: ImageView = findViewById(R.id.roc_equipment_image)
        when (image){
            0 -> {
                Picasso.get().load(anShan).into(imageView)
                supportActionBar?.title = "An Shan"
            }
            1 -> {
                Picasso.get().load(changChun).into(imageView)
                supportActionBar?.title = "Chang Chun"
            }
            2 -> {
                Picasso.get().load(fuShun).into(imageView)
                supportActionBar?.title = "Fu Shun"
            }
            3 -> {
                Picasso.get().load(ningHai).into(imageView)
                supportActionBar?.title = "Ning Hai"
            }
            4 -> {
                Picasso.get().load(pingHai).into(imageView)
                supportActionBar?.title = "Ping Hai"
            }
            5 -> {
                Picasso.get().load(taiYuan).into(imageView)
                supportActionBar?.title = "Tai Yuan"
            }
            6 -> {
                Picasso.get().load(yatSen).into(imageView)
                supportActionBar?.title = "Yat Sen"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}