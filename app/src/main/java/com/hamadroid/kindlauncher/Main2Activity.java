package com.hamadroid.kindlauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_Wallpaper_NoTitleBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
