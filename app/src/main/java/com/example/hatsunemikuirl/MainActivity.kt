package com.example.hatsunemikuirl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var seekbar = findViewById<SeekBar>(R.id.seekBar)
        var tekst = findViewById<TextView>(R.id.txt1)
        var distance = findViewById<TextView>(R.id.distancetxt)
        var btn = findViewById<Button>(R.id.button)
        var dystans = 0


        seekbar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                dystans = seekbar.progress*5
                distance.text = dystans.toString() + " km"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
        btn.setOnClickListener {

        }
    }
    class Pub(dystans:Int, nazwa: String, tenis: Boolean, zuzel: Boolean, noga:Boolean) {
    }
}