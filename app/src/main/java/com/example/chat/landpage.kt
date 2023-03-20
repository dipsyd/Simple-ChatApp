package com.example.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.chat.R
import com.example.chat.signup

class landpage : AppCompatActivity() {

    private lateinit var btnsignup: Button
    private lateinit var btnlogin: Button
    private lateinit var etwelcome: EditText
    private lateinit var etwelcome2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landpage)

        btnsignup = findViewById(R.id.btn_signup)
        btnlogin = findViewById(R.id.btn_login)
        etwelcome = findViewById(R.id.et_welcome)
        etwelcome2 = findViewById(R.id.et_welcome2)

        btnsignup.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}