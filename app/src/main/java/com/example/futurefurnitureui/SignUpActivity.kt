package com.example.futurefurnitureui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // this code allow the user to be abke to get to the sign activity
        register.setOnClickListener {
            var intent =Intent(applicationContext , MainActivity ::class.java)
            startActivity(intent)
        }
        // this cide allow the user to go the login acitivty
        have_an_account.setOnClickListener {
            var intent = Intent(applicationContext ,Main2Activity ::class.java)
            startActivity(intent)
        }
    }
}
