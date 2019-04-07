package com.example.fishbook

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Switch

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        floatingButton.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
            Log.d("David Calderwood", "Pressed")
            welcome_box.text = "Welcome World :)"

        }

        topButton.setOnClickListener {
            Log.d("david", "Button was pressed" + name_field.text)

            messageBox.text = "Welcome, ${name_field.text}! How are you today?"
        }

        middleSwitch.setOnClickListener {
            welcome_box.text = "You have switched the switch :D"
        }

        snackbar.setOnClickListener {
            Log.d("David", "Snackbar button was pressed by " + name_field.text)
            Snackbar.make(mainLayout, "Welcome to Fishbook, " + name_field.text, Snackbar.LENGTH_LONG).show()
        }

        sign_inbutton.setOnClickListener {
            val password = password_field.text.toString()
            val email = email_field.text.toString()
            Log.d("David", "password is: $password")

            if (password == "1234" && email == "david") {
                Log.d("David", "Success! Your password is valid")
                Snackbar.make(mainLayout, "Your sign-in details were correct! :)", Snackbar.LENGTH_LONG).show()
                startActivity(Intent(this, AccountSettings::class.java))
            } else if (password == "gus1956" && email == "ronacalderwood@hotmail.co.uk") {
                Snackbar.make(mainLayout, "Your sign-in details were correct! :)", Snackbar.LENGTH_LONG).show()
                startActivity(Intent(this, AccountSettings::class.java))
            } else {
                Snackbar.make(mainLayout, "You have entered wrong sign-in details! Please try again", Snackbar.LENGTH_LONG).show()
                Log.d("David", "Your password was not successful, please try again")
            }

        }


    }

}
