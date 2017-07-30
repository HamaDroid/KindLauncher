package com.hamadroid.kindlauncher;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

import static android.net.Uri.parse;
import static com.hamadroid.kindlauncher.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_Wallpaper_NoTitleBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.vending");
        startActivity(intent);
    }

    public void line(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("jp.naver.line.android");
        startActivity(intent);
    }

    public void gallery(View v) {
        Intent intent = new Intent();
        intent.setType("image/*");
        startActivity(intent);
    }

    public void map(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        startActivity(intent);
    }

    public void setting(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.settings");
        startActivity(intent);
    }

    public void camera(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("image:"));
        startActivity(intent);
    }

    public void radio(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("jp.radiko.Player");
        startActivity(intent);
    }

    public void phone(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"));
        startActivity(intent);
    }

    public void weather(View v) {
        Uri uri = Uri.parse("https://tenki.jp/");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void search(View v) {
        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.google.android.googlequicksearchbox");
        startActivity(intent);
    }

    public void onBackPressed() {
    }
    public void next(View v) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);
    }
}
