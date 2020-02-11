package com.al.equipmentguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class FFNFEquipmentActivity : MenuActivity() {

    val emileBertin = "https://i.imgur.com/w8T9JT2.png"
    val forbin = "https://i.imgur.com/NdbLZsU.png"
    val lOpiniatre = "https://i.imgur.com/NdbLZsU.png" // Not in EN Yet
    val leTemeraire = "https://i.imgur.com/NdbLZsU.png"
    val leTriomphant = "https://i.imgur.com/NdbLZsU.png"
    val saintLouis = "https://i.imgur.com/xy0RQek.png"
    val surcouf = "https://i.imgur.com/nw7tWom.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView((R.layout.activity_ffnf_equipment))

        val image = intent.getIntExtra(FFNFViewHolder.IMAGE_KEY, -1)
        val imageView: ImageView = findViewById(R.id.ffnf_equipment_image)
        when (image){
            0 -> {
                Picasso.get().load(emileBertin).into(imageView)
                supportActionBar?.title = "Emile Bertin"
            }
            1 -> {
                Picasso.get().load(forbin).into(imageView)
                supportActionBar?.title = "Forbin"
            }
            2 -> {
                Picasso.get().load(lOpiniatre).into(imageView)
                supportActionBar?.title = "L'Opiniâtre"
            }
            3 -> {
                Picasso.get().load(leTemeraire).into(imageView)
                supportActionBar?.title = "Le Temeraire"
            }
            4 -> {
                Picasso.get().load(leTriomphant).into(imageView)
                supportActionBar?.title = "Le Triomphant"
            }
            5 -> {
                Picasso.get().load(saintLouis).into(imageView)
                supportActionBar?.title = "Saint Louis"
            }
            6 -> {
                Picasso.get().load(surcouf).into(imageView)
                supportActionBar?.title = "Surcouf"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}