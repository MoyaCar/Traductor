/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_phrases);


        ArrayList<Word_Class> twoWords = new ArrayList<>();
        twoWords.add(new Word_Class("where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        twoWords.add(new Word_Class("What is your name", "tinne otaase'ne", R.raw.phrase_what_is_your_name));
        twoWords.add(new Word_Class("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        twoWords.add(new Word_Class("How are you feeling", "michekses?", R.raw.phrase_how_are_you_feeling));
        twoWords.add(new Word_Class("I'm feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        twoWords.add(new Word_Class("Are you coming?", "eenes'aa?", R.raw.phrase_are_you_coming));
        twoWords.add(new Word_Class("Yes, I'm coming.", "hee'eenem", R.raw.phrase_yes_im_coming));
        twoWords.add(new Word_Class("I'm coming", "eenem", R.raw.phrase_im_coming));
        twoWords.add(new Word_Class("let's go.", "yoowutis", R.raw.phrase_lets_go));
        twoWords.add(new Word_Class("Come here.", "enni'nem", R.raw.phrase_come_here));

        WordAdapter phraseAdapter = new WordAdapter(this, twoWords);

        ListView phrasesLV = (ListView) findViewById(R.id.list_phrases);
        phrasesLV.setBackgroundResource(R.color.category_phrases);

        phrasesLV.setAdapter(phraseAdapter);

    }
}
