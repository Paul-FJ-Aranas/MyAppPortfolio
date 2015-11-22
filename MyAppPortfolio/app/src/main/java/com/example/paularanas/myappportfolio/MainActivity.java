package com.example.paularanas.myappportfolio;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button spotifyButton;
    private Button scoresButton;
    private Button libraryButton;
    private Button buildItBiggerButton;
    private Button xyzReaderButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeButtons();
        spotifyButton.setOnClickListener(this);
        scoresButton.setOnClickListener(this);
        libraryButton.setOnClickListener(this);
        buildItBiggerButton.setOnClickListener(this);
        xyzReaderButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Toast toast = null;

        switch (v.getId()) {

            case R.id.button_SpotifyApp:
                if (toast == null) {
                    toast.makeText(MainActivity.this, " This button will launch \nmy Spotify Streamer App", Toast.LENGTH_SHORT).show();
                } else {
                    toast.cancel();
                }
                break;
            case R.id.button_ScoresApp:
                if (toast == null) {
                    toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
                } else {
                    toast.cancel();
                }
                break;
            case R.id.button_LibraryApp:
                if (toast == null) {
                    toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
                } else {
                    toast.cancel();
                }
                break;
            case R.id.button_BuildItBiggerApp:
                if (toast == null) {
                    toast.makeText(MainActivity.this, "This button will launch \nmy Build It Bigger App", Toast.LENGTH_SHORT).show();
                } else {
                    toast.cancel();
                }
                break;
            case R.id.button_XYZReaderApp:
                if (toast == null) {
                    toast.makeText(MainActivity.this, "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
                } else {
                    toast.cancel();
                }
                break;
            case R.id.button_CapstoneApp:
                if (toast == null) {
                    toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
                } else {
                    toast.cancel();
                }
                break;

        }

    }

    public void initializeButtons() {
        spotifyButton = (Button) findViewById(R.id.button_SpotifyApp);
        scoresButton = (Button) findViewById(R.id.button_ScoresApp);
        libraryButton = (Button) findViewById(R.id.button_LibraryApp);
        buildItBiggerButton = (Button) findViewById(R.id.button_BuildItBiggerApp);
        xyzReaderButton = (Button) findViewById(R.id.button_XYZReaderApp);
        capstoneButton = (Button) findViewById(R.id.button_CapstoneApp);
    }


}


