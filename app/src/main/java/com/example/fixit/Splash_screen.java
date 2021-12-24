package com.example.fixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_screen extends AppCompatActivity {
    ImageView logo;
    TextView text;
    LottieAnimationView anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //anim = AnimationUtils.loadAnimation(this,R.anim.alfa);
        logo = (ImageView) findViewById(R.id.imageView2);
        text = (TextView) findViewById(R.id.textView) ;
        anim = (LottieAnimationView) findViewById(R.id.animationView) ;
        //anim.animate().translationX(2000).setDuration(500).setStartDelay(0);


        Thread logoTimer = new Thread()
        {
            public void run()
            {
                try
                {
                    int logoTimer = 0;
                    while(logoTimer < 2300)
                    {
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
                catch (InterruptedException e)
                {
                    // TODO: автоматически сгенерированный блок catch.
                    e.printStackTrace();
                }
                finally
                {
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}