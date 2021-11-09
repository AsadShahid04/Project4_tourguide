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

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    //Creates current page variable
    int current = 0;

    ArrayList locations = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
//Establishes button from XML file
        Button next = findViewById(R.id.next);
//If it is clicked then it moves on to next page (updates current variable and loops around)
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current++;

                updateCurrent();

                if(current == 3){
                    current=-1;
                }

            }
        });

    }
    //next page function
    private void updateCurrent(){
        locations.add("Palace of Fine Arts");
        locations.add("California Academy of Sciences");
        locations.add("Ghirardelli Square");
        locations.add("San Francisco Museum of Modern Art");
        //Establishes the ImageView from XMl file
        ImageView picture = findViewById(R.id.imageView);
        //Establishes the TextView from XMl file
        TextView name = findViewById(R.id.textView);
        //Establishes the TextView from XMl file
        TextView description = findViewById(R.id.textView2);

        //The below loops updates the ImageViews and TextViews based on the "current" variable
        if(current == 0){
            picture.setImageDrawable(getDrawable(R.drawable.palaceoffinearts));
            name.setText("Palace of Fine Arts");
            description.setText("The Palace of Fine Arts that is in the Marina District of San Francisco, California is a monumental structure originally constructed for the 1915 Panama-Pacific Exposition in order to exhibit works of art. Completely rebuilt from 1964 to 1974, it is the only structure from the Exposition that survives on site.\n" +
                    "\n\n Address: 3601 Lyon St, San Francisco, CA 94123\n" +
                    "\n\n Phone number: (415) 376-1704\n");
        }
        else if(current == 1){
            picture.setImageDrawable(getDrawable(R.drawable.caacademyofsciences));
            name.setText("California Academy of Sciences");
            description.setText("The California Academy of Sciences is a research institute and natural history museum in San Francisco, California, that is among the largest museums of natural history in the world, housing over 46 million specimens.\n" +
                    "\n\n Address: 55 Music Concourse Dr, San Francisco, CA 94118\n" +
                    "\n\n Phone number: (415) 379-8000\n");
        }
        else if(current == 2) {
            picture.setImageDrawable(getDrawable(R.drawable.ghiradehlisquare));
            name.setText("Ghirardelli Square");
            description.setText("With shops, wineries and award-winning restaurants, Ghirardelli Square is the premier San Francisco destination. Enjoy spectacular views of the Golden Gate Bridge to Alcatraz, landscaped gardens, one-of-a-kind shopping and, of course, our famous Ghirardelli Chocolate.\n" +
                    "\n\n Address: 900 North Point St Suite F301, San Francisco, CA 94109\n" +
                    "\n\n Phone number: (415) 441-2560\n");
        }
        else if(current == 3) {
            picture.setImageDrawable(getDrawable(R.drawable.moma));
            name.setText("San Francisco Museum of Modern Art");
            description.setText("The San Francisco Museum of Modern Art is a modern and contemporary art museum located in San Francisco, California. A nonprofit organization, SFMOMA holds an internationally recognized collection of modern and contemporary art, and was the first museum on the West Coast devoted solely to 20th-century art.\n" +
                    "\n\n Address: 151 3rd St, San Francisco, CA 94103\n" +
                    "\n\n Phone number: (415) 357-4000\n");
        }

    }

}

