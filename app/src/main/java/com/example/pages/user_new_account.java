package com.example.pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class user_new_account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_new_account);
    }

    public void Profile(View view)
    {
        Intent intent=new Intent(getApplicationContext(),user_profile.class);
        startActivity(intent);
    }

}
