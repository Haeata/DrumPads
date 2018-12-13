package com.example.haeata.drumpads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView textView;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        home = (Button) findViewById(R.id.home);

        //Listen for home button press
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomenActivty();
                finish();
            }
        });

        //Text view with scrolling movement used for about details
        textView = (TextView)findViewById(R.id.aboutText);

        String about = "Welcome, This is DRUM PAD \n\nAbout DRUM PAD:\n\nThis is an audio sampler app that uses pads to play audio .wav files. " +
                "Each Pad has its own unique sound when touched" +
                "The concept behind this app was to allow you to make music using samples. An additional feature of this app is you can play along with guided assistance. " +
                "\n\nHow to use Play along: Press Start Tutorial button and follow the cues. (The Start Tutorial button will indicate wat pad to press" +
                "\n\nHow to use Free Play: Feel free to make your own music with the available pads." +
                "\n\nAbout Developer \n\nMy Name is Haeata, I'm from Hamilton New Zealand. " +
                "I am currently doing a Bachelors Degree in Applied Information Technology at WINTEC. Mobile apps is something i have a lot of interest in along with Database systems and Analyzing \n\n Contact Info: haeatamikaere@gmail.com";

        textView.setText(about);

        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void openHomenActivty(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}
