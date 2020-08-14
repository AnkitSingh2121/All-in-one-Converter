package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
    }

    public void cubeclk(View view) {
        EditText e1 = (EditText) findViewById(R.id.editText4);
        TextView tv = (TextView) findViewById(R.id.textView8);
        if (e1.getText().toString().isEmpty()) {
            e1.setError("empty value");
        } else {
            int a = Integer.parseInt(e1.getText().toString().trim());
            int b = a * a * a;
            tv.setText("cube is :" + b);
        }
    }
    }



