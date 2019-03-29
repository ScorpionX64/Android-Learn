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
        numbersWords.add(new Word(R.raw.number_one,"one","lutti",R.drawable.number_one));
        numbersWords.add(new Word(R.raw.number_two,"two","otiiko",R.drawable.number_two));
        numbersWords.add(new Word(R.raw.number_three,"three","tolookosu",R.drawable.number_three));
        numbersWords.add(new Word(R.raw.number_four,"four","oyyisa",R.drawable.number_four));
        numbersWords.add(new Word(R.raw.number_five,"five","massokka",R.drawable.number_five));
        numbersWords.add(new Word(R.raw.number_six,"six","temmokka",R.drawable.number_six));
        numbersWords.add(new Word(R.raw.number_seven,"seven","kenekaku",R.drawable.number_seven));
        numbersWords.add(new Word(R.raw.number_eight,"eight","kawinta",R.drawable.number_eight));
        numbersWords.add(new Word(R.raw.number_nine,"nine","wo’e",R.drawable.number_nine));
        numbersWords.add(new Word(R.raw.number_ten,"ten","na’aacha",R.drawable.number_ten));


        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, numbersWords,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.number_list);

        listView.setAdapter(itemsAdapter);
    }
}
