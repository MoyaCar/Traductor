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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word_Class> twoWords = new ArrayList<>();
        twoWords.add(new Word_Class("father", "epe"));
        twoWords.add(new Word_Class("mother", "eta"));
        twoWords.add(new Word_Class("son", "angsi"));
        twoWords.add(new Word_Class("daughter", "tune"));
        twoWords.add(new Word_Class("older brother", "taachi"));
        twoWords.add(new Word_Class("younger brother", "chalitti"));
        twoWords.add(new Word_Class("older sister", "tete"));
        twoWords.add(new Word_Class("younger sister", "kolliti"));
        twoWords.add(new Word_Class("grandmother", "ama"));
        twoWords.add(new Word_Class("grandfather", "paapa"));

        WordAdapter familyAdapter = new WordAdapter(this, twoWords);

        ListView familyLV = (ListView) findViewById(R.id.list_family);

        familyLV.setAdapter(familyAdapter);
    }
}
