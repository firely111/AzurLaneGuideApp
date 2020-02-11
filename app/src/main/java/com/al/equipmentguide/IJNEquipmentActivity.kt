package com.al.equipmentguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

open class IJNEquipmentActivity : MenuActivity() {
    companion object{
        var image: Int = 0
        var category: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ijn_equipment)

        image = intent.getIntExtra(IJNViewHolder.SHIP_KEY, -1)
        category = intent.getIntExtra(IJNViewHolder.CATEGORY_KEY, -1)

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
        val imageView: ImageView = findViewById(R.id.ijn_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(IJNEquipmentImage.akatsuki).into(imageView)
                supportActionBar?.title = "Akatsuki"
            }
            1 -> {
                Picasso.get().load(IJNEquipmentImage.arashio).into(imageView)
                supportActionBar?.title = "Arashio"
            }
            2 -> {
                Picasso.get().load(IJNEquipmentImage.ariake).into(imageView)
                supportActionBar?.title = "Ariake"
            }
            3 -> {
                Picasso.get().load(IJNEquipmentImage.asashio).into(imageView)
                supportActionBar?.title = "Asashio"
            }
            4 -> {
                Picasso.get().load(IJNEquipmentImage.ayanami).into(imageView)
                supportActionBar?.title = "Ayanami"
            }
            5 -> {
                Picasso.get().load(IJNEquipmentImage.fubuki).into(imageView)
                supportActionBar?.title = "Fubuki"
            }
            6 -> {
                Picasso.get().load(IJNEquipmentImage.fumizuki).into(imageView)
                supportActionBar?.title = "Fumizuki"
            }
            7 -> {
            Picasso.get().load(IJNEquipmentImage.hamakaze).into(imageView)
            supportActionBar?.title = "Hamakaze"
        }
            8 -> {
                Picasso.get().load(IJNEquipmentImage.harutsuki).into(imageView)
                supportActionBar?.title = "Harutsuki"
            }
            9 -> {
                Picasso.get().load(IJNEquipmentImage.hatakaze).into(imageView)
                supportActionBar?.title = "Hatakaze"
            }
            10 -> {
                Picasso.get().load(IJNEquipmentImage.hatsuharu).into(imageView)
                supportActionBar?.title = "Hatsuharu"
            }
            11 -> {
                Picasso.get().load(IJNEquipmentImage.hatsushimo).into(imageView)
                supportActionBar?.title = "Hatsushimo"
            }
            12 -> {
                Picasso.get().load(IJNEquipmentImage.hibiki).into(imageView)
                supportActionBar?.title = "Hibiki"
            }
            13 -> {
                Picasso.get().load(IJNEquipmentImage.ikazuchi).into(imageView)
                supportActionBar?.title = "Ikazuchi"
            }
            14 -> {
                Picasso.get().load(IJNEquipmentImage.inazuma).into(imageView)
                supportActionBar?.title = "Inazuma"
            }
            15 -> {
                Picasso.get().load(IJNEquipmentImage.isokaze).into(imageView)
                supportActionBar?.title = "Isokaze"
            }
            16 -> {
                Picasso.get().load(IJNEquipmentImage.kagerou).into(imageView)
                supportActionBar?.title = "Kagerou"
            }
            17 -> {
                Picasso.get().load(IJNEquipmentImage.kamikaze).into(imageView)
                supportActionBar?.title = "Kamikaze"
            }
            18 -> {
                Picasso.get().load(IJNEquipmentImage.kasumi).into(imageView)
                supportActionBar?.title = "Kasumi"
            }
            19 -> {
                Picasso.get().load(IJNEquipmentImage.kawakaze).into(imageView)
                supportActionBar?.title = "Kawakaze"
            }
            20 -> {
                Picasso.get().load(IJNEquipmentImage.kisaragi).into(imageView)
                supportActionBar?.title = "Kisaragi"
            }
            21 -> {
                Picasso.get().load(IJNEquipmentImage.kitakaze).into(imageView)
                supportActionBar?.title = "Kitakaze"
            }
            22 -> {
                Picasso.get().load(IJNEquipmentImage.kiyonami).into(imageView)
                supportActionBar?.title = "Kiyonami"
            }
            23 -> {
                Picasso.get().load(IJNEquipmentImage.kuroshio).into(imageView)
                supportActionBar?.title = "Kuroshio"
            }
            24 -> {
                Picasso.get().load(IJNEquipmentImage.makinami).into(imageView)
                supportActionBar?.title = "Makinami"
            }
            25 -> {
                Picasso.get().load(IJNEquipmentImage.matsukaze).into(imageView)
                supportActionBar?.title = "Matsukaze"
            }
            26 -> {
                Picasso.get().load(IJNEquipmentImage.michishio).into(imageView)
                supportActionBar?.title = "Michishio"
            }
            27 -> {
                Picasso.get().load(IJNEquipmentImage.mikazuki).into(imageView)
                supportActionBar?.title = "Mikazuki"
            }
            28 -> {
                Picasso.get().load(IJNEquipmentImage.minazuki).into(imageView)
                supportActionBar?.title = "Minazuki"
            }
            29 -> {
                Picasso.get().load(IJNEquipmentImage.mutsuki).into(imageView)
                supportActionBar?.title = "Mutsuki"
            }
            30 -> {
                Picasso.get().load(IJNEquipmentImage.nagatsuki).into(imageView)
                supportActionBar?.title = "Nagatsuki"
            }
            31 -> {
                Picasso.get().load(IJNEquipmentImage.niizuki).into(imageView)
                supportActionBar?.title = "Niizuki"
            }
            32 -> {
                Picasso.get().load(IJNEquipmentImage.nowaki).into(imageView)
                supportActionBar?.title = "Nowaki"
            }
            33 -> {
                Picasso.get().load(IJNEquipmentImage.ooshio).into(imageView)
                supportActionBar?.title = "Ooshio"
            }
            34 -> {
                Picasso.get().load(IJNEquipmentImage.oyashio).into(imageView)
                supportActionBar?.title = "Oyashio"
            }
            35 -> {
                Picasso.get().load(IJNEquipmentImage.shigure).into(imageView)
                supportActionBar?.title = "Shigure"
            }
            36 -> {
                Picasso.get().load(IJNEquipmentImage.shiranui).into(imageView)
                supportActionBar?.title = "Shiranui"
            }
            37 -> {
                Picasso.get().load(IJNEquipmentImage.shiratsuyu).into(imageView)
                supportActionBar?.title = "Shiratsuyu"
            }
            38 -> {
                Picasso.get().load(IJNEquipmentImage.tanikaze).into(imageView)
                supportActionBar?.title = "Tanikaze"
            }
            39 -> {
                Picasso.get().load(IJNEquipmentImage.urakaze).into(imageView)
                supportActionBar?.title = "Urakaze"
            }
            40 -> {
                Picasso.get().load(IJNEquipmentImage.uranami).into(imageView)
                supportActionBar?.title = "Uranami"
            }
            41 -> {
                Picasso.get().load(IJNEquipmentImage.uzuki).into(imageView)
                supportActionBar?.title = "Uzuki"
            }
            42 -> {
                Picasso.get().load(IJNEquipmentImage.wakaba).into(imageView)
                supportActionBar?.title = "Wakaba"
            }
            43 -> {
                Picasso.get().load(IJNEquipmentImage.yoizuki).into(imageView)
                supportActionBar?.title = "Yoizuki"
            }
            44 -> {
                Picasso.get().load(IJNEquipmentImage.yukikaze).into(imageView)
                supportActionBar?.title = "Yukikaze"
            }
            45 -> {
                Picasso.get().load(IJNEquipmentImage.yuudachi).into(imageView)
                supportActionBar?.title = "Yuudachi"
            }
            46 -> {
                Picasso.get().load(IJNEquipmentImage.yuugure).into(imageView)
                supportActionBar?.title = "Yuugure"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showLightCruiserEquipment(){
        val imageView: ImageView = findViewById(R.id.ijn_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(IJNEquipmentImage.abukuma).into(imageView)
                supportActionBar?.title = "Abukuma"
            }
            1 -> {
                Picasso.get().load(IJNEquipmentImage.agano).into(imageView)
                supportActionBar?.title = "Agano"
            }
            2 -> {
                Picasso.get().load(IJNEquipmentImage.isuzu).into(imageView)
                supportActionBar?.title = "Isuzu"
            }
            3 -> {
                Picasso.get().load(IJNEquipmentImage.jintsuu).into(imageView)
                supportActionBar?.title = "Jintsuu"
            }
            4 -> {
                Picasso.get().load(IJNEquipmentImage.kinu).into(imageView)
                supportActionBar?.title = "Kinu"
            }
            5 -> {
                Picasso.get().load(IJNEquipmentImage.mikuma).into(imageView)
                supportActionBar?.title = "Mikuma"
            }
            6 -> {
                Picasso.get().load(IJNEquipmentImage.mogami).into(imageView)
                supportActionBar?.title = "Mogami"
            }
            7 -> {
                Picasso.get().load(IJNEquipmentImage.nagara).into(imageView)
                supportActionBar?.title = "Nagara"
            }
            8 -> {
                Picasso.get().load(IJNEquipmentImage.naka).into(imageView)
                supportActionBar?.title = "Naka"
            }
            9 -> {
                Picasso.get().load(IJNEquipmentImage.noshiro).into(imageView)
                supportActionBar?.title = "Noshiro"
            }
            10 -> {
                Picasso.get().load(IJNEquipmentImage.sendai).into(imageView)
                supportActionBar?.title = "Sendai"
            }
            11 -> {
                Picasso.get().load(IJNEquipmentImage.yuubari).into(imageView)
                supportActionBar?.title = "Yuubari"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showHeavyCruiserEquipment(){
        val imageView: ImageView = findViewById(R.id.ijn_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(IJNEquipmentImage.aoba).into(imageView)
                supportActionBar?.title = "Aoba"
            }
            1 -> {
                Picasso.get().load(IJNEquipmentImage.ashigara).into(imageView)
                supportActionBar?.title = "Ashigara"
            }
            2 -> {
                Picasso.get().load(IJNEquipmentImage.atago).into(imageView)
                supportActionBar?.title = "Atago"
            }
            3 -> {
                Picasso.get().load(IJNEquipmentImage.choukai).into(imageView)
                supportActionBar?.title = "Choukai"
            }
            4 -> {
                Picasso.get().load(IJNEquipmentImage.furutaka).into(imageView)
                supportActionBar?.title = "Furutaka"
            }
            5 -> {
                Picasso.get().load(IJNEquipmentImage.ibuki).into(imageView)
                supportActionBar?.title = "Ibuki"
            }
            6 -> {
                Picasso.get().load(IJNEquipmentImage.kako).into(imageView)
                supportActionBar?.title = "Kako"
            }
            7 -> {
                Picasso.get().load(IJNEquipmentImage.kinugasa).into(imageView)
                supportActionBar?.title = "Kinugasa"
            }
            8 -> {
                Picasso.get().load(IJNEquipmentImage.maya).into(imageView)
                supportActionBar?.title = "Maya"
            }
            9 -> {
                Picasso.get().load(IJNEquipmentImage.myoukou).into(imageView)
                supportActionBar?.title = "Myoukou"
            }
            10 -> {
                Picasso.get().load(IJNEquipmentImage.nachi).into(imageView)
                supportActionBar?.title = "Nachi"
            }
            11 -> {
                Picasso.get().load(IJNEquipmentImage.suzuya).into(imageView)
                supportActionBar?.title = "Suzuya"
            }
            12 -> {
                Picasso.get().load(IJNEquipmentImage.takao).into(imageView)
                supportActionBar?.title = "Takao"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showBattleshipEquipment(){
        val imageView: ImageView = findViewById(R.id.ijn_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(IJNEquipmentImage.amagi).into(imageView)
                supportActionBar?.title = "Amagi"
            }
            1 -> {
                Picasso.get().load(IJNEquipmentImage.azuma).into(imageView)
                supportActionBar?.title = "Azuma"
            }
            2 -> {
                Picasso.get().load(IJNEquipmentImage.fusou).into(imageView)
                supportActionBar?.title = "Fusou"
            }
            3 -> {
                Picasso.get().load(IJNEquipmentImage.haruna).into(imageView)
                supportActionBar?.title = "Haruna"
            }
            4 -> {
                Picasso.get().load(IJNEquipmentImage.hiei).into(imageView)
                supportActionBar?.title = "Hiei"
            }
            5 -> {
                Picasso.get().load(IJNEquipmentImage.hieiChan).into(imageView)
                supportActionBar?.title = "Hiei-chan"
            }
            6 -> {
                Picasso.get().load(IJNEquipmentImage.hyuuga).into(imageView)
                supportActionBar?.title = "Hyuuga"
            }
            7 -> {
                Picasso.get().load(IJNEquipmentImage.ise).into(imageView)
                supportActionBar?.title = "Ise"
            }
            8 -> {
                Picasso.get().load(IJNEquipmentImage.izumo).into(imageView)
                supportActionBar?.title = "Izumo"
            }
            9 -> {
                Picasso.get().load(IJNEquipmentImage.kaga).into(imageView)
                supportActionBar?.title = "Kaga"
            }
            10 -> {
                Picasso.get().load(IJNEquipmentImage.kirishima).into(imageView)
                supportActionBar?.title = "Kirishima"
            }
            11 -> {
                Picasso.get().load(IJNEquipmentImage.kongou).into(imageView)
                supportActionBar?.title = "Kongou"
            }
            12 -> {
                Picasso.get().load(IJNEquipmentImage.mikasa).into(imageView)
                supportActionBar?.title = "Mikasa"
            }
            13 -> {
                Picasso.get().load(IJNEquipmentImage.mutsu).into(imageView)
                supportActionBar?.title = "Mutsu"
            }
            14 -> {
                Picasso.get().load(IJNEquipmentImage.nagato).into(imageView)
                supportActionBar?.title = "Nagato"
            }
            15 -> {
                Picasso.get().load(IJNEquipmentImage.suruga).into(imageView)
                supportActionBar?.title = "Suruga"
            }
            16 -> {
                Picasso.get().load(IJNEquipmentImage.yamashiro).into(imageView)
                supportActionBar?.title = "Yamashiro"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showAircraftCarrierEquipment(){
        val imageView: ImageView = findViewById(R.id.ijn_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(IJNEquipmentImage.akagi).into(imageView)
                supportActionBar?.title = "Akagi"
            }
            1 -> {
                Picasso.get().load(IJNEquipmentImage.akagiChan).into(imageView)
                supportActionBar?.title = "Akagi-chan"
            }
            2 -> {
                Picasso.get().load(IJNEquipmentImage.akashi).into(imageView)
                supportActionBar?.title = "Akashi"
            }
            3 -> {
                Picasso.get().load(IJNEquipmentImage.hiryuu).into(imageView)
                supportActionBar?.title = "Hiryuu"
            }
            4 -> {
                Picasso.get().load(IJNEquipmentImage.hiyou).into(imageView)
                supportActionBar?.title = "Hiyou"
            }
            5 -> {
                Picasso.get().load(IJNEquipmentImage.houshou).into(imageView)
                supportActionBar?.title = "Houshou"
            }
            6 -> {
                Picasso.get().load(IJNEquipmentImage.junyou).into(imageView)
                supportActionBar?.title = "Junyou"
            }
            7 -> {
                Picasso.get().load(IJNEquipmentImage.kagaB).into(imageView)
                supportActionBar?.title = "Kaga"
            }
            8 -> {
                Picasso.get().load(IJNEquipmentImage.ryuuhou).into(imageView)
                supportActionBar?.title = "Ryuuhou"
            }
            9 -> {
                Picasso.get().load(IJNEquipmentImage.ryuujou).into(imageView)
                supportActionBar?.title = "Ryuujou"
            }
            10 -> {
                Picasso.get().load(IJNEquipmentImage.shouhou).into(imageView)
                supportActionBar?.title = "Shouhou"
            }
            11 -> {
                Picasso.get().load(IJNEquipmentImage.shoukaku).into(imageView)
                supportActionBar?.title = "Shoukaku"
            }
            12 -> {
                Picasso.get().load(IJNEquipmentImage.souryuu).into(imageView)
                supportActionBar?.title = "Souryuu"
            }
            13 -> {
                Picasso.get().load(IJNEquipmentImage.taihou).into(imageView)
                supportActionBar?.title = "Taihou"
            }
            14 -> {
                Picasso.get().load(IJNEquipmentImage.zuikaku).into(imageView)
                supportActionBar?.title = "Zuikaku"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showSubmarineEquipment(){
        val imageView: ImageView = findViewById(R.id.ijn_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(IJNEquipmentImage.i13).into(imageView)
                supportActionBar?.title = "I-13"
            }
            1 -> {
                Picasso.get().load(IJNEquipmentImage.i19).into(imageView)
                supportActionBar?.title = "I-19"
            }
            2 -> {
                Picasso.get().load(IJNEquipmentImage.i25).into(imageView)
                supportActionBar?.title = "I-25"
            }
            3 -> {
                Picasso.get().load(IJNEquipmentImage.i26).into(imageView)
                supportActionBar?.title = "I-26"
            }
            4 -> {
                Picasso.get().load(IJNEquipmentImage.i56).into(imageView)
                supportActionBar?.title = "I-56"
            }
            5 -> {
                Picasso.get().load(IJNEquipmentImage.i58).into(imageView)
                supportActionBar?.title = "I-58"
            }
            6 -> {
                Picasso.get().load(IJNEquipmentImage.i168).into(imageView)
                supportActionBar?.title = "I-168"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}