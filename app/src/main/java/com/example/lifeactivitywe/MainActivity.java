package com.example.lifeactivitywe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String T="Mainactivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(T,"onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(T,"onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(T,"onpause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(T,"ondestroy");
    }
}