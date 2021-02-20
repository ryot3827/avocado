package com.example.avocado

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this, R.raw.avocado)
        val button = findViewById<Button>(R.id.avocadoButton)
        button.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        mediaPlayer?.start()
    }
}