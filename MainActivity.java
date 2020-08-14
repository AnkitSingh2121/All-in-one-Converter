package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
        public void currency(View view){
            Intent i = new Intent(this, Currency.class);
            startActivity(i);
    }

    public void temp(View view) {
        Intent i = new Intent(this, Temperature.class);
        startActivity(i);
    }

    public void Square(View view) {
        Intent i = new Intent(this, square.class);
        startActivity(i);
    }

    public void Qube(View view) {
        Intent i=new Intent(this,Cube.class);
        startActivity(i);
    }


    public void inch(View view) {
        Intent i = new Intent(this, Landconverter.class);
        startActivity(i);
    }

    public void btn(View view) {
        Intent i=new Intent(this,Detail.class);
        startActivity(i);
    }
}
