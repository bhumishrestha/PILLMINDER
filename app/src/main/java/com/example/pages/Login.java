package com.example.pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void profile1(View view)
    {
        Intent intent=new Intent(getApplicationContext(),user_profile.class);
        startActivity(intent);
    }

    public void newuser(View view)
    {
        Intent intent=new Intent(getApplicationContext(),user_new_account.class);
        startActivity(intent);
    }
}
