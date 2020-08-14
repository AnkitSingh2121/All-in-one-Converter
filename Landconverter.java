package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Landconverter extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private Button btnSubmit;
    private EditText from;
    private TextView to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landconverter);
        btnSubmit = (Button) findViewById(R.id.button6);
        from = (EditText) findViewById(R.id.editText2);
        to = (TextView) findViewById(R.id.textView5);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        List<String> list1 = new ArrayList<String>();
        list1.add("Inches");
        list1.add("Feet");
        list1.add("Yard");
        list1.add("Miles");
        list1.add("Milimeter");
        list1.add("Centimeter");
        list1.add("Meter");
        list1.add("Kilometer");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);


        spinner2 = (Spinner) findViewById(R.id.spinner1);
        List<String> list2 = new ArrayList<String>();
        list2.add("Inches");
        list2.add("Feet");
        list2.add("Yard");
        list2.add("Miles");
        list2.add("Milimeter");
        list2.add("Centimeter");
        list2.add("Meter");
        list2.add("Kilometer");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);
    }

    public void Inchclk(View view) {
        int index1 = spinner1.getSelectedItemPosition();
        int index2 = spinner2.getSelectedItemPosition();
        if (from.getText().toString().isEmpty()) {
            from.setError("empty value");
        }
        else {
            float value = Float.parseFloat(from.getText().toString());

            /* you have 8 units to convert from and to.
             * that means 8*8 = 64 cases!
             * to minimize work we convert from any selected unit to Centimeter
             * then we convert from Centimeter to the desired unit.
             */

            // ratios from google convertor
            float ratio[] = {0.393701f, 0.0328084f, 0.0109361f, 6.21371e-6f, 10.0f, 1.0f, 0.01f, 1.0e-5f};
            float result = value / ratio[index1] * ratio[index2];
            to.setText(result + "");
        }
    }
}



