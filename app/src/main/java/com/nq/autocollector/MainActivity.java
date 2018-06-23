package com.nq.autocollector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        staticLoadCVLibraries();
    }

    private void staticLoadCVLibraries() {
        boolean load = OpenCVLoader.initDebug();
        if (load) {
            Log.e("MainActivity", "Open CV Libraries loaded...");
        } else {
            Log.e("MainActivity", "Open CV Libraries not loaded...");
        }
    }
}
