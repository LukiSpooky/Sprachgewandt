package com.example.sprachgewandt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class OptionenActivity extends AppCompatActivity {

    ImageView home;
    Intent homeIntent;
    ImageButton grau;
    ImageButton weiss;
    ImageButton blau;
    ImageButton gelb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionen);

        home = (ImageView) findViewById(R.id.home);
        grau = (ImageButton) findViewById(R.id.grau);
        weiss = (ImageButton) findViewById(R.id.weiss);
        blau = (ImageButton) findViewById(R.id.blau);
        gelb = (ImageButton) findViewById(R.id.gelb);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                homeIntent = new Intent(OptionenActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }


        });

        grau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        weiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        blau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        gelb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}