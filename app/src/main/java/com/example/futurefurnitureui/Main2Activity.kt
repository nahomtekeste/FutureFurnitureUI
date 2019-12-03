package com.example.futurefurnitureui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    lateinit var personLinearLayout :LinearLayout
    lateinit var favorite : TextView
    lateinit var cactusCardView : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // this code allow the user to get the shopping cart activity
        shopping_card.setOnClickListener {
            var intent = Intent(applicationContext , Main5Activity ::class.java)
            startActivity(intent)
        }

      // this code allow the user to the third activity
        personLinearLayout.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(applicationContext, Main3Activity::class.java)
                startActivity(intent)
            }
        })
        // this code here allow the user to get the fourth activity
        favorite.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(applicationContext, Main4Activity::class.java)

                startActivity(intent)

            }
        })

        cactusCardView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(applicationContext, Main5Activity::class.java)
                startActivity(intent)

            }

        })
    }
}
