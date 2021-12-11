package com.example.practical_7_login_reg_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback

class SignUp_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val t_signup = findViewById<TextView>(R.id.txt_signup)
        val t_login = findViewById<TextView>(R.id.txt_login)


        val name = findViewById(R.id.name) as EditText
        val phonenumber = findViewById(R.id.Phonenumber) as EditText
        val city = findViewById(R.id.city) as EditText
        val email = findViewById(R.id.email1) as EditText
        val pass = findViewById(R.id.pass) as EditText
        val cpass = findViewById(R.id.cpass) as EditText
        val btn_signup = findViewById<Button>(R.id.Signup)

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

        btn_signup.setOnClickListener()
        {
            if(name.text.toString().isEmpty() || phonenumber.text.toString().isEmpty() || email.text.toString().isEmpty() || pass.text.toString().isEmpty() || cpass.text.toString().isEmpty() || city.text.toString().isEmpty() )
            {
                Toast.makeText(this, "All Field Should Not be Empty", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var Email = email.text.toString()
                var Pass = pass.text.toString()
                var phone_number = phonenumber.text.toString()
                var fname = name.text.toString()
                var City = city.text.toString()
                var Cpass = cpass.text.toString()

                if(Cpass != Pass)
                {
                    Toast.makeText(this, "Password and Confirm password Should not Match", Toast.LENGTH_SHORT).show()
                }
                else {
                    intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("email2", Email)
                    intent.putExtra("pass1", Pass)
                    intent.putExtra("pnumber", phone_number)
                    intent.putExtra("fullname", fname)
                    intent.putExtra("city1", City)
                    startActivity(intent)

                    Toast.makeText(this, "Registration Succesfully", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

}