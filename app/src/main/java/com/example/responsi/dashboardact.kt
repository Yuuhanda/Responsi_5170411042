package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.dashboard
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text


class dashboardact: AppCompatActivity() {

    private lateinit var dashUser: TextView
    private lateinit var dashEmail: TextView
    private lateinit var dashTanggal: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

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
}