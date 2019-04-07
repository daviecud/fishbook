package com.example.fishbook

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_account_settings.*
import kotlinx.android.synthetic.main.content_account_settings.*
import kotlinx.android.synthetic.main.content_main.*

class AccountSettings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_settings)
        setSupportActionBar(toolbar)


	    RecyclerView recyclerView.LayoutManager = LinearLayoutManager(this)
	    RecyclerView recyclerView.adapter = new PostAdapter(posts)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            startActivity(Intent(this, MainActivity::class.java))
        }

        welcomeMessage.text = "Welcome to Fishbook, how are you today?? "

        postButton.setOnClickListener {view ->
            Snackbar.make(view, "You have entered a new post", Snackbar.LENGTH_LONG).show()

            postReplyBox.text = "${postBox.text}"


        }

	    homeLink.setOnClickListener { view ->
		    startActivity(Intent(this, MainActivity::class.java))
	    }
    }

}
