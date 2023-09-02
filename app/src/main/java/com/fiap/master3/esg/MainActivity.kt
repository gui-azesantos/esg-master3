package com.fiap.master3.esg

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLogin: Button = findViewById(R.id.btn_login)

        val username: TextView = findViewById(R.id.txtUsername)
        val password: TextView = findViewById(R.id.txtPassword)



        btnLogin.setOnClickListener(View.OnClickListener {
            val namePersist  = this.getSharedPreferences("userData", Context.MODE_PRIVATE)

            val editor = namePersist.edit()
            editor.putString("name", username.text.toString())
            editor.apply()

            Toast.makeText(this, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        })


    }





}