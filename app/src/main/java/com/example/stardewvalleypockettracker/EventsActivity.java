package com.example.stardewvalleypockettracker;

import android.os.Bundle;
import android.view.View;

public class EventsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.activity_events);
        setSettingsVisibility(View.INVISIBLE);
    }
}
