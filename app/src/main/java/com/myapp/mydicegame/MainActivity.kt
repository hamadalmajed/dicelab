package com.my.dicegame

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<View>(R.id.btnStart)
        btnStart.setOnClickListener {

            startActivity(Intent(this, CounterClass::class.java))
        }



        val btnQuit = findViewById<View>(R.id.btnQuit)
        btnQuit.setOnClickListener{

            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setMessage("Do You Wants To Exit My Dice Game ??")
                .setCancelable(false)
                .setPositiveButton("Yes")
                {
                        dialog, id -> finish()
                }
                .setNegativeButton("No")
                {
                        dialog, id -> dialog.cancel()
                }
            val dialog = alertDialog.create()
            dialog.show()

        }
    }






}
