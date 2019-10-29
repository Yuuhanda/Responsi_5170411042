package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.provider.ContactsContract
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.EditText
import android.widget.Button
import kotlinx.android.synthetic.main.register.*
import android.widget.*
import java.util.*
import android.view.View


class MainActivity : AppCompatActivity() {


    private lateinit var loginEmail: EditText
    private lateinit var loginPassword: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginEmail = findViewById(R.id.email_login)
        loginPassword = findViewById(R.id.password_login)

            button_login.setOnClickListener() {
                val intent = Intent(this,dashboardact::class.java)
                startActivity(intent)
            }



        button_signup.setOnClickListener(){
            intent = Intent(this, actyvityregister::class.java)
            startActivity(intent)
        }
    }
}
