package com.example.sprachgewandt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titel = null;
    Button synonym = null;
    Button sprache = null;
    Button optionen = null;
    Intent synIntent;
    Intent sprIntent;
    Intent optIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button synonym = (Button) findViewById(R.id.synonym);
        Button sprache = (Button) findViewById(R.id.sprache);
        Button optionen = (Button) findViewById(R.id.optionen);

        synonym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            synIntent = new Intent(MainActivity.this, SynonymActivity.class);

            startActivity(synIntent);
            }
        });

        sprache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            sprIntent = new Intent(MainActivity.this, SpracheActivity.class);
            startActivity(sprIntent);
            }
        });

        optionen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            optIntent = new Intent(MainActivity.this, OptionenActivity.class);
            startActivity(optIntent);
            }
        });



    }
}