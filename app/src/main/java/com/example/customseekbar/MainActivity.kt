package com.example.customseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        defStyle.setOnTouchListener { _, event ->
//            txtDefStyle.text = "Default Style: " + defStyle.progress.toString() + ", Real: " + event.x.toString()
            defStyle.text = defStyle.progress.toString()
            false
        }

        clickableStyle.setOnTouchListener{ _, event ->
//            txtClickableStyle.text = "Clickable Style: " + clickableStyle.progress.toString() + ", Real: " + event.x.toString()
            clickableStyle.text = clickableStyle.progress.toString()
            false
        }
    }
}
