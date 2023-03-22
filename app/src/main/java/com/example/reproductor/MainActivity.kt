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
            R.id.guardar -> Toast.makeText(this, "boton Guardar", Toast.LENGTH_SHORT).show()
            R.id.compartir -> Toast.makeText(this, "boton Compartir", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}