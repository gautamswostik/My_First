package com.example.myfirst

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sumtst.setOnClickListener(){
            Log.i("MianActivity" ,"Name Submitted")
            Toast.makeText(this,"Name Submittted" , Toast.LENGTH_SHORT).show()

            val message : String =ttzmsz.text.toString()
            val intent  = Intent(this ,SecondActivity::class.java )

            intent.putExtra("user_message" , message)
            startActivity(intent)

        }
    }
}
