package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colorsList = new ArrayList<Word>();

        colorsList.add(new Word(R.raw.color_red,"red","weṭeṭṭi",R.drawable.color_red));
        colorsList.add(new Word(R.raw.color_green,"green","chokokki",R.drawable.color_green));
        colorsList.add(new Word(R.raw.color_brown,"brown","ṭakaakki",R.drawable.color_brown));
        colorsList.add(new Word(R.raw.color_gray,"gray","ṭopoppi",R.drawable.color_gray));
        colorsList.add(new Word(R.raw.color_black,"black","kululli",R.drawable.color_black));
        colorsList.add(new Word(R.raw.color_white,"white","kelelli",R.drawable.color_white));
        colorsList.add(new Word(R.raw.color_dusty_yellow,"dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        colorsList.add(new Word(R.raw.color_mustard_yellow,"mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));


        WordAdapter wordAdapter = new WordAdapter(this, R.layout.list_item,colorsList,R.color.primary_color);

        ListView listView = (ListView) findViewById(R.id.colers_list);

        listView.setAdapter(wordAdapter);

    }
}
