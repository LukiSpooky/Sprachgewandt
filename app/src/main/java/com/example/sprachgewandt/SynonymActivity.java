package com.example.sprachgewandt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SynonymActivity extends AppCompatActivity {

    ImageView home = null;
    TextView synText = null;
    Button synSuchen = null;
    EditText synEingabe = null;
    TextView synTitel = null;
    TextView synAusgabe = null;
    String synonym = null; //Die API wird den Wert hier abspeichern
    Intent homeIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synonym);

        home = (ImageView) findViewById(R.id.home);
        synText = (TextView) findViewById(R.id.synText);
        synSuchen = (Button) findViewById(R.id.synSuchen);
        synEingabe = (EditText) findViewById(R.id.synEingabe);
        synTitel = (TextView) findViewById(R.id.synTitel);
        synAusgabe = (TextView) findViewById(R.id.synAusgabe);

        synEingabe.setHint("Wort Eingeben");

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                homeIntent = new Intent(SynonymActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }


        });

        synSuchen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Synonym API
            }


        });



    }
}