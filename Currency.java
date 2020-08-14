package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Currency extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private Button btnSubmit;
    private EditText num;
    private TextView to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        btnSubmit = (Button) findViewById(R.id.button6);

        to = (TextView) findViewById(R.id.textView5);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        List<String> list1 = new ArrayList<String>();
        list1.add("Indian Rupees");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);


        spinner2 = (Spinner) findViewById(R.id.spinner1);
        List<String> list2 = new ArrayList<String>();
        list2.add("American Doller");
        list2.add("Euro");
        list2.add("NewZeland Doller");
        list2.add("Dinar");
        list2.add("Canadian Doller");
        list2.add("Austrailan Doller");
        list2.add("Malaysian Ringgit");
        list2.add("Swiss Franc CHF");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);
    }

    public void onClick(View v) {
        int index1 = spinner1.getSelectedItemPosition();
        int index2 = spinner2.getSelectedItemPosition();
        num = (EditText) findViewById(R.id.editText2);


        if (num.getText().toString().isEmpty()) {
            num.setError("empty value");
        }
        else{
            float value = Float.parseFloat(num.getText().toString());

            /* you have 8 units to convert from and to.
             * that means 8*8 = 64 cases!
             * to minimize work we convert from any selected unit to Centimeter
             * then we convert from Centimeter to the desired unit.
             */

            // ratios from google convertor
            int ind = 1;
            float ratio[] = {73.25f, 95.56f, 46.33f, 53.25f, 48.68f, 43.0f, 17.36f, 78.776f};
            float result = value / ind * ratio[index2];
            to.setText(result + "");

        }
    }
}
