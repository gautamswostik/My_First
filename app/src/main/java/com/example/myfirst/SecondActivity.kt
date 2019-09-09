package com.example.myfirst

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")

        txtmsz.text = msg

        nxtbtntr.setOnClickListener{
            val intent = Intent(this , ThirdActivity::class.java)
            startActivity(intent)
        }



    }

}