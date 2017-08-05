package com.hamadroid.kindlauncher;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_Wallpaper_NoTitleBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void phone(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"));
        startActivity(intent);
    }
    public void search(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.google.android.googlequicksearchbox");
        startActivity(intent);
    }
    public void radio(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("jp.radiko.Player");
        startActivity(intent);
    }
    public void gallery(View v) {
        Intent intent = new Intent();
        intent.setType("image/*");
        startActivity(intent);
    }
}