package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.editTextTextPersonName)
        val moveToHomeButton = findViewById<Button>(R.id.move_to_home_button)
        moveToHomeButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}