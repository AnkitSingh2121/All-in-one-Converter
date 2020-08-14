package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Temperature extends AppCompatActivity {
    RadioButton cel;
    RadioButton far;
    EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
    }

    public void convert(View view) {
         t=(EditText)findViewById(R.id.editText);
         cel=(RadioButton) findViewById(R.id.radioButton);
         far=(RadioButton)findViewById(R.id.radioButton2);
        TextView show=(TextView)findViewById(R.id.textView6);
        if (t.getText().toString().isEmpty()) {
            t.setError("empty value");
        }
        else {
            double tem = new Double(t.getText().toString());
            if (cel.isChecked()) {
                double fahrenheit = (9.0 / 5.0) * tem + 32;
                show.setText("Temp in Fahrenheit is : " + fahrenheit);
            } else if ((far.isChecked())) {
                float c = (float) ((tem - 32.00f) * 5.00f / 9.00f);
                //     float b= (float) (tem-32.00f);
                //     float c=b*5.00f/9.00f;
                show.setText("Temp in Celsius is:" + c);

            }
        }

         }
    }

