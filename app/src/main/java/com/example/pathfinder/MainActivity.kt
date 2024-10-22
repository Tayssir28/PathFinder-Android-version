package com.example.pathfinder;

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.GetStarted)
        val agency = findViewById<TextView>(R.id.agency)
        val user = findViewById<TextView>(R.id.user)

        agency.visibility = View.GONE
        user.visibility = View.GONE

        button.setOnClickListener {
            agency.visibility = View.VISIBLE
            user.visibility = View.VISIBLE
        }

        agency.setOnClickListener {
            val intent = Intent(this, AgencyLogin::class.java)
            startActivity(intent)
        }

        user.setOnClickListener {
            val intent = Intent(this, UserLogin::class.java)
            startActivity(intent)
        }
    }
}
