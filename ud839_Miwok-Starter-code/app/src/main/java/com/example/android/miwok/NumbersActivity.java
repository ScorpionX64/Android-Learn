package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Array;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] numbersWords = new String[10];
        numbersWords[0] = "One";
        numbersWords[1] = "Two";
        numbersWords[2] = "Three";
        numbersWords[3] = "Four";
    }
}
