package com.example.chandru.myapplicationvook;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mVideoView = (VideoView) findViewById(R.id.bgvideoView);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.saveas);

        mVideoView.setVideoURI(uri);
        mVideoView.start();


        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        //button actions
findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this,signup_activity.class);
        startActivity(i);
    }
});
//        Button button =(Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Sign up page redirection ", Toast.LENGTH_SHORT).show();
//                Intent intent_to_signup = new Intent(this,signup_activity.class);
//                startActivity(intent_to_signup);
//
//            }
//        });
        Button  button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sign in page redirection ", Toast.LENGTH_SHORT).show();
                Intent intent_to_signin=new Intent(MainActivity.this,signin_activity.class);
                startActivity(intent_to_signin);

            }
        });
    }
}