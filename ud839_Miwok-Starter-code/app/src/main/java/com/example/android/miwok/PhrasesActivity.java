package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> wordArrayList = new ArrayList<Word>();

        wordArrayList.add(new Word(R.raw.phrase_where_are_you_going,"Where are you going?","minto wuksus"));
        wordArrayList.add(new Word(R.raw.phrase_what_is_your_name,"What is your name?","tinnә oyaase'nә"));
        wordArrayList.add(new Word(R.raw.phrase_my_name_is,"My name is...","oyaaset..."));
        wordArrayList.add(new Word(R.raw.phrase_how_are_you_feeling,"How are you feeling?","michәksәs?"));
        wordArrayList.add(new Word(R.raw.phrase_im_feeling_good,"I’m feeling good.","kuchi achit"));
        wordArrayList.add(new Word(R.raw.phrase_are_you_coming,"Are you coming?","әәnәs'aa?"));
        wordArrayList.add(new Word(R.raw.phrase_yes_im_coming,"Yes, I’m coming.","hәә’ әәnәm"));
        wordArrayList.add(new Word(R.raw.phrase_im_coming,"I’m coming.","әәnәm"));
        wordArrayList.add(new Word(R.raw.phrase_lets_go,"Let’s go.","yoowutis"));
        wordArrayList.add(new Word(R.raw.phrase_come_here,"Come here.","әnni'nem"));

        WordAdapter wordAdapter = new WordAdapter(this, R.layout.list_item, wordArrayList,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.phrases_list);
        listView.setAdapter(wordAdapter);
    }
}
