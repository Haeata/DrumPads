package com.example.haeata.drumpads;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_main);



        //When phones volume button pressed it adjusts media volume not ringer volume
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        //Home button opens home activity
        home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                openHomenActivty();
            }
        });




        //initialise variables and set .wav files in raw folder as soundpools
        //Create soundpools
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