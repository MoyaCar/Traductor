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
        twoWords.add(new Word_Class("where are you going?", "minto wuksus"));
        twoWords.add(new Word_Class("What is your name", "tinne otaase'ne"));
        twoWords.add(new Word_Class("My name is...", "oyaaset..."));
        twoWords.add(new Word_Class("How are you feeling", "michekses?"));
        twoWords.add(new Word_Class("I'm feeling good.", "kuchi achit"));
        twoWords.add(new Word_Class("Are you coming?", "eenes'aa?"));
        twoWords.add(new Word_Class("Yes, I'm coming.", "hee'eenem"));
        twoWords.add(new Word_Class("I'm coming", "eenem"));
        twoWords.add(new Word_Class("let's go.", "yoowutis"));
        twoWords.add(new Word_Class("Come here.", "enni'nem"));

        WordAdapter phraseAdapter = new WordAdapter(this, twoWords);

        ListView phrasesLV = (ListView) findViewById(R.id.list_phrases);
        phrasesLV.setBackgroundResource(R.color.category_phrases);

        phrasesLV.setAdapter(phraseAdapter);

    }
}
