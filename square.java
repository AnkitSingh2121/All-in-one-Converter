package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class square extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }

    public void Squclk(View view) {
        EditText t=(EditText)findViewById(R.id.editText3);
        TextView tv=(TextView)findViewById(R.id.textView7);
        if (t.getText().toString().isEmpty()) {
            t.setError("empty value");
        }
        else{

        int a=Integer.parseInt(t.getText().toString());
        int b=a*a;
        tv.setText("Square is :"+b);
    }
    }

}
