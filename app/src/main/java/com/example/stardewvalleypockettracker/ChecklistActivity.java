package com.example.stardewvalleypockettracker;

import android.os.Bundle;

public class ChecklistActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        setTitle(R.string.activity_checklists);
    }
}
