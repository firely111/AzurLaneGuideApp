package com.example.azurlaneguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class SNEquipmentActivity : MenuActivity() {
//TODO: Update
    val avrora = "https://i.imgur.com/UvcLUT9.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView((R.layout.activity_sn_equipment))

        val image = intent.getIntExtra(SNViewHolder.IMAGE_KEY, -1)
        val imageView: ImageView = findViewById(R.id.sn_equipment_image)
        when (image){
            0 -> {
                Picasso.get().load(avrora).into(imageView)
                supportActionBar?.title = "Avrora"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}