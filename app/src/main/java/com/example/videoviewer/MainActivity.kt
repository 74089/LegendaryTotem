package com.example.videoviewer

import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Filter
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView: VideoView = findViewById(R.id.video_view)
        //val videoPath = "android.resource://" + packageName.toString() + "/" + R.raw.testvideo2
        //val uri = Uri.parse(videoPath)
        //videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        //'define' list
        val videos: List<String> = listOf("testvideo", "testvideo2", "video", "skate1", "skate2", "skate3", "skate4", "skate5", "skate6", "skate7", "skate8", "skate9", "skate10", "skate11", "skate12", "skate13", "skate14", "skate15")
        val controller = videoController(videoView, videos, packageName.toString())
//        controller.AttachEvents()
        controller.PlayRandomNext()
    }

    class videoController(val vcVideoView: VideoView, val VideoList: List<String>, val packageName: String) {
        var LastVideo: String = ""

        fun AttachEvents() {
            //event listener video end
            vcVideoView.setOnCompletionListener{ mp ->
                Log.d("VIDEO", "next video")
                // TODO
                //code to play next video (out of an array in the res/raw folder)
                PlayRandomNext()
            }

        }
        fun PlayRandomNext() {
            //play random video

            //gets a random video from the list and puts it in val RandomVideo

            val RandomVideo = VideoList.filter{it != LastVideo}.random()
            
            LastVideo = RandomVideo
            //Tells PlayVideo to do stuff with the RandomVideo value from the line above this one
            PlayVideo(RandomVideo)
        }
        fun PlayVideo(video: String) {
            val videoView: VideoView = vcVideoView
            val videoPath = "android.resource://" + packageName + "/raw/" + video
            val uri = Uri.parse(videoPath)
            videoView.setVideoURI(uri)

            // start video

            Log.d("VIDEO", "start video")
            vcVideoView.start()
            AttachEvents()
        }
    }
}