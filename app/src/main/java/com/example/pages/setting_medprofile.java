package com.example.pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class setting_medprofile extends AppCompatActivity {
    String[] medicine = {"citapher", "citamol", "Metaphin", "Betadin", "Homide eye", "Metaspray", " Diapride", "Digene"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_medprofile);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, medicine);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, medicine);
        AutoCompleteTextView atc = findViewById(R.id.autotext);
        AutoCompleteTextView atc1 = findViewById(R.id.autotext1);

        atc.setThreshold(1);
        atc1.setThreshold(1);
        atc.setAdapter(adapter);
        atc1.setAdapter(adapter1);

        atc.setOnItemClickListener(new AdapterView.OnItemClickListener()

        {
            @Override
            public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
                Toast.makeText(getApplicationContext(), "selected medicine" + parent.getSelectedItem(), Toast.LENGTH_LONG).show();
            }

        });
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




