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
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<Word_Class> twoWords = new ArrayList<>();
        twoWords.add(new Word_Class("red", "wetetti"));
        twoWords.add(new Word_Class("green", "chokokki"));
        twoWords.add(new Word_Class("brown", "takaakki"));
        twoWords.add(new Word_Class("gray", "topoppi"));
        twoWords.add(new Word_Class("black", "kululli"));
        twoWords.add(new Word_Class("white", "kelelli"));
        twoWords.add(new Word_Class("dusty yellow", "topoose"));
        twoWords.add(new Word_Class("mustard Yellow", "chiwiite"));

        WordAdapter colorsAdapter = new WordAdapter (this, twoWords);

        ListView colorLV= (ListView) findViewById(R.id.list_color);

        colorLV.setAdapter(colorsAdapter);

    }
}
