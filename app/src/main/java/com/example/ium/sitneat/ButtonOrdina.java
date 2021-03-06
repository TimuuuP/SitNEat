package com.example.ium.sitneat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.graphics.Color;



public class ButtonOrdina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_ordina);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final TextView tv = (TextView) findViewById(R.id.tv);
        NumberPicker np = (NumberPicker) findViewById(R.id.np);
        tv.setTextColor(Color.parseColor("#AF0000"));
        np.setMinValue(1);
        np.setMaxValue(15);
        np.setWrapSelectorWheel(true);

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                tv.setText("Tavolo selezionato: " + newVal);
                tv.setTextColor(Color.parseColor("#AF0000"));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu:
                return true;

            case android.R.id.home:
                this.finish();
                return true;

            default:
                // L'azione dell'utente non viene riconosciuta
                // Invoca la superclasse per gestirlo
                return super.onOptionsItemSelected(item);
        }
    }

    public void confirmButton(View view) {
        Intent myIntent = new Intent(this, OrderScreen.class);
        //myIntent.putExtra("key", value); //Parametri opzionali da passare
        startActivity(myIntent);
    }

}
