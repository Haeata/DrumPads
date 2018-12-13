package com.example.haeata.drumpads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class Main2Activity extends AppCompatActivity {

    //Initialise splash timem out for 5 seconds
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HomeScreen = new Intent(Main2Activity.this, HomeActivity.class);
                startActivity(HomeScreen);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
