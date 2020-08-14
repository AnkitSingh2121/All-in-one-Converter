package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Activity extends AppCompatActivity {

    private static int SPLASH_TIMEOUT=6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        ImageView iv=(ImageView) findViewById(R.id.imageView);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        iv.startAnimation(myanim);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i=new Intent(Splash_Activity.this,MainActivity.class);
                startActivity(i);
            }
    },SPLASH_TIMEOUT);
    }
}
