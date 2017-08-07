package com.hamadroid.kindlauncher;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.hamadroid.kindlauncher.R.id.button;
import static com.hamadroid.kindlauncher.R.id.playButton;

public class FragmentOne extends Fragment {

    Button play = getActivity().findViewById(playButton);
    button.setOnClickListener(new View.OnClickListener(){

    }
    @Override
    playButton.setOnClickListener(new View.OnClickListener()
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    int[] ={R.id.playButton,
            R.id.lineButton,
            R.id.mapButton,
            R.id.galleryButton};
    }
    ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(
            getFragmentManager(),ver);
    viewPager.setAdapter(pagerAdapter);
}
    public void play(View v) {
        PackageManager pm = getActivity().getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.vending");
        startActivity(intent);
    }

    public void line(View v) {
        PackageManager pm = getActivity().getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("jp.naver.line.android");
        startActivity(intent);
    }

    public void gallery(View v) {
        Intent intent = new Intent();
        intent.setType("image*//*");
        startActivity(intent);
    }

    public void map(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        startActivity(intent);
    }

    public void setting(View v) {
        PackageManager pm = getActivity().getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("com.android.settings");
        startActivity(intent);
    }

    public void camera(View v) {
        Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
        startActivity(intent);
    }

    public void radio(View v) {
        PackageManager pm = getActivity().getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage("jp.radiko.Player");
        startActivity(intent);
    }

    public void phone(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    public void search(View v) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        startActivity(intent);
    }
}
