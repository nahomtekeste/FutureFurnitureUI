package com.example.futurefurnitureui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        // this code allow the user to the second activity
        home_linear_layout.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(applicationContext, Main2Activity::class.java)
                startActivity(intent)
            }
        })
    }
}


