package com.example.stardewvalleypockettracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.activity_main);
        openActivitiesOnClick();
        onClickEventButtonActivity();
        onClickChecklistButtonActivity();
    }

    public void onClickEventButtonActivity(){
        View eventsButton = findViewById(R.id.btnEvents);
        eventsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openEventsActivity();
            }
        });
    }

    public void onClickChecklistButtonActivity(){
        View eventsButton = findViewById(R.id.btnChecklist);
        eventsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openChecklistActivity();
            }
        });
    }

    public void openEventsActivity(){
        Intent intent = new Intent(this, EventsActivity.class);
        startActivity(intent);
    }
    public void openChecklistActivity(){
        Intent intent = new Intent(this, ChecklistActivity.class);
        startActivity(intent);
    }

}
