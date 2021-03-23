package com.gohool.login.sampledisplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    Button ayurvedic, alopethic;
    CardView allopathic_cardview, ayurvedic_cardview;

    Animation topAnimation, bottomAnimation, middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ayurvedic = (Button) findViewById(R.id.ayurvedic);
        alopethic = (Button) findViewById(R.id.alophethic);

        allopathic_cardview = (CardView) findViewById(R.id.allopathic_cardview);
        ayurvedic_cardview = (CardView) findViewById(R.id.ayurvedic_cardview);


        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);

        alopethic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Allopathic_medicines.class);
                startActivity(i);
            }
        });
        ayurvedic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, Ayurvedic_medicines.class);
                startActivity(i1);
            }
        });


        alopethic.setAnimation(middleAnimation);
        ayurvedic.setAnimation(bottomAnimation);
        allopathic_cardview.setAnimation(topAnimation);
        ayurvedic_cardview.setAnimation(topAnimation);




        Thread mythread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(4000);// 3 second

                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }


            }
        });

        mythread.start();



    }
}
