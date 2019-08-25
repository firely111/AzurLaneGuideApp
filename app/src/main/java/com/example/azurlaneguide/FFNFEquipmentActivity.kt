package com.example.azurlaneguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class FFNFEquipmentActivity : MenuActivity() {

    val emileBertin = "https://i.imgur.com/UvcLUT9.png"
    val forbin = "https://i.imgur.com/zlzt4R0.png"
    val lOpiniatre = "https://i.imgur.com/g5RBc23.png" // Not in EN Yet
    val leTemeraire = "https://i.imgur.com/zlzt4R0.png"
    val leTriomphant = "https://i.imgur.com/zlzt4R0.png"
    val saintLouis = "https://i.imgur.com/33xKFay.png"
    val surcouf = "https://i.imgur.com/hQn6mc5.png"

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