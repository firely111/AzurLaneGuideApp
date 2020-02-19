package com.al.equipmentguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

open class KMSEquipmentActivity : MenuActivity() {
    companion object{
        var image: Int = 0
        var category: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kms_equipment)

        image = intent.getIntExtra(KMSViewHolder.SHIP_KEY, -1)
        category = intent.getIntExtra(KMSViewHolder.CATEGORY_KEY, -1)

        when(category){
            0 -> showDestroyerEquipment()
            1 -> showLightCruiserEquipment()
            2 -> showHeavyCruiserEquipment()
            3 -> showBattleshipEquipment()
            4 -> showAircraftCarrierEquipment()
            5 -> showSubmarineEquipment()
            else -> println("KAPPA")
        }
    }

    fun showDestroyerEquipment(){
        val imageView: ImageView = findViewById(R.id.kms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(KMSEquipmentImage.z1).into(imageView)
                supportActionBar?.title = "Z1"
            }
            1 -> {
                Picasso.get().load(KMSEquipmentImage.z2).into(imageView)
                supportActionBar?.title = "Z2"
            }
            2 -> {
                Picasso.get().load(KMSEquipmentImage.z18).into(imageView)
                supportActionBar?.title = "Z18"
            }
            3 -> {
                Picasso.get().load(KMSEquipmentImage.z19).into(imageView)
                supportActionBar?.title = "Z19"
            }
            4 -> {
                Picasso.get().load(KMSEquipmentImage.z20).into(imageView)
                supportActionBar?.title = "Z20"
            }
            5 -> {
                Picasso.get().load(KMSEquipmentImage.z21).into(imageView)
                supportActionBar?.title = "Z21"
            }
            6 -> {
                Picasso.get().load(KMSEquipmentImage.z23).into(imageView)
                supportActionBar?.title = "Z23"
            }
            7 -> {
                Picasso.get().load(KMSEquipmentImage.z25).into(imageView)
                supportActionBar?.title = "Z25"
            }
            8 -> {
                Picasso.get().load(KMSEquipmentImage.z35).into(imageView)
                supportActionBar?.title = "Z35"
            }
            9 -> {
                Picasso.get().load(KMSEquipmentImage.z36).into(imageView)
                supportActionBar?.title = "Z36"
            }
            10 -> {
                Picasso.get().load(KMSEquipmentImage.z46).into(imageView)
                supportActionBar?.title = "Z46"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showLightCruiserEquipment(){
        val imageView: ImageView = findViewById(R.id.kms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(KMSEquipmentImage.karlsruhe).into(imageView)
                supportActionBar?.title = "Karlsruhe"
            }
            1 -> {
                Picasso.get().load(KMSEquipmentImage.koln).into(imageView)
                supportActionBar?.title = "Köln"
            }
            2 -> {
                Picasso.get().load(KMSEquipmentImage.konigsberg).into(imageView)
                supportActionBar?.title = "Konigsberg"
            }
            3 -> {
                Picasso.get().load(KMSEquipmentImage.leipzig).into(imageView)
                supportActionBar?.title = "Leipzig"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showHeavyCruiserEquipment(){
        val imageView: ImageView = findViewById(R.id.kms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(KMSEquipmentImage.admiral_graf_spee).into(imageView)
                supportActionBar?.title = "Admiral Graf Spee"
            }
            1 -> {
                Picasso.get().load(KMSEquipmentImage.admiral_hipper).into(imageView)
                supportActionBar?.title = "Admiral Hipper"
            }
            2 -> {
                Picasso.get().load(KMSEquipmentImage.admiral_hipper_muse).into(imageView)
                supportActionBar?.title = "Admiral Hipper μ"
            }
            3 -> {
                Picasso.get().load(KMSEquipmentImage.deutschland).into(imageView)
                supportActionBar?.title = "Deutschland"
            }
            4 -> {
                Picasso.get().load(KMSEquipmentImage.prinz_eugen).into(imageView)
                supportActionBar?.title = "Prinz Eugen"
            }
            5 -> {
                Picasso.get().load(KMSEquipmentImage.roon).into(imageView)
                supportActionBar?.title = "Roon"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showBattleshipEquipment(){
        val imageView: ImageView = findViewById(R.id.kms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(KMSEquipmentImage.bismarck).into(imageView)
                supportActionBar?.title = "Bismarck"
            }
            1 -> {
                Picasso.get().load(KMSEquipmentImage.friedrich_der_grosse).into(imageView)
                supportActionBar?.title = "Friedrich der Grosse"
            }
            2 -> {
                Picasso.get().load(KMSEquipmentImage.gneisenau).into(imageView)
                supportActionBar?.title = "Gneisenau"
            }
            3 -> {
                Picasso.get().load(KMSEquipmentImage.scharnhorst).into(imageView)
                supportActionBar?.title = "Scharnhorst"
            }
            4 -> {
                Picasso.get().load(KMSEquipmentImage.tirpitz).into(imageView)
                supportActionBar?.title = "Tirpitz"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showAircraftCarrierEquipment(){
        val imageView: ImageView = findViewById(R.id.kms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(KMSEquipmentImage.graf_zeppelin).into(imageView)
                supportActionBar?.title = "Graf Zeppelin"
            }
            1 -> {
                Picasso.get().load(KMSEquipmentImage.zeppy).into(imageView)
                supportActionBar?.title = "Zeppy"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showSubmarineEquipment(){
        val imageView: ImageView = findViewById(R.id.kms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(KMSEquipmentImage.u47).into(imageView)
                supportActionBar?.title = "U47"
            }
            1 -> {
                Picasso.get().load(KMSEquipmentImage.u73).into(imageView)
                supportActionBar?.title = "U73"
            }
            2 -> {
                Picasso.get().load(KMSEquipmentImage.u81).into(imageView)
                supportActionBar?.title = "U81"
            }
            3 -> {
                Picasso.get().load(KMSEquipmentImage.u101).into(imageView)
                supportActionBar?.title = "U101"
            }
            4 -> {
                Picasso.get().load(KMSEquipmentImage.u522).into(imageView)
                supportActionBar?.title = "U522"
            }
            5 -> {
                Picasso.get().load(KMSEquipmentImage.u556).into(imageView)
                supportActionBar?.title = "U556"
            }
            6 -> {
                Picasso.get().load(KMSEquipmentImage.u557).into(imageView)
                supportActionBar?.title = "U557"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}