package com.example.saloginproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        textViewSignin.setOnClickListener {



            var signFragment = SigninFragment()
            supportFragmentManager.beginTransaction().replace(R.id.mainConstraintLayout,signFragment).commit()
           buttonSubmit.visibility = View.GONE

        }

        textViewforgotpassword.setOnClickListener {


        }
    }

    override fun onResume() {
        super.onResume()
    }

}