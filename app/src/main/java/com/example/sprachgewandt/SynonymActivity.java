package com.example.sprachgewandt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class SynonymActivity extends AppCompatActivity {

    ImageView home = null;
    TextView synText = null;
    Button synSuchen = null;
    EditText synEingabe = null;
    TextView synTitel = null;
    TextView synAusgabe = null;
    String synonym = null; //Die API wird den Wert hier abspeichern
    Intent homeIntent;
    String synUserEingabe;
    String url;
    Button neueSuche;
    TextView hinweis;
    private RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synonym);
        this.queue = Volley.newRequestQueue(this);

        home = (ImageView) findViewById(R.id.home);
        synText = (TextView) findViewById(R.id.synText);
        synSuchen = (Button) findViewById(R.id.synSuchen);
        synEingabe = (EditText) findViewById(R.id.synEingabe);
        synTitel = (TextView) findViewById(R.id.synTitel);
        synAusgabe = (TextView) findViewById(R.id.synAusgabe);
        neueSuche = (Button) findViewById(R.id.neueSuche);
        hinweis = (TextView) findViewById(R.id.hinweis);

        synEingabe.setText("");
        synEingabe.setHint("Wort Eingeben");

        synAusgabe.setVisibility(View.INVISIBLE);
        neueSuche.setVisibility(View.INVISIBLE);

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
                synUserEingabe = synEingabe.getText().toString();
                url = "https://words.bighugelabs.com/api/2/88a6b016f1c8db6307c9d2b49e4c4616/" + synUserEingabe +"/json";
                getSynonym();
            }


        });

        neueSuche.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                synAusgabe.setVisibility(View.INVISIBLE);
                synText.setVisibility(View.VISIBLE);
                synSuchen.setVisibility(View.VISIBLE);
                neueSuche.setVisibility(View.INVISIBLE);
                synEingabe.setVisibility(View.VISIBLE);
                hinweis.setVisibility(View.VISIBLE);
                synEingabe.setText("");
            }


        });



    }

    private void getSynonym(){
        StringRequest stringRequest = new StringRequest
                (Request.Method.GET, url, new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonStream = new JSONObject(response.toString());
                            System.out.println("TRY SCHLAUFE" + jsonStream.toString());
                            JSONObject jsonStream2 = new JSONObject(jsonStream.get("noun").toString());

                            synAusgabe.setVisibility(View.VISIBLE);
                            synText.setVisibility(View.INVISIBLE);
                            synSuchen.setVisibility(View.INVISIBLE);
                            neueSuche.setVisibility(View.VISIBLE);
                            synEingabe.setVisibility(View.INVISIBLE);
                            hinweis.setVisibility(View.INVISIBLE);
                            synAusgabe.setText("Ausgabe: " + jsonStream2.get("syn"));
                        } catch (JSONException e) {
                            e.printStackTrace();

                        }


                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        synAusgabe.setText("RIP! No Synonym geladen :(");
                    }
                });
        this.queue.add(stringRequest);

    }


}


