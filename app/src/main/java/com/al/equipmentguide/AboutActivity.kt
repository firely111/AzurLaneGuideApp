package com.al.equipmentguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class AboutActivity : MenuActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val imageView: ImageView = findViewById(R.id.about)
        Picasso.get().load("https://i.imgur.com/5hSux3S.png").into(imageView) // Big Chungus
    }
}