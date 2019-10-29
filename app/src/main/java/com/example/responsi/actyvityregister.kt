package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.w3c.dom.Text
import android.widget.TextView
import android.widget.*
import android.view.View

import kotlinx.android.synthetic.main.register.*


import android.widget.EditText
import android.widget.Button

class actyvityregister : AppCompatActivity() {

    private lateinit var datUsername: EditText
    private lateinit var datEmail: EditText
    private lateinit var datPassword: EditText

    private lateinit var datTanggalLahir: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        datUsername = findViewById(R.id.username_judul_daftar)
        datEmail = findViewById(R.id.email_daftar)
        datPassword = findViewById(R.id.password_daftar)
        datTanggalLahir = findViewById(R.id.tanggal_lahir_daftar)



        button_daftar.setOnClickListener {

            val intent = Intent(this, dashboardact::class.java)
            intent.putExtra("dataUsername", datUsername.text.toString())
            intent.putExtra("dataEmail", datEmail.text.toString())
            intent.putExtra("dataPassword", datPassword.text.toString())
            intent.putExtra("dataTanggal", datTanggalLahir.text.toString())

            startActivity(intent)
        }

    }


}