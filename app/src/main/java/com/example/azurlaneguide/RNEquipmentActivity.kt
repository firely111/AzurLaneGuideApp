package com.example.azurlaneguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class RNEquipmentActivity : MenuActivity() {

    val carabiniere = "https://i.imgur.com/NdbLZsU.png"
    val conteDiCavour = "https://i.imgur.com/4TBHDeH.png"
    val giulioCesare = "https://i.imgur.com/4TBHDeH.png"
    val littorio = "https://i.imgur.com/G4wK7Lr.png"
    val trento = "https://i.imgur.com/koKsQXU.png"
    val zara = "https://i.imgur.com/vC2mrVG.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView((R.layout.activity_rn_equipment))

        val image = intent.getIntExtra(RNViewHolder.IMAGE_KEY, -1)
        val imageView: ImageView = findViewById(R.id.rn_equipment_image)
        when (image){
            0 -> {
                Picasso.get().load(carabiniere).into(imageView)
                supportActionBar?.title = "Carabiniere"
            }
            1 -> {
                Picasso.get().load(conteDiCavour).into(imageView)
                supportActionBar?.title = "Conte Di Cavour"
            }
            2 -> {
                Picasso.get().load(giulioCesare).into(imageView)
                supportActionBar?.title = "Giulio Cesare"
            }
            3 -> {
                Picasso.get().load(littorio).into(imageView)
                supportActionBar?.title = "Littorio"
            }
            4 -> {
                Picasso.get().load(trento).into(imageView)
                supportActionBar?.title = "Trento"
            }
            5 -> {
                Picasso.get().load(zara).into(imageView)
                supportActionBar?.title = "Zara"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}