package com.example.m4l3x.kuriasappdev;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by m4l3x on 3/5/17.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_kurias);


        Thread myThread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),KuriasMainActivity.class);
                    startActivity(intent);
                    finish();

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
            myThread.start();

    }

}