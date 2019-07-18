package com.example.stardewvalleypockettracker;

import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar); // TODO: reference xml after layout is created
        setTitle(R.string.activity_settings);
    }
}
