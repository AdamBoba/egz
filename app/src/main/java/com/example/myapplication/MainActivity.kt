package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val emailEditText: EditText = findViewById(R.id.emailInput)
        val passwordEditText: EditText = findViewById(R.id.passwordInput)
        val repeatPasswordEditText: EditText = findViewById(R.id.confirmPasswordInput)
        val messageTextView: TextView = findViewById(R.id.messageTextView)
        val registerButton: Button = findViewById(R.id.submitButton)

        registerButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val repeatPassword = repeatPasswordEditText.text.toString()

            if (email.contains("@")) {
                if (password == repeatPassword) {
                    messageTextView.text = "Witaj $email"
                } else {
                    messageTextView.text = "Hasła się różnią"
                }
            } else {
                messageTextView.text = "Nieprawidłowy adres e-mail"
            }
        }
    }
}