package com.example.a10119189_myselfapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //(19 Mei 2022, 10119189,Reza Kurnia, IF-5)
    private static  int SPLASH_SCREEN = 4000;
    // variables
    Animation topAnim, botAnim;
    ImageView image;
    TextView tittle, desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        botAnim = AnimationUtils.loadAnimation(this, R.anim.bot_anim);

        //Hooks
        image = findViewById(R.id.ss_header);
        tittle = findViewById(R.id.ss_tittle);
        desc = findViewById(R.id.ss_descr1);


        image.setAnimation(topAnim);
        tittle.setAnimation(botAnim);
        desc.setAnimation(botAnim);

        new  Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,WalkThrough1.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}