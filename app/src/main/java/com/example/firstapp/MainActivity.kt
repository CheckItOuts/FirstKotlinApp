package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnLog : Button
    lateinit var emailIn : EditText
    lateinit var passwordIn : EditText
    lateinit var resText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog = findViewById(R.id.loginButton);
        emailIn = findViewById(R.id.emailInput);
        passwordIn = findViewById(R.id.passwordInput);
        resText = findViewById((R.id.textView4));

        btnLog.setOnClickListener(this);
    }

    override fun onClick(v: View?){
        val email =emailIn.text.toString();
        val password = passwordIn.text.toString();
        if (email=="jean.jean@email.com" && password=="password")
        {
            resText.text = "Connecté !"
        }
    }
}