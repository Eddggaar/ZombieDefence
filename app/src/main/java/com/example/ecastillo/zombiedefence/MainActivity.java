package com.example.ecastillo.zombiedefence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenSettingScreen(View view){
        setContentView(R.layout.activity_setting_screen);
    }

    public void OpenMainActivity(View view){
        setContentView(R.layout.activity_main);
    }

    public void OpenHighscoreActivity(View view){
        setContentView(R.layout.activity_highscore);
    }

    public void OpenStoremenuActivity(View view){
        setContentView(R.layout.activity_storemenu);
    }

    public void OpenAboutActivity(View view){
        setContentView(R.layout.activity_about);
    }
}
