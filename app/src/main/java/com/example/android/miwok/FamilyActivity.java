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

public class FamilyActivity extends AppCompatActivity {
    //Creates current page variable
    int current = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
//Establishes button from XML file
        Button next = findViewById(R.id.next);
//If it is clicked then it moves on to next page (updates current variable and loops around)
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current++;

                updateCurrent();

                if(current == 7){
                    current=1;
                }

            }
        });

    }
    //next page function
    private void updateCurrent(){
        //Establishes the ImageView from XMl file
        ImageView picture = findViewById(R.id.imageView);
        //Establishes the TextView from XMl file
        TextView name = findViewById(R.id.textView);
        //Establishes the TextView from XMl file
        TextView description = findViewById(R.id.textView2);

        //The below loops updates the ImageViews and TextViews based on the "current" variable
        if(current == 2){
            picture.setImageDrawable(getDrawable(R.drawable.alcatraz));
            name.setText("Alcatraz Island");
            description.setText("Alcatraz Island is located in San Francisco Bay, 1.25 miles offshore from San Francisco, California, United States. The small island was developed with facilities for a lighthouse, a military fortification, a military prison, and a federal prison, the latter operated from August 11, 1934 until March 21, 1963\n\n" +
                    "San Francisco, CA 94133\n\n" +
                    "(415) 561-4900\n\n");
        }
        else if(current == 3){
            picture.setImageDrawable(getDrawable(R.drawable.pier));
            name.setText("Pier 39");
            description.setText("Pier 39 is a shopping center and popular tourist attraction built on a pier in San Francisco, California. At Pier 39, there are shops, restaurants, a video arcade, street performances, the Aquarium of the Bay, virtual 3D rides, and views of California sea lions hauled out on docks on Pier 39's marina.\n\n" +
                    "The Embarcadero, San Francisco, CA 94133\n\n" +
                    "(415) 705-5500\n\n");
        }

        else if(current == 4) {
            picture.setImageDrawable(getDrawable(R.drawable.unionsquare));
            name.setText("Union Square");
            description.setText("Union Square is a 2.6-acre public plaza bordered by Geary, Powell, Post and Stockton Streets in downtown San Francisco, California. \"Union Square\" also refers to the central shopping, hotel, and theater district that surrounds the plaza for several blocks.\n\n Address: 333 Post St, San Francisco, CA 94108\n\n Phone number: (415) 486-4800");
        }

        else if(current == 5) {
            picture.setImageDrawable(getDrawable(R.drawable.fishermanswharf));
            name.setText("Fisherman‘s Wharf");
            description.setText("Fisherman’s Wharf, on the northern waterfront, is one of the city's busiest tourist areas. Souvenir shops and stalls selling crab and clam chowder in sourdough bread bowls appear at every turn, as do postcard views of the bay, Golden Gate and Alcatraz. There’s also a colony of sea lions to see and historic ships to tour.");
        }
        else if(current == 6) {
            picture.setImageDrawable(getDrawable(R.drawable.chiatwon));
            name.setText("Chinatown");
            description.setText("This is one of the oldest and most established Chinatowns in the U.S. Beyond iconic Dragon’s Gate, a bustling maze of streets and alleys brims with dim sum joints and other traditional eateries. Also found are herbalists, bakeries, souvenir shops, and dark cocktail lounges and karaoke bars. There are ornate temples, including the landmark Tien How, as well as the Chinese Historical Society of America Museum.\n");
        }
        else if(current == 7) {
            picture.setImageDrawable(getDrawable(R.drawable.homepage));
            name.setText("Golden Gate Bridge");
            description.setText("A marvel of modern engineering, the Golden Gate Bridge is 1.7 miles long and 90 feet wide. Its 4,200-foot main span between the two towers was the longest for a suspension bridge until 1981, while its 746-foot towers made it the tallest bridge of any type until 1993. The Golden Gate Bridge is a suspension bridge spanning the Golden Gate, the one-mile-wide strait connecting San Francisco Bay and the Pacific Ocean\n\n Address: Golden Gate Bridge, San Francisco, CA\n\n Phone number: (415) 921-5858 ");
        }

    }

}

