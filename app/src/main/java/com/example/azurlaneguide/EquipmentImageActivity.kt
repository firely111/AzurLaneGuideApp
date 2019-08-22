package com.example.azurlaneguide

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class EquipmentImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView((R.layout.activity_equipment_image))

        val image = intent.getIntExtra(FFNFShipsAdapter.ViewHolder.IMAGE_KEY, -1)
        val imageView: ImageView = findViewById(R.id.equipment_image)
        imageView.setImageResource(image)

        val shipName = intent.getStringExtra(FFNFShipsAdapter.ViewHolder.NAME_KEY)
        supportActionBar?.title = shipName
    }
}