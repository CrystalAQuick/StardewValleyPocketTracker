package com.example.stardewvalleypockettracker;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends BaseActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.activity_main);
        setSettingsVisibility(View.VISIBLE);

        View mButton = findViewById(R.id.settings_icon);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public  void onClick(View view){
                       openSettingsMenu();
            }
        });
        int IR = getResources().getIdentifier("drawable/testlogo", null, this.getPackageName());
        ImageView testImage = (ImageView) findViewById(R.id.testlogo);
        testImage.setImageResource(IR);
    }

    public void openSettingsMenu(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
