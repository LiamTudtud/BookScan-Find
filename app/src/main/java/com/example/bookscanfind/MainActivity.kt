package com.example.bookscanfind

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        val loginButton: Button = findViewById(R.id.loginButton)
        val userIdEditText: EditText = findViewById(R.id.userIdEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)

        // Set up login button click listener
        loginButton.setOnClickListener {
            val userId = userIdEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Basic validation
            if (userId.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter both USER ID and PASSWORD", Toast.LENGTH_SHORT).show()
            } else {
                // Handle login logic here
                // For demonstration, show a toast
                Toast.makeText(this, "Login clicked: USER ID - $userId", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
