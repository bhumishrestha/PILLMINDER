package com.example.pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class user_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
    }
    public void setmeds(View view)
    {
        Intent intent=new Intent(getApplicationContext(),setting_medprofile.class);
        startActivity(intent);
    }

}
