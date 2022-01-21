package com.rajalakshmi.recapp_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Counter : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnIncrement).setOnClickListener {
            findViewById<TextView>(R.id.tvCounterText).text = (++Counter).toString()
        }

        findViewById<Button>(R.id.btnDecrement).setOnClickListener {
            if(Counter>0) {
                findViewById<TextView>(R.id.tvCounterText).text = (--Counter).toString()
            }
            else{
                Toast.makeText(this,"We've Reached Minimum Value!",Toast.LENGTH_LONG).show()
            }
        }
    }
}