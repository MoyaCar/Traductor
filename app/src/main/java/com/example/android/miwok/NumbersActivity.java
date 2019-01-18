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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);




        ArrayList<Word_Class> twoWords = new ArrayList<>();
        twoWords.add(new Word_Class("one", "lutti"));
        twoWords.add(new Word_Class("two", "otiko"));
        twoWords.add(new Word_Class("three", "tolookosu"));
        twoWords.add(new Word_Class("four", "oyyisa"));
        twoWords.add(new Word_Class("five", "massoka"));
        twoWords.add(new Word_Class("six", "temmoka"));
        twoWords.add(new Word_Class("seven", "kenekaku"));
        twoWords.add(new Word_Class("eight", "kawinta"));
        twoWords.add(new Word_Class("nine", "wo'e"));
        twoWords.add(new Word_Class("ten", "na'aacha"));



        WordAdapter wordAdapter = new WordAdapter(this, twoWords);


        listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(wordAdapter);
    }
}
