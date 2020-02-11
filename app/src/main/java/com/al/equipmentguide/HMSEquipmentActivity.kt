package com.al.equipmentguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

open class HMSEquipmentActivity : MenuActivity() {
    companion object{
        var image: Int = 0
        var category: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hms_equipment)

        image = intent.getIntExtra(HMSViewHolder.SHIP_KEY, -1)
        category = intent.getIntExtra(HMSViewHolder.CATEGORY_KEY, -1)

        when(category){
            0 -> showDestroyerEquipment()
            1 -> showLightCruiserEquipment()
            2 -> showHeavyCruiserEquipment()
            3 -> showBattleshipEquipment()
            4 -> showAircraftCarrierEquipment()
            else -> println("KAPPA")
        }
    }

    fun showDestroyerEquipment(){
        val imageView: ImageView = findViewById(R.id.hms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(HMSEquipmentImage.acasta).into(imageView)
                supportActionBar?.title = "Acasta"
            }
            1 -> {
                Picasso.get().load(HMSEquipmentImage.amazon).into(imageView)
                supportActionBar?.title = "Amazon"
            }
            2 -> {
                Picasso.get().load(HMSEquipmentImage.ardent).into(imageView)
                supportActionBar?.title = "Ardent"
            }
            3 -> {
                Picasso.get().load(HMSEquipmentImage.beagle).into(imageView)
                supportActionBar?.title = "Beagle"
            }
            4 -> {
                Picasso.get().load(HMSEquipmentImage.bulldog).into(imageView)
                supportActionBar?.title = "Bulldog"
            }
            5 -> {
                Picasso.get().load(HMSEquipmentImage.comet).into(imageView)
                supportActionBar?.title = "Comet"
            }
            6 -> {
                Picasso.get().load(HMSEquipmentImage.crescent).into(imageView)
                supportActionBar?.title = "Crescent"
            }
            7 -> {
                Picasso.get().load(HMSEquipmentImage.cygnet).into(imageView)
                supportActionBar?.title = "Cygnet"
            }
            8 -> {
                Picasso.get().load(HMSEquipmentImage.echo).into(imageView)
                supportActionBar?.title = "Echo"
            }
            9 -> {
                Picasso.get().load(HMSEquipmentImage.fortune).into(imageView)
                supportActionBar?.title = "Fortune"
            }
            10 -> {
                Picasso.get().load(HMSEquipmentImage.foxhound).into(imageView)
                supportActionBar?.title = "Foxhound"
            }
            11 -> {
                Picasso.get().load(HMSEquipmentImage.glowworm).into(imageView)
                supportActionBar?.title = "Glowworm"
            }
            12 -> {
                Picasso.get().load(HMSEquipmentImage.grenville).into(imageView)
                supportActionBar?.title = "Grenville"
            }
            13 -> {
                Picasso.get().load(HMSEquipmentImage.hardy).into(imageView)
                supportActionBar?.title = "Hardy"
            }
            14 -> {
                Picasso.get().load(HMSEquipmentImage.hunter).into(imageView)
                supportActionBar?.title = "Hunter"
            }
            15 -> {
                Picasso.get().load(HMSEquipmentImage.javelin).into(imageView)
                supportActionBar?.title = "Javelin"
            }
            16 -> {
                Picasso.get().load(HMSEquipmentImage.jersey).into(imageView)
                supportActionBar?.title = "Jersey"
            }
            17 -> {
                Picasso.get().load(HMSEquipmentImage.juno).into(imageView)
                supportActionBar?.title = "Juno"
            }
            18 -> {
                Picasso.get().load(HMSEquipmentImage.jupiter).into(imageView)
                supportActionBar?.title = "Jupiter"
            }
            19 -> {
                Picasso.get().load(HMSEquipmentImage.matchless).into(imageView)
                supportActionBar?.title = "Matchless"
            }
            20 -> {
                Picasso.get().load(HMSEquipmentImage.musketeer).into(imageView)
                supportActionBar?.title = "Musketeer"
            }
            21 -> {
                Picasso.get().load(HMSEquipmentImage.vampire).into(imageView)
                supportActionBar?.title = "Vampire"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showLightCruiserEquipment(){
        val imageView: ImageView = findViewById(R.id.hms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(HMSEquipmentImage.achilles).into(imageView)
                supportActionBar?.title = "Achilles"
            }
            1 -> {
                Picasso.get().load(HMSEquipmentImage.ajax).into(imageView)
                supportActionBar?.title = "Ajax"
            }
            2 -> {
                Picasso.get().load(HMSEquipmentImage.arethusa).into(imageView)
                supportActionBar?.title = "Arethusa"
            }
            3 -> {
                Picasso.get().load(HMSEquipmentImage.aurora).into(imageView)
                supportActionBar?.title = "Aurora"
            }
            4 -> {
                Picasso.get().load(HMSEquipmentImage.belfast).into(imageView)
                supportActionBar?.title = "Belfast"
            }
            5 -> {
                Picasso.get().load(HMSEquipmentImage.blackPrince).into(imageView)
                supportActionBar?.title = "Black Prince"
            }
            6 -> {
                Picasso.get().load(HMSEquipmentImage.curacoa).into(imageView)
                supportActionBar?.title = "Curacoa"
            }
            7 -> {
                Picasso.get().load(HMSEquipmentImage.curlew).into(imageView)
                supportActionBar?.title = "Curlew"
            }
            8 -> {
                Picasso.get().load(HMSEquipmentImage.dido).into(imageView)
                supportActionBar?.title = "Dido"
            }
            9 -> {
                Picasso.get().load(HMSEquipmentImage.edinburgh).into(imageView)
                supportActionBar?.title = "Edinburgh"
            }
            10 -> {
                Picasso.get().load(HMSEquipmentImage.fiji).into(imageView)
                supportActionBar?.title = "Fiji"
            }
            11 -> {
                Picasso.get().load(HMSEquipmentImage.galatea).into(imageView)
                supportActionBar?.title = "Galatea"
            }
            12 -> {
                Picasso.get().load(HMSEquipmentImage.glasgow).into(imageView)
                supportActionBar?.title = "Glasgow"
            }
            13 -> {
                Picasso.get().load(HMSEquipmentImage.gloucester).into(imageView)
                supportActionBar?.title = "Gloucester"
            }
            14 -> {
                Picasso.get().load(HMSEquipmentImage.neptune).into(imageView)
                supportActionBar?.title = "Neptune"
            }
            15 -> {
                Picasso.get().load(HMSEquipmentImage.jamaica).into(imageView)
                supportActionBar?.title = "Jamaica"
            }
            16 -> {
                Picasso.get().load(HMSEquipmentImage.leander).into(imageView)
                supportActionBar?.title = "Leander"
            }
            17 -> {
                Picasso.get().load(HMSEquipmentImage.littleBel).into(imageView)
                supportActionBar?.title = "Little Bel"
            }
            18 -> {
                Picasso.get().load(HMSEquipmentImage.newcastle).into(imageView)
                supportActionBar?.title = "Newcastle"
            }
            19 -> {
                Picasso.get().load(HMSEquipmentImage.sheffield).into(imageView)
                supportActionBar?.title = "Sheffield"
            }
            20 -> {
                Picasso.get().load(HMSEquipmentImage.sirius).into(imageView)
                supportActionBar?.title = "Sirius"
            }
            21 -> {
                Picasso.get().load(HMSEquipmentImage.southampton).into(imageView)
                supportActionBar?.title = "Southampton"
            }
            22 -> {
                Picasso.get().load(HMSEquipmentImage.swiftsure).into(imageView)
                supportActionBar?.title = "Swiftsure"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showHeavyCruiserEquipment(){
        val imageView: ImageView = findViewById(R.id.hms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(HMSEquipmentImage.dorsetshire).into(imageView)
                supportActionBar?.title = "Dorsetshire"
            }
            1 -> {
                Picasso.get().load(HMSEquipmentImage.exeter).into(imageView)
                supportActionBar?.title = "Exeter"
            }
            2 -> {
                Picasso.get().load(HMSEquipmentImage.kent).into(imageView)
                supportActionBar?.title = "Kent"
            }
            3 -> {
                Picasso.get().load(HMSEquipmentImage.london).into(imageView)
                supportActionBar?.title = "London"
            }
            4 -> {
                Picasso.get().load(HMSEquipmentImage.norfolk).into(imageView)
                supportActionBar?.title = "Norfolk"
            }
            5 -> {
                Picasso.get().load(HMSEquipmentImage.shirosphire).into(imageView)
                supportActionBar?.title = "Shropshire"
            }
            6 -> {
                Picasso.get().load(HMSEquipmentImage.suffolk).into(imageView)
                supportActionBar?.title = "Suffolk"
            }
            7 -> {
                Picasso.get().load(HMSEquipmentImage.sussex).into(imageView)
                supportActionBar?.title = "Sussex"
            }
            8 -> {
                Picasso.get().load(HMSEquipmentImage.york).into(imageView)
                supportActionBar?.title = "York"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showBattleshipEquipment(){
        val imageView: ImageView = findViewById(R.id.hms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(HMSEquipmentImage.abercrombie).into(imageView)
                supportActionBar?.title = "Abercrombie"
            }
            1 -> {
                Picasso.get().load(HMSEquipmentImage.dukeOfYork).into(imageView)
                supportActionBar?.title = "Duke of York"
            }
            2 -> {
                Picasso.get().load(HMSEquipmentImage.erebus).into(imageView)
                supportActionBar?.title = "Erebus"
            }
            3 -> {
                Picasso.get().load(HMSEquipmentImage.hood).into(imageView)
                supportActionBar?.title = "Hood"
            }
            4 -> {
                Picasso.get().load(HMSEquipmentImage.kingGeorgeV).into(imageView)
                supportActionBar?.title = "King George V"
            }
            5 -> {
                Picasso.get().load(HMSEquipmentImage.monarch).into(imageView)
                supportActionBar?.title = "Monarch"
            }
            6 -> {
                Picasso.get().load(HMSEquipmentImage.nelson).into(imageView)
                supportActionBar?.title = "Nelson"
            }
            7 -> {
                Picasso.get().load(HMSEquipmentImage.princeOfWales).into(imageView)
                supportActionBar?.title = "Prince of Wales"
            }
            8 -> {
                Picasso.get().load(HMSEquipmentImage.queenElizabeth).into(imageView)
                supportActionBar?.title = "Queen Elizabeth"
            }
            9 -> {
                Picasso.get().load(HMSEquipmentImage.renown).into(imageView)
                supportActionBar?.title = "Renown"
            }
            10 -> {
                Picasso.get().load(HMSEquipmentImage.repulse).into(imageView)
                supportActionBar?.title = "Repulse"
            }
            11 -> {
                Picasso.get().load(HMSEquipmentImage.rodney).into(imageView)
                supportActionBar?.title = "Rodney"
            }
            12 -> {
                Picasso.get().load(HMSEquipmentImage.terror).into(imageView)
                supportActionBar?.title = "Terror"
            }
            13 -> {
                Picasso.get().load(HMSEquipmentImage.warspite).into(imageView)
                supportActionBar?.title = "Warspite"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showAircraftCarrierEquipment(){
        val imageView: ImageView = findViewById(R.id.hms_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(HMSEquipmentImage.arkRoyal).into(imageView)
                supportActionBar?.title = "Ark Royal"
            }
            1 -> {
                Picasso.get().load(HMSEquipmentImage.centaur).into(imageView)
                supportActionBar?.title = "Centaur"
            }
            2 -> {
                Picasso.get().load(HMSEquipmentImage.chaser).into(imageView)
                supportActionBar?.title = "Chaser"
            }
            3 -> {
                Picasso.get().load(HMSEquipmentImage.formidable).into(imageView)
                supportActionBar?.title = "Formidable"
            }
            4 -> {
                Picasso.get().load(HMSEquipmentImage.glorious).into(imageView)
                supportActionBar?.title = "Glorious"
            }
            5 -> {
                Picasso.get().load(HMSEquipmentImage.hermes).into(imageView)
                supportActionBar?.title = "Hermes"
            }
            6 -> {
                Picasso.get().load(HMSEquipmentImage.illustrious).into(imageView)
                supportActionBar?.title = "Illustrious"
            }
            7 -> {
                Picasso.get().load(HMSEquipmentImage.unicorn).into(imageView)
                supportActionBar?.title = "Unicorn"
            }
            8 -> {
                Picasso.get().load(HMSEquipmentImage.victorious).into(imageView)
                supportActionBar?.title = "Victorious"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}