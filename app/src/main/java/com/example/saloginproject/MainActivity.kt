package com.example.saloginproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        textViewSignin.setOnClickListener {



            var signFragment = SigninFragment()
            supportFragmentManager.beginTransaction().add(R.id.mainConstraintLayout,signFragment).commit()
           buttonSubmit.visibility = View.GONE

        }

        textViewforgotpassword.setOnClickListener {


        }
    }
}