package com.sruthy.berin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val btn=findViewById(R.id.button2)as Button
        val edt=findViewById(R.id.editText)as EditText
        val edr=findViewById(R.id.editText2)as EditText
        btn.setOnClickListener {
            if (edt.text.toString().equals("berin")&& edr.text.toString().equals("123"))
            {
                Toast.makeText(this,"success",Toast.LENGTH_SHORT).show()
            }
        else if (edt.text.toString().equals("")||edr.text.toString().equals(""))
            {
                Toast.makeText(this,"blank",Toast.LENGTH_SHORT).show()


            }
            else
            {
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
            }
        }

    }

}
