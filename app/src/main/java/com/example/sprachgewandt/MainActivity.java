package com.example.sprachgewandt;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titel;
    Button synonym;
    Button sprache;
    Button optionen;
    Intent synIntent;
    Intent sprIntent;
    Intent optIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button synonym = (Button) findViewById(R.id.synonym);
        final Button sprache = (Button) findViewById(R.id.sprache);
        final Button optionen = (Button) findViewById(R.id.optionen);



        synonym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomin);synonym.startAnimation(animation);
            synIntent = new Intent(MainActivity.this, SynonymActivity.class);
            startActivity(synIntent);
            }
        });

        sprache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomin);
                sprache.startAnimation(animation);
            sprIntent = new Intent(MainActivity.this, SpracheActivity.class);
            startActivity(sprIntent);
            }
        });

        optionen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomin);
                optionen.startAnimation(animation);
                optIntent = new Intent(MainActivity.this, OptionenActivity.class);
                startActivity(optIntent);
            }
        });



    }


}