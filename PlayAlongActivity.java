package com.example.haeata.drumpads;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;;

public class PlayAlongActivity extends AppCompatActivity {

    // Initialise variables
    private Handler mHandler = new Handler();
    private Button tutorialBtn;
    private Button home;

    private SoundPool sp;
    private int Bass;
    private int Strings;
    private int Pad;
    private int Hey;
    private int Piano;
    private int Drumbreak;
    private int Drizz;
    private int Clap;
    private int Vocal;
    private int Synth;
    private int Aminor;
    private int Cmajor;
    private int Gmajor;
    private int Fmajor;
    private int AltG;
    private int GrooveA;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_along);

        tutorialBtn = (Button)findViewById(R.id.tutorialBtn);

        home = (Button) findViewById(R.id.home);

        //Listen for home button press and returns to Home activity
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHandler.removeCallbacksAndMessages(null);
                openHomenActivty();

            }
        });




        //Initialise soundpool variables
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        Bass = sp.load(getApplicationContext(),R.raw.bass,1);
        Piano = sp.load(getApplicationContext(),R.raw.piano,1);
        Strings = sp.load(getApplicationContext(),R.raw.strings,1);
        Hey = sp.load(getApplicationContext(),R.raw.chant5,1);
        Hey = sp.load(getApplicationContext(),R.raw.chant5,1);
        Drumbreak = sp.load(getApplicationContext(),R.raw.drumbreak,1);
        Clap = sp.load(getApplicationContext(),R.raw.clap,1);
        Vocal = sp.load(getApplicationContext(),R.raw.flamevox,1);
        Drizz = sp.load(getApplicationContext(),R.raw.drizz,1);
        Synth = sp.load(getApplicationContext(),R.raw.synth,1);
        Pad = sp.load(getApplicationContext(),R.raw.pads,1);
        Aminor = sp.load(getApplicationContext(),R.raw.aminor,1);
        Cmajor = sp.load(getApplicationContext(),R.raw.cmajor,1);
        Fmajor = sp.load(getApplicationContext(),R.raw.fmajor,1);
        Gmajor = sp.load(getApplicationContext(),R.raw.gmajor,1);
        GrooveA = sp.load(getApplicationContext(),R.raw.groovea,1);
        AltG = sp.load(getApplicationContext(),R.raw.altgmajor,1);

    }

    public void openHomenActivty(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    //call runnables and set delay times
    public void tutorial(View view) {
        mHandler.postDelayed(btn1,4000);
        mHandler.postDelayed(btn4,8000);
        mHandler.postDelayed(btn1,12000);
        mHandler.postDelayed(btn2,16000);
        mHandler.postDelayed(btn1,20000);
        mHandler.postDelayed(btn4,24000);
        mHandler.postDelayed(btn1,28000);
        mHandler.postDelayed(btn2,32000);
        mHandler.postDelayed(btn1,36000);
        mHandler.postDelayed(btn4,40000);
        mHandler.postDelayed(btn1,44000);
        mHandler.postDelayed(btn2,48000);
        mHandler.postDelayed(btn1,49000);
        mHandler.postDelayed(btn1,50000);
        mHandler.postDelayed(btn1,51000);
        mHandler.postDelayed(btn1,52000);
        mHandler.postDelayed(btn4,53000);
        mHandler.postDelayed(btn4,54000);
        mHandler.postDelayed(btn4,55000);
        mHandler.postDelayed(btn4,56000);
        mHandler.postDelayed(btn1,57000);
        mHandler.postDelayed(btn1,58000);
        mHandler.postDelayed(btn1,59000);
        mHandler.postDelayed(btn1,60000);
        mHandler.postDelayed(btn2,61000);
        mHandler.postDelayed(btn2,62000);
        mHandler.postDelayed(btn2,63000);
        mHandler.postDelayed(btn2,64000);


    }

    //Create Runaables to call. Each runnable changes the colour of the Start Tutorial Button and the text, also makes a toast message
    private Runnable btn1 = new Runnable() {

        @Override
        public void run() {
            tutorialBtn.setBackgroundResource(R.drawable.blue_button);
            tutorialBtn.setText("1");
            Toast.makeText(PlayAlongActivity.this,"Press button 1", Toast.LENGTH_SHORT).show();

        }
    };

    private Runnable btn2 = new Runnable() {
        @Override
        public void run() {
            tutorialBtn.setText("2");
            tutorialBtn.setBackgroundResource(R.drawable.blue_button);
            Toast.makeText(PlayAlongActivity.this, "Press button 2", Toast.LENGTH_SHORT).show();
        }
    };

    private Runnable btn3 = new Runnable() {
        @Override
        public void run() {
            tutorialBtn.setText("3");
            tutorialBtn.setBackgroundResource(R.drawable.blue_button);
            Toast.makeText(PlayAlongActivity.this, "Press button 3", Toast.LENGTH_SHORT).show();
        }
    };

    private Runnable btn4 = new Runnable() {
        @Override
        public void run() {
            tutorialBtn.setText("4");
            tutorialBtn.setBackgroundResource(R.drawable.purple_btn);
            Toast.makeText(PlayAlongActivity.this, "Press button 4", Toast.LENGTH_SHORT).show();
        }
    };

    private Runnable btn5 =new Runnable() {
        @Override
        public void run() {
            tutorialBtn.setText("5");
            tutorialBtn.setBackgroundResource(R.drawable.orange_btn);
            Toast.makeText(PlayAlongActivity.this, "Press button 5", Toast.LENGTH_SHORT).show();
        }
    };

    private Runnable btn6 = new Runnable() {
        @Override
        public void run() {
            tutorialBtn.setText("6");
            tutorialBtn.setBackgroundResource(R.drawable.pink_btn);
            Toast.makeText(PlayAlongActivity.this, "Press button 6", Toast.LENGTH_SHORT).show();
        }
    };

    private  Runnable btn7 = new Runnable() {
        @Override
        public void run() {
            tutorialBtn.setText("7");
            tutorialBtn.setBackgroundResource(R.drawable.green_btn);
            Toast.makeText(PlayAlongActivity.this, "Press button 7", Toast.LENGTH_SHORT).show();
        }
    };

    private Runnable btn8 = new Runnable() {
        @Override
        public void run() {
            tutorialBtn.setText("8");
            tutorialBtn.setBackgroundResource(R.drawable.green_btn);
            Toast.makeText(PlayAlongActivity.this, "Press button 8", Toast.LENGTH_SHORT).show();
        }
    };

    private Runnable btn9 = new Runnable() {
        @Override
        public void run() {
            tutorialBtn.setText("9");
            tutorialBtn.setBackgroundResource(R.drawable.pink_btn);
            Toast.makeText(PlayAlongActivity.this, "Press button 9", Toast.LENGTH_SHORT).show();
        }
    };




    //Sets sound pool to button
    public void playsound1 (View view){
        sp.play(Aminor,1.0f,1.0f,0,0,1f);


    }

    public void playsound2 (View view){
        sp.play(Cmajor,1.0f,1.0f,0,0,1f);


    }

    public void playsound3 (View view){
        sp.play(Gmajor,1.0f,1.0f,0,0,1f);


    }

    public void playsound4 (View view){
        sp.play(Fmajor,1.0f,1.0f,0,0,1f);

    }

    public void playsound5 (View view){
        sp.play(Hey,1.0f,1.0f,0,0,1f);


    }

    public void playsound6 (View view){
        sp.play(Drumbreak,1.0f,1.0f,0,0,1f);

    }

    public void playsound7 (View view){
        sp.play(Clap,1.0f,1.0f,0,0,1f);

    }

    public void playsound8 (View view){
        sp.play(GrooveA,1.0f,1.0f,0,0,1f);

    }

    public void playsound9 (View view){
        sp.play(AltG,1.0f,1.0f,0,0,1f);

    }
}
