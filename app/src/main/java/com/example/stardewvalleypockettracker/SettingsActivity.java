package com.example.stardewvalleypockettracker;

import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);
        setTitle(R.string.activity_settings);
        setSettingsVisibility(View.INVISIBLE);
    }
}
