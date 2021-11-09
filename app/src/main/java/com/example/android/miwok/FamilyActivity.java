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

public class FamilyActivity extends AppCompatActivity {
    //Creates current page variable
    int current = 0;

    ArrayList locations = new ArrayList<String>();

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

                if(current == 3){
                    current=-1;
                }

            }
        });

    }
    //next page function
    private void updateCurrent(){
        locations.add("Alcatraz Island");
        locations.add("Pier 39");
        locations.add("Union Square");
        locations.add("Fisherman‘s Wharf");

        //Establishes the ImageView from XMl file
        ImageView picture = findViewById(R.id.imageView);
        //Establishes the TextView from XMl file
        TextView name = findViewById(R.id.textView);
        //Establishes the TextView from XMl file
        TextView description = findViewById(R.id.textView2);

        //The below loops updates the ImageViews and TextViews based on the "current" variable
        if(current == 0){
            picture.setImageDrawable(getDrawable(R.drawable.alcatraz));
            name.setText(locations.get(current).toString());
            description.setText("Alcatraz Island is located in San Francisco Bay, 1.25 miles offshore from San Francisco, California, United States. The small island was developed with facilities for a lighthouse, a military fortification, a military prison, and a federal prison, the latter operated from August 11, 1934 until March 21, 1963\n\n" +
                    "San Francisco, CA 94133\n\n" +
                    "(415) 561-4900\n\n");
        }
        else if(current == 1){
            picture.setImageDrawable(getDrawable(R.drawable.pier));
            name.setText(locations.get(current).toString());
            description.setText("Pier 39 is a shopping center and popular tourist attraction built on a pier in San Francisco, California. At Pier 39, there are shops, restaurants, a video arcade, street performances, the Aquarium of the Bay, virtual 3D rides, and views of California sea lions hauled out on docks on Pier 39's marina.\n\n" +
                    "The Embarcadero, San Francisco, CA 94133\n\n" +
                    "(415) 705-5500\n\n");
        }

        else if(current == 2) {
            picture.setImageDrawable(getDrawable(R.drawable.unionsquare));
            name.setText(locations.get(current).toString());
            description.setText("Union Square is a 2.6-acre public plaza bordered by Geary, Powell, Post and Stockton Streets in downtown San Francisco, California. \"Union Square\" also refers to the central shopping, hotel, and theater district that surrounds the plaza for several blocks.\n\n Address: 333 Post St, San Francisco, CA 94108\n\n Phone number: (415) 486-4800");
        }

        else if(current == 3) {
            picture.setImageDrawable(getDrawable(R.drawable.fishermanswharf));
            name.setText(locations.get(current).toString());
            description.setText("Fisherman’s Wharf, on the northern waterfront, is one of the city's busiest tourist areas. Souvenir shops and stalls selling crab and clam chowder in sourdough bread bowls appear at every turn, as do postcard views of the bay, Golden Gate and Alcatraz. There’s also a colony of sea lions to see and historic ships to tour.");
        }

    }

}

