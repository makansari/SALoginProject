package com.example.saloginproject

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.example.saloginproject.model.LoginDatabase
import com.example.saloginproject.model.LoginEntity
import kotlinx.android.synthetic.main.singin_frag.*
import kotlinx.android.synthetic.main.singin_frag.view.*


class SigninFragment : Fragment() {
    lateinit  var username : EditText
    lateinit var password : EditText
    lateinit var mobile : EditText


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.singin_frag, container, false)

        var h = Handler()


        v.buttonRegister.setOnClickListener {

           username = v.findViewById(R.id.editTextsignUsername)
            password = v.findViewById(R.id.editTextsingPassword)
            mobile = v.findViewById(R.id.editTextsignMobile)
            var tast = MyTask()
            tast.execute()
            Toast.makeText(activity, "data" , Toast.LENGTH_SHORT).show()

        }

        return v
    }


    inner class MyTask : AsyncTask<String?, Void?, String>() {
       lateinit var un :String
       lateinit var pwd : String
        lateinit var mob : String
        var db = Room.databaseBuilder(activity!!, LoginDatabase::class.java, "mydb") .fallbackToDestructiveMigration().build()

        override fun onPreExecute() {
            super.onPreExecute()
           un  = username.text.toString()
            pwd = password.text.toString()
            mob = mobile.text.toString()

        }

        override fun doInBackground(vararg params: String?): String {
            var loginDetails = LoginEntity()

            loginDetails.username = un
            loginDetails.password = pwd
            loginDetails.mobile = mob

            db.logDao().saveData(loginDetails)

            db.logDao().showData().forEach {
                Log.i("mytag", "result : " + it.username +  " : password is : ${it.password}")

            }

            return "ansari"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)



        }
    }
}