package com.example.haeata.drumpads;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    //Initialise button variables
    private Button freeplay;
    private Button playalong;
    private Button about;
    private AudioManager myAudioManager;
    Switch mute_unmute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Initialise Audio Manager allows control of devices volume settings
        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

        //Toggle switch control
        mute_unmute = (Switch) findViewById(R.id.mute_switch);
        mute_unmute.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    //Mutes media volume
                    myAudioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC,
                            AudioManager.ADJUST_MUTE, AudioManager.FLAG_SHOW_UI);
                    Toast.makeText(getApplicationContext(), "Sound Disabled",
                            Toast.LENGTH_SHORT).show();

                }
                else{
                    //Un-mute media volume
                    myAudioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC,
                            AudioManager.ADJUST_UNMUTE, AudioManager.FLAG_SHOW_UI);
                    Toast.makeText(getApplicationContext(), "Sound Enabled.",
                            Toast.LENGTH_SHORT).show();

                }
            }
        });

        freeplay = (Button) findViewById(R.id.freeplay_button);
        freeplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        playalong = (Button) findViewById(R.id.playalong_button);
        playalong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPlayAlongActivity();
            }
        });

        about = (Button) findViewById(R.id.about_button);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPlayAlongActivity(){
        Intent intent = new Intent(this, PlayAlongActivity.class);
        startActivity(intent);
    }

    public void openAboutActivity(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
