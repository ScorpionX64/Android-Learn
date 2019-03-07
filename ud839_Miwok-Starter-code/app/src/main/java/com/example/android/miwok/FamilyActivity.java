package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_family);

        ArrayList<Word> wordArrayList = new ArrayList<Word>();

        wordArrayList.add(new Word("father","әpә"));
        wordArrayList.add(new Word("mother","әṭa"));
        wordArrayList.add(new Word("son","angsi"));
        wordArrayList.add(new Word("daughter","tune"));
        wordArrayList.add(new Word("older brother","taachi"));
        wordArrayList.add(new Word("younger brother","chalitti"));
        wordArrayList.add(new Word("older sister","teṭe"));
        wordArrayList.add(new Word("younger sister","kolliti"));
        wordArrayList.add(new Word("grandmother","ama"));
        wordArrayList.add(new Word("grandfather","paapa"));

        WordAdapter wordAdapter = new WordAdapter(this,R.layout.list_item,wordArrayList);
        ListView listView = (ListView) findViewById(R.id.family_list);
        listView.setAdapter(wordAdapter);
    }
}
