package com.example.android.miwok;

import android.app.Activity;

import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    public WordAdapter(Activity context, ArrayList<Word_Class> words) {
        super(context, 0, words);
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.liste_item, parent, false);
        } // Get the {word} object located at this position in the list


        Word_Class currentWord = (Word_Class) getItem(position);

        int music = currentWord.getMp3Sound();

      final MediaPlayer mediaPlayer = (MediaPlayer) MediaPlayer.create(getContext(), music);

        TextView miwokTV = (TextView) listItemView.findViewById(R.id.miwokki_text);

        miwokTV.setText(currentWord.getMiwokWord());

        miwokTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

            }
        });


        TextView englishTV = (TextView) listItemView.findViewById(R.id.english_text);

        englishTV.setText(currentWord.getEnglishWord());

        ImageView iconIv = (ImageView) listItemView.findViewById(R.id.image_view);

        iconIv.setImageResource(currentWord.getImageRes());


        return listItemView;

    }


}


