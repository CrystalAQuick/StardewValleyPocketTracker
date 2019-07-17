package com.example.stardewvalleypockettracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

abstract class BaseActivity extends AppCompatActivity {
    protected TextView txtTitle;
    protected ImageView imgSettings;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void openActivitiesOnClick(){
        View settingsButton = findViewById(R.id.settings_icon);
        settingsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openSettingsMenu();
            }
        });
    }

    public void openSettingsMenu(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_icon, menu);
        return true;
    }

    public void setTitle(int resId) {
        if (txtTitle == null)
            txtTitle = findViewById(R.id.txtActivityTitle);
        if (txtTitle != null)
            txtTitle.setText(resId);
    }

    public void setSettingsVisibility(int viewVisibility) {
        if (imgSettings == null)
            imgSettings = findViewById(R.id.settings_icon);
        if (imgSettings != null)
            imgSettings.setVisibility(viewVisibility);
    }
}
