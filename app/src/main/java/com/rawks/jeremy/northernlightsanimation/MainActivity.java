package com.rawks.jeremy.northernlightsanimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    // Object to facilitate frame-by-frame animation
    AnimationDrawable lightsAnimation;

    // Object representations of activity widgets
    ImageView imgLights;
    Button btnStartFrame, btnStartTween;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get object representations of activity widgets
        imgLights = findViewById(R.id.imgLights);
        btnStartFrame = findViewById(R.id.btnStartFrame);
        btnStartTween = findViewById(R.id.btnStartTween);

        // Create the northern lights animation
        imgLights.setBackgroundResource(R.drawable.animation);
        lightsAnimation=(AnimationDrawable)imgLights.getBackground();

        // Create event listener and handler for "Start Frame Animation" button click
        btnStartFrame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                lightsAnimation.start();
            }
        });

        // Create event listener and handler for "Start Tween Animation" button click
        btnStartTween.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                lightsAnimation.stop();
                startActivity (new Intent(MainActivity.this, Tween.class));
            }
        });
    }
}