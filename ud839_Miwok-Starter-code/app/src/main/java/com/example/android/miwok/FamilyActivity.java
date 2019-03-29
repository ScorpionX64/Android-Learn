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

        wordArrayList.add(new Word(R.raw.family_father,"father","әpә",R.drawable.family_father));
        wordArrayList.add(new Word(R.raw.family_mother,"mother","әṭa",R.drawable.family_mother));
        wordArrayList.add(new Word(R.raw.family_son,"son","angsi",R.drawable.family_son));
        wordArrayList.add(new Word(R.raw.family_daughter,"daughter","tune",R.drawable.family_daughter));
        wordArrayList.add(new Word(R.raw.family_older_brother,"older brother","taachi",R.drawable.family_older_brother));
        wordArrayList.add(new Word(R.raw.family_younger_brother,"younger brother","chalitti",R.drawable.family_younger_brother));
        wordArrayList.add(new Word(R.raw.family_older_sister,"older sister","teṭe",R.drawable.family_older_sister));
        wordArrayList.add(new Word(R.raw.family_younger_sister,"younger sister","kolliti",R.drawable.family_younger_sister));
        wordArrayList.add(new Word(R.raw.family_grandmother,"grandmother","ama",R.drawable.family_grandmother));
        wordArrayList.add(new Word(R.raw.family_grandfather,"grandfather","paapa",R.drawable.family_grandfather));

        WordAdapter wordAdapter = new WordAdapter(this,R.layout.list_item,wordArrayList,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.family_list);
        listView.setAdapter(wordAdapter);
    }
}
