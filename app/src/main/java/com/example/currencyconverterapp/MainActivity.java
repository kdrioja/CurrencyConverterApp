package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConvertButton(View view) {
        Log.i("Info", "Convert Button was pressed.");
        EditText pounds = (EditText) findViewById(R.id.numberEditText);
        double dollars = Double.parseDouble(pounds.getText().toString()) * 1.22;
        Log.i("Dollars", "$" + String.format("%.2f", dollars));
        Toast.makeText(this, "$" + String.format("%.2f", dollars), Toast.LENGTH_LONG).show();

    }
}
