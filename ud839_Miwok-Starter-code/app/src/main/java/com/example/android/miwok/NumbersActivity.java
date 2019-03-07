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
        numbersWords.add(new Word("two","otiiko"));
        numbersWords.add(new Word("three","tolookosu"));
        numbersWords.add(new Word("four","oyyisa"));
        numbersWords.add(new Word("five","massokka"));
        numbersWords.add(new Word("six","temmokka"));
        numbersWords.add(new Word("seven","kenekaku"));
        numbersWords.add(new Word("eight","kawinta"));
        numbersWords.add(new Word("nine","wo’e"));
        numbersWords.add(new Word("ten","na’aacha"));


        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, numbersWords);

        ListView listView = (ListView) findViewById(R.id.number_list);

        listView.setAdapter(itemsAdapter);
    }
}
