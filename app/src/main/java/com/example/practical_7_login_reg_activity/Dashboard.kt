package com.example.practical_7_login_reg_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var Fullname = findViewById(R.id.fullname) as EditText
        var Number = findViewById(R.id.number) as EditText
        var SmallCity = findViewById(R.id.smallcity) as EditText
        var EmailId = findViewById(R.id.emailid) as EditText
        var Fname = findViewById(R.id.txt_name) as TextView
        var textemail = findViewById(R.id.txt_email) as TextView
        var Logout = findViewById<TextView>(R.id.txt_logout)

        var bundle: Bundle? =intent.extras
        var email = bundle?.get("em").toString()
        var num = bundle?.get("nu").toString()
        var city = bundle?.get("ci").toString()
        var fname = bundle?.get("fn").toString()

        Fullname.setText(fname)
        Number.setText(num)
        EmailId.setText(email)
        SmallCity.setText(city)
        Fname.setText(fname)
        textemail.setText(email)


        Logout.setOnClickListener()
        {
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this, "Backed Button are Pressed", Toast.LENGTH_SHORT).show()
        finishAffinity()
    }

}