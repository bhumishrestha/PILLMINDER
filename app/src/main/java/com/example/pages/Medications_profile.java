package com.example.pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Medications_profile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medications_profile);
    }


    public void settingmed(View view){
        Intent intent=new Intent(getApplicationContext(),setting_medprofile.class);
        startActivity(intent);
    }
    public void report(View view){
        Intent intent=new Intent(getApplicationContext(),Report.class);
        startActivity(intent);
    }
}
