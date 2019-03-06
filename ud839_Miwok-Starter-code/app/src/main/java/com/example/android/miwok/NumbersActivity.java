package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbersWords = new ArrayList<Word>();
        numbersWords.add(new Word("one","lutti"));
        numbersWords.add(new Word("two","lutti"));
        numbersWords.add(new Word("three","lutti"));
        numbersWords.add(new Word("four","lutti"));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, numbersWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
