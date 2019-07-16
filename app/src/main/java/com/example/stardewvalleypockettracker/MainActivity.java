package com.example.stardewvalleypockettracker;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends BaseActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.activity_main);
        setSettingsVisibility(View.VISIBLE);
        int logoResourceID = getResources().getIdentifier("drawable/logo", null, this.getPackageName());
        ImageView testImage = findViewById(R.id.logo);
        testImage.setImageResource(logoResourceID);
        openActivitiesOnClick();
    }
}
