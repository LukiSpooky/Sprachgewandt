package com.example.sprachgewandt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SpracheActivity extends AppCompatActivity {

    ImageView home = null;
    TextView sprText = null;
    Button sprErkennen = null;
    EditText sprEingabe = null;
    TextView sprTitel = null;
    TextView sprAusgabe = null;
    String sprache = null; //Die API wird den Wert hier abspeichern
    Intent homeIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprache);

        home = (ImageView) findViewById(R.id.home);
        sprText = (TextView) findViewById(R.id.sprText);
        sprErkennen = (Button) findViewById(R.id.sprErkennen);
        sprEingabe = (EditText) findViewById(R.id.sprEingabe);
        sprTitel = (TextView) findViewById(R.id.sprTitel);
        sprAusgabe = (TextView) findViewById(R.id.sprAusgabe);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                homeIntent = new Intent(SpracheActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }


        });

        sprErkennen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sprache API
            }
        });

    }
}