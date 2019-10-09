package com.example.azurlaneguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MNFEquipmentActivity : MenuActivity() {

    val dunkerque = "https://i.imgur.com/kYTO4F2.png"
    val gascogne = "https://i.imgur.com/bBppwDC.png"
    val jeanBart = "https://i.imgur.com/i7wu63C.png"
    val leMalin = "https://i.imgur.com/NdbLZsU.png"
    val leMars = "https://i.imgur.com/NdbLZsU.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView((R.layout.activity_mnf_equipment))

        val image = intent.getIntExtra(MNFViewHolder.IMAGE_KEY, -1)
        val imageView: ImageView = findViewById(R.id.mnf_equipment_image)
        when (image){
            0 -> {
                Picasso.get().load(dunkerque).into(imageView)
                supportActionBar?.title = "Dunkerque"
            }
            1 -> {
                Picasso.get().load(gascogne).into(imageView)
                supportActionBar?.title = "Gascogne"
            }
            2 -> {
                Picasso.get().load(jeanBart).into(imageView)
                supportActionBar?.title = "Jean Bart"
            }
            3 -> {
                Picasso.get().load(leMalin).into(imageView)
                supportActionBar?.title = "Le Malin"
            }
            4 -> {
                Picasso.get().load(leMars).into(imageView)
                supportActionBar?.title = "Le Mars"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}