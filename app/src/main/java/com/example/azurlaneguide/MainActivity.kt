package com.example.azurlaneguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        faction_iris_libre.setOnClickListener{
                val i = Intent(this, FFNFShipsActivity::class.java)
                startActivity(i)
        }

    }

}
