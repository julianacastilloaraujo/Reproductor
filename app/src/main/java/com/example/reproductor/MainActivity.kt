package com.example.reproductor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.merengue -> Toast.makeText(this, "boton Merengue", Toast.LENGTH_SHORT).show()
            R.id.salsa -> Toast.makeText(this, "boton Salsa", Toast.LENGTH_SHORT).show()
            R.id.vallenato -> Toast.makeText(this, "boton Vallenato", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}