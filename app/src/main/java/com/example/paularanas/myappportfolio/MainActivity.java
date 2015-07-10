package com.example.paularanas.myappportfolio;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
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


        switch (v.getId()) {

            case R.id.button_SpotifyApp:
                Toast.makeText(MainActivity.this, "This button will launch \nmy Spotify Stream App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_ScoresApp:
                Toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_LibraryApp:
                Toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_BuildItBiggerApp:
                Toast.makeText(MainActivity.this, "This button will launch \nmy Build It Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_XYZReaderApp:
                Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_CapstoneApp:
                Toast.makeText(MainActivity.this, "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
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


