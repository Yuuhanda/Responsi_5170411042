package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.preview.*
import android.view.View


class previewact: AppCompatActivity() {

    private lateinit var dashUser: TextView
    private lateinit var dashEmail: TextView
    private lateinit var dashTanggal: TextView

    val bundle = intent.extras

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preview)

        dashUser = findViewById(R.id.username_dashboard_judul)
        dashEmail = findViewById(R.id.email_dashboard)
        dashTanggal = findViewById(R.id.tanggal_lahir_dashboard)

        if (intent.extras != null) {
            dashUser.setText(intent.getStringExtra("dataUsername"))
            dashEmail.setText(intent.getStringExtra("dataEmail"))
            dashTanggal.setText(intent.getStringExtra("dataTanggal"))



        }
    }

}