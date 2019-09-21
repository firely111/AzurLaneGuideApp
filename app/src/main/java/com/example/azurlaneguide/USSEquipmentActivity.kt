package com.example.azurlaneguide

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

open class USSEquipmentActivity : MenuActivity() {
    companion object{
        var image: Int = 0
        var category: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uss_equipment)

        image = intent.getIntExtra(USSViewHolder.SHIP_KEY, -1)
        category = intent.getIntExtra(USSViewHolder.CATEGORY_KEY, -1)

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
        val imageView: ImageView = findViewById(R.id.uss_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(USSEquipmentImage.aulick).into(imageView)
                supportActionBar?.title = "Aulick"
            }
            1 -> {
                Picasso.get().load(USSEquipmentImage.aylwin).into(imageView)
                supportActionBar?.title = "Aylwin"
            }
            2 -> {
                Picasso.get().load(USSEquipmentImage.bache).into(imageView)
                supportActionBar?.title = "Bache"
            }
            3 -> {
                Picasso.get().load(USSEquipmentImage.bailey).into(imageView)
                supportActionBar?.title = "Bailey"
            }
            4 -> {
                Picasso.get().load(USSEquipmentImage.benson).into(imageView)
                supportActionBar?.title = "Benson"
            }
            5 -> {
                Picasso.get().load(USSEquipmentImage.bush).into(imageView)
                supportActionBar?.title = "Bush"
            }
            6 -> {
                Picasso.get().load(USSEquipmentImage.cassin).into(imageView)
                supportActionBar?.title = "Cassin"
            }
            7 -> {
                Picasso.get().load(USSEquipmentImage.charles_ausburne).into(imageView)
                supportActionBar?.title = "Charles Ausburne"
            }
            8 -> {
                Picasso.get().load(USSEquipmentImage.craven).into(imageView)
                supportActionBar?.title = "Craven"
            }
            9 -> {
                Picasso.get().load(USSEquipmentImage.dewey).into(imageView)
                supportActionBar?.title = "Dewey"
            }
            10 -> {
                Picasso.get().load(USSEquipmentImage.downes).into(imageView)
                supportActionBar?.title = "Downes"
            }
            11 -> {
                Picasso.get().load(USSEquipmentImage.eldridge).into(imageView)
                supportActionBar?.title = "Eldridge"
            }
            12 -> {
                Picasso.get().load(USSEquipmentImage.fletcher).into(imageView)
                supportActionBar?.title = "Fletcher"
            }
            13 -> {
                Picasso.get().load(USSEquipmentImage.foote).into(imageView)
                supportActionBar?.title = "Foote"
            }
            14 -> {
                Picasso.get().load(USSEquipmentImage.gridley).into(imageView)
                supportActionBar?.title = "Gridley"
            }
            15 -> {
                Picasso.get().load(USSEquipmentImage.hammann).into(imageView)
                supportActionBar?.title = "Hammann"
            }
            16 -> {
                Picasso.get().load(USSEquipmentImage.hazelwood).into(imageView)
                supportActionBar?.title = "Hazelwood"
            }
            17 -> {
                Picasso.get().load(USSEquipmentImage.hobby).into(imageView)
                supportActionBar?.title = "Hobby"
            }
            18 -> {
                Picasso.get().load(USSEquipmentImage.jenkins).into(imageView)
                supportActionBar?.title = "Jenkins"
            }
            19 -> {
                Picasso.get().load(USSEquipmentImage.kalk).into(imageView)
                supportActionBar?.title = "Kalk"
            }
            20 -> {
                Picasso.get().load(USSEquipmentImage.kimberly).into(imageView)
                supportActionBar?.title = "Kimberly"
            }
            21 -> {
                Picasso.get().load(USSEquipmentImage.laffey).into(imageView)
                supportActionBar?.title = "Laffey"
            }
            22 -> {
                Picasso.get().load(USSEquipmentImage.maury).into(imageView)
                supportActionBar?.title = "Maury"
            }
            23 -> {
                Picasso.get().load(USSEquipmentImage.mccall).into(imageView)
                supportActionBar?.title = "McCall"
            }
            24 -> {
                Picasso.get().load(USSEquipmentImage.mullany).into(imageView)
                supportActionBar?.title = "Mullany"
            }
            25 -> {
                Picasso.get().load(USSEquipmentImage.nicholas).into(imageView)
                supportActionBar?.title = "Nicholas"
            }
            26 -> {
                Picasso.get().load(USSEquipmentImage.radford).into(imageView)
                supportActionBar?.title = "Radford"
            }
            27 -> {
                Picasso.get().load(USSEquipmentImage.sims).into(imageView)
                supportActionBar?.title = "Sims"
            }
            28 -> {
                Picasso.get().load(USSEquipmentImage.spence).into(imageView)
                supportActionBar?.title = "Spence"
            }
            29 -> {
                Picasso.get().load(USSEquipmentImage.stanley).into(imageView)
                supportActionBar?.title = "Stanley"
            }
            30 -> {
                Picasso.get().load(USSEquipmentImage.thatcher).into(imageView)
                supportActionBar?.title = "Thatcher"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showLightCruiserEquipment(){
        val imageView: ImageView = findViewById(R.id.uss_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(USSEquipmentImage.atlanta).into(imageView)
                supportActionBar?.title = "Atlanta"
            }
            1 -> {
                Picasso.get().load(USSEquipmentImage.birmmingham).into(imageView)
                supportActionBar?.title = "Birmmingham"
            }
            2 -> {
                Picasso.get().load(USSEquipmentImage.brooklyn).into(imageView)
                supportActionBar?.title = "Brooklyn"
            }
            3 -> {
                Picasso.get().load(USSEquipmentImage.clevelad).into(imageView)
                supportActionBar?.title = "Clevelad"
            }
            4 -> {
                Picasso.get().load(USSEquipmentImage.cleveland).into(imageView)
                supportActionBar?.title = "Cleveland"
            }
            5 -> {
                Picasso.get().load(USSEquipmentImage.columbia).into(imageView)
                supportActionBar?.title = "Columbia"
            }
            6 -> {
                Picasso.get().load(USSEquipmentImage.concord).into(imageView)
                supportActionBar?.title = "Concord"
            }
            7 -> {
                Picasso.get().load(USSEquipmentImage.denver).into(imageView)
                supportActionBar?.title = "Denver"
            }
            8 -> {
                Picasso.get().load(USSEquipmentImage.helena).into(imageView)
                supportActionBar?.title = "Helena"
            }
            9 -> {
                Picasso.get().load(USSEquipmentImage.honolulu).into(imageView)
                supportActionBar?.title = "Honolulu"
            }
            10 -> {
                Picasso.get().load(USSEquipmentImage.juneau).into(imageView)
                supportActionBar?.title = "Juneau"
            }
            11 -> {
                Picasso.get().load(USSEquipmentImage.lena).into(imageView)
                supportActionBar?.title = "Lena"
            }
            12 -> {
                Picasso.get().load(USSEquipmentImage.lil_sandy).into(imageView)
                supportActionBar?.title = "Li'l Sandy"
            }
            13 -> {
                Picasso.get().load(USSEquipmentImage.memphis).into(imageView)
                supportActionBar?.title = "Memphis"
            }
            14 -> {
                Picasso.get().load(USSEquipmentImage.montpelier).into(imageView)
                supportActionBar?.title = "Montpelier"
            }
            15 -> {
                Picasso.get().load(USSEquipmentImage.omaha).into(imageView)
                supportActionBar?.title = "Omaha"
            }
            16 -> {
                Picasso.get().load(USSEquipmentImage.phoenix).into(imageView)
                supportActionBar?.title = "Phoenix"
            }
            17 -> {
                Picasso.get().load(USSEquipmentImage.raleigh).into(imageView)
                supportActionBar?.title = "Raleigh"
            }
            18 -> {
                Picasso.get().load(USSEquipmentImage.richmond).into(imageView)
                supportActionBar?.title = "Richmond"
            }
            19 -> {
                Picasso.get().load(USSEquipmentImage.san_diego).into(imageView)
                supportActionBar?.title = "San Diego"
            }
            20 -> {
                Picasso.get().load(USSEquipmentImage.san_juan).into(imageView)
                supportActionBar?.title = "San Juan"
            }
            21 -> {
                Picasso.get().load(USSEquipmentImage.seattle).into(imageView)
                supportActionBar?.title = "Seattle"
            }
            22 -> {
                Picasso.get().load(USSEquipmentImage.st_louis).into(imageView)
                supportActionBar?.title = "St. Louis"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showHeavyCruiserEquipment(){
        val imageView: ImageView = findViewById(R.id.uss_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(USSEquipmentImage.astoria).into(imageView)
                supportActionBar?.title = "Astoria"
            }
            1 -> {
                Picasso.get().load(USSEquipmentImage.baltimore).into(imageView)
                supportActionBar?.title = "Baltimore"
            }
            2 -> {
                Picasso.get().load(USSEquipmentImage.chicago).into(imageView)
                supportActionBar?.title = "Chicago"
            }
            3 -> {
                Picasso.get().load(USSEquipmentImage.houston).into(imageView)
                supportActionBar?.title = "Houston"
            }
            4 -> {
                Picasso.get().load(USSEquipmentImage.indianapolis).into(imageView)
                supportActionBar?.title = "Indianapolis"
            }
            5 -> {
                Picasso.get().load(USSEquipmentImage.minneapolis).into(imageView)
                supportActionBar?.title = "Minneapolis"
            }
            6 -> {
                Picasso.get().load(USSEquipmentImage.northampton).into(imageView)
                supportActionBar?.title = "Northhampton"
            }
            7 -> {
                Picasso.get().load(USSEquipmentImage.pensacola).into(imageView)
                supportActionBar?.title = "Pensacola"
            }
            8 -> {
                Picasso.get().load(USSEquipmentImage.portland).into(imageView)
                supportActionBar?.title = "Portland"
            }
            9 -> {
                Picasso.get().load(USSEquipmentImage.quincy).into(imageView)
                supportActionBar?.title = "Quincy"
            }
            10 -> {
                Picasso.get().load(USSEquipmentImage.salt_lake_city).into(imageView)
                supportActionBar?.title = "Salt Lake City"
            }
            11 -> {
                Picasso.get().load(USSEquipmentImage.vincennes).into(imageView)
                supportActionBar?.title = "Vincennes"
            }
            12 -> {
                Picasso.get().load(USSEquipmentImage.wichita).into(imageView)
                supportActionBar?.title = "Wichita"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showBattleshipEquipment(){
        val imageView: ImageView = findViewById(R.id.uss_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(USSEquipmentImage.alabama).into(imageView)
                supportActionBar?.title = "Alabama"
            }
            1 -> {
                Picasso.get().load(USSEquipmentImage.arizona).into(imageView)
                supportActionBar?.title = "Arizona"
            }
            2 -> {
                Picasso.get().load(USSEquipmentImage.california).into(imageView)
                supportActionBar?.title = "California"
            }
            3 -> {
                Picasso.get().load(USSEquipmentImage.colorado).into(imageView)
                supportActionBar?.title = "Colorado"
            }
            4 -> {
                Picasso.get().load(USSEquipmentImage.georgia).into(imageView)
                supportActionBar?.title = "Georgia"
            }
            5 -> {
                Picasso.get().load(USSEquipmentImage.maryland).into(imageView)
                supportActionBar?.title = "Maryland"
            }
            6 -> {
                Picasso.get().load(USSEquipmentImage.massachusetts).into(imageView)
                supportActionBar?.title = "Massachusetts"
            }
            7 -> {
                Picasso.get().load(USSEquipmentImage.north_carolina).into(imageView)
                supportActionBar?.title = "North Carolina"
            }
            8 -> {
                Picasso.get().load(USSEquipmentImage.oklahoma).into(imageView)
                supportActionBar?.title = "Oklahoma"
            }
            9 -> {
                Picasso.get().load(USSEquipmentImage.pennsylvania).into(imageView)
                supportActionBar?.title = "Pennsylvania"
            }
            10 -> {
                Picasso.get().load(USSEquipmentImage.south_dakota).into(imageView)
                supportActionBar?.title = "South Dakota"
            }
            1 -> {
                Picasso.get().load(USSEquipmentImage.tennessee).into(imageView)
                supportActionBar?.title = "Tennessee"
            }
            12 -> {
                Picasso.get().load(USSEquipmentImage.washington).into(imageView)
                supportActionBar?.title = "Washington"
            }
            13 -> {
                Picasso.get().load(USSEquipmentImage.west_virginia).into(imageView)
                supportActionBar?.title = "West Virginia"
            }
            14 -> {
                Picasso.get().load(USSEquipmentImage.nevada).into(imageView)
                supportActionBar?.title = "Nevada"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showAircraftCarrierEquipment(){
        val imageView: ImageView = findViewById(R.id.uss_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(USSEquipmentImage.bataan).into(imageView)
                supportActionBar?.title = "Bataan"
            }
            1 -> {
                Picasso.get().load(USSEquipmentImage.bogue).into(imageView)
                supportActionBar?.title = "Bogue"
            }
            2 -> {
                Picasso.get().load(USSEquipmentImage.bunker_hill).into(imageView)
                supportActionBar?.title = "Bunker Hill"
            }
            3 -> {
                Picasso.get().load(USSEquipmentImage.enterprise).into(imageView)
                supportActionBar?.title = "Enterprise"
            }
            4 -> {
                Picasso.get().load(USSEquipmentImage.essex).into(imageView)
                supportActionBar?.title = "Essex"
            }
            5 -> {
                Picasso.get().load(USSEquipmentImage.hornet).into(imageView)
                supportActionBar?.title = "Hornet"
            }
            6 -> {
                Picasso.get().load(USSEquipmentImage.independence).into(imageView)
                supportActionBar?.title = "Independence"
            }
            7 -> {
                Picasso.get().load(USSEquipmentImage.langley).into(imageView)
                supportActionBar?.title = "Langley"
            }
            8 -> {
                Picasso.get().load(USSEquipmentImage.lexington).into(imageView)
                supportActionBar?.title = "Lexington"
            }
            9 -> {
                Picasso.get().load(USSEquipmentImage.long_island).into(imageView)
                supportActionBar?.title = "Long Island"
            }
            10 -> {
                Picasso.get().load(USSEquipmentImage.ranger).into(imageView)
                supportActionBar?.title = "Ranger"
            }
            11 -> {
                Picasso.get().load(USSEquipmentImage.saratoga).into(imageView)
                supportActionBar?.title = "Saratoga"
            }
            12 -> {
                Picasso.get().load(USSEquipmentImage.shanri_la).into(imageView)
                supportActionBar?.title = "Shangri-La"
            }
            13 -> {
                Picasso.get().load(USSEquipmentImage.vestal).into(imageView)
                supportActionBar?.title = "Vestal"
            }
            14 -> {
                Picasso.get().load(USSEquipmentImage.wasp).into(imageView)
                supportActionBar?.title = "Wasp"
            }
            15 -> {
                Picasso.get().load(USSEquipmentImage.yorktown).into(imageView)
                supportActionBar?.title = "Yorktown"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
    fun showSubmarineEquipment(){
        val imageView: ImageView = findViewById(R.id.uss_equipment_image)
        when(image){
            0 -> {
                Picasso.get().load(USSEquipmentImage.albacore).into(imageView)
                supportActionBar?.title = "Albacore"
            }
            1 -> {
                Picasso.get().load(USSEquipmentImage.cavalla).into(imageView)
                supportActionBar?.title = "Cavalla"
            }
            2 -> {
                Picasso.get().load(USSEquipmentImage.dace).into(imageView)
                supportActionBar?.title = "Dace"
            }
            else -> {
                Picasso.get().load("https://i.imgur.com/SQVidPa.png").into(imageView)
                supportActionBar?.title = "FeelsBadMan"
            }
        }
    }
}