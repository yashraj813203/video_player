package com.example.video_player

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //displaying video from local storage
        val videoView: VideoView=findViewById(R.id.videoview1)
        videoView.setVideoPath(
            "android.resource://"
                +packageName+"/"
                    +R.raw.john2)


        val mediaController= MediaController(this)

        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)





        //displaying video from internet
        val videoView2:  VideoView= findViewById(R.id.videoview2)

        val uri = Uri.parse("https://drive.google.com/file/d/1aWI8z_t5-773pabHKPGOls875aNSF48m/view?usp=sharing")
        //val uri = Uri.parse("https://youtu.be/mTCo06TJe20")
        videoView2.setVideoURI(uri)

        //media controller
        val mediaController2= MediaController(this)

        mediaController2.setAnchorView(videoView2)
        mediaController2.setMediaPlayer(videoView2)
        videoView2.setMediaController(mediaController2)


    }
}










