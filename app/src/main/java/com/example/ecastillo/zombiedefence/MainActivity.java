package com.example.ecastillo.zombiedefence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String Svfile = "setting_save";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenSettingScreen(View view){
        Intent intent = new Intent (this, SettingScreen.class);
        startActivity(intent);
    }

    public void OpenMainActivity(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void OpenHighscoreActivity(View view){
        Intent intent = new Intent (this, HighscoreActivity.class);
        startActivity(intent);
    }

    public void OpenStoremenuActivity(View view){
        Intent intent = new Intent (this, Storemenu.class);
        startActivity(intent);
    }

    public void OpenCameraScreen(View view){
        Intent intent = new Intent (this,Camera.class);
        startActivity(intent);
    }

    public void OpenAboutActivity(View view){
        Intent intent = new Intent (this, About.class);
        startActivity(intent);
    }
}
