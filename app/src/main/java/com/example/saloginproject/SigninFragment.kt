package com.example.saloginproject

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.singin_frag.*
import kotlinx.android.synthetic.main.singin_frag.view.*

class SigninFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.singin_frag,container,false)
       
            
       
        v.buttonRegister.setOnClickListener {
            var username = v.editTextsignUsername.text.toString()
            var password = v.editTextsingPassword.text.toString()
            var mobile = v.editTextsignMobile.text.toString()
            
            var alertDialog = AlertDialog.Builder(activity)
                .setTitle("Alert Dialog")
                .setMessage("The data is username is :$username \n password is : $password ")
            alertDialog.setPositiveButton("OK",DialogInterface.OnClickListener { dialog, which ->
                
                Toast.makeText(activity,"Postive Button",Toast.LENGTH_LONG).show()
            })
            
            alertDialog.setNegativeButton("Cancel",DialogInterface.OnClickListener { dialog, which ->

                Toast.makeText(activity,"Negative Button",Toast.LENGTH_LONG).show()

            })
            var ad = alertDialog.create()
            ad.show()
           
        }

        return v
    }
}