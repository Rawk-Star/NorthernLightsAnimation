package com.rawks.jeremy.northernlightsanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Tween extends AppCompatActivity
{
    // Object representation of activity widget
    ImageView imgRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        // Get object representation of activity widget
        imgRotate = findViewById(R.id.imgTween);

        // Start tween animation rotation of image
        imgRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));
    }
}
