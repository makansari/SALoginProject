package com.example.saloginproject

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.example.saloginproject.model.LoginDatabase
import com.example.saloginproject.model.LoginEntity
import kotlinx.android.synthetic.main.singin_frag.*
import kotlinx.android.synthetic.main.singin_frag.view.*


class SigninFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.singin_frag, container, false)

        var h = Handler()


        v.buttonRegister.setOnClickListener {
 /*           var username = v.editTextsignUsername.text.toString()
            var password = v.editTextsingPassword.text.toString()
            var mobile = Integer.parseInt(v.editTextsignMobile.text.toString())*/

            var tast = MyTask()
            tast.execute()
            Toast.makeText(activity, "data" , Toast.LENGTH_SHORT).show()

        }


        return v
    }


    inner class MyTask : AsyncTask<String?, Void?, String>() {

        var db = Room.databaseBuilder(activity!!, LoginDatabase::class.java, "mydb").build()

        override fun doInBackground(vararg params: String?): String {
            var loginDetails = LoginEntity()

            loginDetails.username = "ans"
            loginDetails.password = "password"
            loginDetails.mobile = 1223

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