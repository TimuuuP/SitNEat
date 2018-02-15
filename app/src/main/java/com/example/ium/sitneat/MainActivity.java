package com.example.ium.sitneat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu:
                return true;

            default:
                // L'azione dell'utente non viene riconosciuta
                // Invoca la superclasse per gestirlo
                return super.onOptionsItemSelected(item);
        }
    }

    public void orderButton(View view) {
        Intent myIntent = new Intent(this, ButtonOrdina.class);
        //myIntent.putExtra("key", value); //Parametri opzionali da passare
        startActivity(myIntent);
    }
}
