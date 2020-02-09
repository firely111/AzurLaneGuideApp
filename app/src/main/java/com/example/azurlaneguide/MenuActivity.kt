package com.example.azurlaneguide

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class MenuActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.home -> {
                intent = Intent(this,FactionActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.about ->{
                intent = Intent(this,AboutActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.notes ->{
                intent = Intent(this,NotesActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.credits ->{
                intent = Intent(this,CreditsActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}