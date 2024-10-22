package com.example.pathfinder


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgencyLogin : AppCompatActivity() {

    private val registeredUsers = mapOf(
        "user1" to "password1",
        "user2" to "password2",
        "admin" to "admin123"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val name = findViewById<EditText>(R.id.nom)
        val mail = findViewById<EditText>(R.id.mail)
        val password = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val name = name.text.toString()
            val mail = mail.text.toString()
            val password = password.text.toString()


            if (registeredUsers.containsKey(name) && registeredUsers[name] == password) {
                Toast.makeText(this, "Login réussi. Bienvenue $name!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Nom d'utilisateur ou mot de passe incorrect.", Toast.LENGTH_LONG).show()
            }
        }
    }
}
