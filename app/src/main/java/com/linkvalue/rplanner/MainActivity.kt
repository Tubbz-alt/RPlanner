package com.linkvalue.rplanner

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_add_meeting.setOnClickListener {
            addMeetingIntent(this)
        }

    }

    fun addMeetingIntent(context: Context) {
        startActivity(Intent(context, AddMeeting::class.java))
    }
}

