package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void currencyConverter(View view){

        Log.i( "Info", "Bottom Pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInpounds = editText.getText().toString();
        double amountInpoundsDouble = Double.parseDouble(amountInpounds);
        Double amountInDollarsDouble = amountInpoundsDouble * 1.3;
        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);
        Toast.makeText(this, "£" + amountInpounds + " is $" + amountInDollarsString, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
