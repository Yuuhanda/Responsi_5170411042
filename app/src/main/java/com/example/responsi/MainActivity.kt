package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.provider.ContactsContract
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.EditText
import android.widget.Button


class MainActivity : AppCompatActivity() {


    private lateinit var loginEmail: EditText
    private lateinit var loginPassword: EditText

    val id: Int = 10
    val language:String = "Kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginEmail = findViewById(R.id.email_login)
        loginPassword = findViewById(R.id.password_login)
        if (loginEmail!=null) {
            button_login.setOnClickListener() {
            intent = Intent(this,dashboardact::class.java)
            }
        }


        button_signup.setOnClickListener(){
            intent = Intent(this, actyvityregister::class.java)
            intent.putExtra("Id_value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }
    }
}
