package com.example.stardewvalleypockettracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.activity_main);
        // TODO: Remove once settings menu sets to View.Invisible; this is here now so the method has a reference
        setSettingsVisibility(View.VISIBLE);
    }
}
