package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, int resource, ArrayList<Word> objects, int colorId) {
        super(context, resource, objects);
        mColorId = colorId;
    }

     private int mColorId;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Word currentWord = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView defaultTextView = (TextView)convertView.findViewById(R.id.default_text_view);
        TextView miwokTextView = (TextView)convertView.findViewById(R.id.miwok_text_view);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.image_veiw);
        LinearLayout linearLayout = (LinearLayout)convertView.findViewById(R.id.text_linear_layout);
        if (currentWord.getmImageResId() != 0)
        {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getmImageResId());
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }
        defaultTextView.setText(currentWord.GetDefaultTranslation());
        miwokTextView.setText(currentWord.GetMiwokTranslation());
        int color = ContextCompat.getColor(getContext(),mColorId);
        linearLayout.setBackgroundColor(color);
        LinearLayout root = (LinearLayout)convertView.findViewById(R.id.linear_root);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getContext(),currentWord.getmAudioId());
                mediaPlayer.start();
            }
        });
        return convertView;
    }
}
