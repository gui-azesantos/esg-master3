package com.fiap.master3.esg

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val userName: TextView = findViewById(R.id.userGreeting)
        val userData = this.getSharedPreferences("userData", Context.MODE_PRIVATE)
        val name = userData.getString("name", "")


        userName.text = "Olá, $name"

    }
}