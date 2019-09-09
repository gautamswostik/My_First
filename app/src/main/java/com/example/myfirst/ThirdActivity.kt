package com.example.myfirst

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*
import kotlinx.android.synthetic.main.third_activity.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)




        btnshare.setOnClickListener{
            val mesz : String = thstxt.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND

            intent.putExtra(Intent.EXTRA_TEXT ,mesz )
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent , "Share to : "))
        }


    }


}