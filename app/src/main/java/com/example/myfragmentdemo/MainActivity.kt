package com.example.myfragmentdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeFg = WelcomeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFrame, welcomeFg)
            commit()
        }

        val btnAbout = findViewById<View>(R.id.btnAbout)

        btnAbout.setOnClickListener(){
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}