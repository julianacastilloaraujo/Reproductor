package com.example.reproductor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.merengue -> {
                startActivity(Intent(this, merengue::class.java))
                true
            }
            R.id.salsa -> {
                startActivity(Intent(this, salsa::class.java))
                true
            }
            R.id.vallenato -> {
                startActivity(Intent(this, vallenato::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}