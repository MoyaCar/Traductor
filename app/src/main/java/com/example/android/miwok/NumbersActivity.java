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
        twoWords.add(new Word_Class("one", "lutti",R.drawable.number_one));
        twoWords.add(new Word_Class("two", "otiko",R.drawable.number_two));
        twoWords.add(new Word_Class("three", "tolookosu",R.drawable.number_three));
        twoWords.add(new Word_Class("four", "oyyisa",R.drawable.number_four));
        twoWords.add(new Word_Class("five", "massoka",R.drawable.number_five));
        twoWords.add(new Word_Class("six", "temmoka",R.drawable.number_six));
        twoWords.add(new Word_Class("seven", "kenekaku",R.drawable.number_seven));
        twoWords.add(new Word_Class("eight", "kawinta",R.drawable.number_eight));
        twoWords.add(new Word_Class("nine", "wo'e",R.drawable.number_nine));
        twoWords.add(new Word_Class("ten", "na'aacha",R.drawable.number_ten));



        WordAdapter wordAdapter = new WordAdapter(this, twoWords);


        listView = (ListView) findViewById(R.id.list_numbers);


        listView.setAdapter(wordAdapter);
    }
}
