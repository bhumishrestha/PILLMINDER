package com.example.pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class setting_medprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_medprofile);
    }

    public void alarm(View view) {
        Intent intent = new Intent(getApplicationContext(),AlarmActivity.class);
        startActivity(intent);
    }
public void medpro(View view)
{
    Intent intent=new Intent(getApplicationContext(),Medications_profile.class);
    startActivity(intent);
}
}




