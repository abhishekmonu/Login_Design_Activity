package com.example.practical_7_login_reg_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t_signup = findViewById<TextView>(R.id.txt_signup)
        var t_login = findViewById<TextView>(R.id.txt_login)

        var e_mail = findViewById(R.id.email2) as EditText
        var password = findViewById(R.id.pass2) as EditText
        var Login = findViewById<Button>(R.id.login)

        t_signup.setOnClickListener()
        {
            val intent = Intent(this,SignUp_Activity::class.java)
            startActivity(intent)
        }
        t_login.setOnClickListener()
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        var bundle: Bundle? =intent.extras
        var email = bundle?.get("email2").toString()
        var pass = bundle?.get("pass1").toString()
        var city = bundle?.get("city1").toString()
        var fname = bundle?.get("fullname").toString()
        var num = bundle?.get("pnumber").toString()

        Login.setOnClickListener()
        {

            if(email.equals(e_mail.text.toString()) && pass.equals(password.text.toString()))
            {
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show()
                intent = Intent(this, Dashboard::class.java)
                intent.putExtra("em",email)
                intent.putExtra("ci",city)
                intent.putExtra("fn",fname)
                intent.putExtra("nu",num)


                startActivity(intent)
            }
            else
            {
                Toast.makeText(this, "Wrong Email and Password", Toast.LENGTH_SHORT).show()

            }
        }


    }
    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this, "Backed Button are Pressed", Toast.LENGTH_SHORT).show()
        finishAffinity()
    }

}