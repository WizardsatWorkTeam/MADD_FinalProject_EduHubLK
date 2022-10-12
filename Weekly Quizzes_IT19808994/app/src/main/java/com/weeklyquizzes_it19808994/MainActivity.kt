package com.weeklyquizzes_it19808994

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // parent
        super.onCreate(savedInstanceState)

        // This is used to align the xml view to this class
        setContentView(R.layout.activity_main)

        //Status bar hiding
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_startquiz.setOnClickListener {

            if (regi_no.text.toString().isEmpty()) {

                // Toast message to display when registration number is empty
                Toast.makeText(this@MainActivity, "Enter the Registraion Number", Toast.LENGTH_SHORT).show()
            }
            else {

                val intent = Intent(this@MainActivity, QuestionsActivity::class.java)
                // Passing the name through intent using the constant variable

                intent.putExtra(Constants.USER_NAME, regi_no.text.toString())

                // Starting new activity
                startActivity(intent)

                // ending previouse activity
                finish()
            }
        }
    }
}