package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, int resource, ArrayList<Word> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView defaultTextView = (TextView)convertView.findViewById(R.id.default_text_view);
        TextView miwokTextView = (TextView)convertView.findViewById(R.id.miwok_text_view);
        defaultTextView.setText(currentWord.GetDefaultTranslation());
        miwokTextView.setText(currentWord.GetMiwokTranslation());
        return convertView;
    }
}
