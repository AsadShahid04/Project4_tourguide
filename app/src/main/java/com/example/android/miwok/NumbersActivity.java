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

public class NumbersActivity extends AppCompatActivity {
    //Creates current page variable
    int current = 0;

    ArrayList locations = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
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
        locations.add("Rich Table");
        locations.add("Lazy Bear");
        locations.add("Mister Jui’s");
        locations.add("Abacá");
        //Establishes the ImageView from XMl file
        ImageView picture = findViewById(R.id.imageView);
        //Establishes the TextView from XMl file
        TextView name = findViewById(R.id.textView);
        //Establishes the TextView from XMl file
        TextView description = findViewById(R.id.textView2);

        //The below loops updates the ImageViews and TextViews based on the "current" variable
        if(current == 0){
            picture.setImageDrawable(getDrawable(R.drawable.richtablesanfrancisco));
            name.setText("Rich Table");
            description.setText("Chef Francis Ang’s hotly anticipated first brick and mortar arrived in early August, bringing contemporary Filipino cuisine to a space on the ground floor of a hotel in Fisherman’s Wharf. It’s perhaps not where you’d expect the face of the Bay Area’s modern Filipino food movement to set up shop, but the plant-filled restaurant is utterly drenched in sunlight and further brightened by sunflower yellow banquettes and woven baskets from the southeast Asian archipelago. On the menu: a selection of sharbale plates including sticky barbecue skewers, a light and refreshing tomato and peach salad, and, of course, a whole pastry case filled with fresh baked delights. And with a cocktail menu by Kevin Diedrich (Pacific Cocktail Haven, Kona’s Street Market) the colorful concoctions demand attention, too. \n\n" +
                    "Address: 2700 Jones St, San Francisco CA 94133\n\n" +
                    "Phone number: (415) 486-0788\n\n");
        }
        else if(current == 1){
            picture.setImageDrawable(getDrawable(R.drawable.lazybeaqr));
            name.setText("Lazy Bear");
            description.setText("Lazy Bear’s cuisine centers around nostalgia and a reverence for the wild, utilizing a wide variety of preservation methods and inventive techniques. Its communal dining format, uniquely social among fine dining restaurants, makes Lazy Bear an essential dining experience. The revered pop-up gets a permanent setting with this midcentury space serving New American cuisine.\n\n" +
                    "Address: 3416 19th St, San Francisco, CA 94110\n\n" +
                    "Phone number: (415) 874-9921\n\n");
        }
        else if(current == 2) {
            picture.setImageDrawable(getDrawable(R.drawable.misterjiuspchang));
            name.setText("Mister Jui’s");
            description.setText("Mister Jiu’s is a Chinese American spot that’s been around since 2016, and even if you only casually pay attention to SF restaurants, you undoubtedly know about this place. We’ve loved it from the moment it opened, but since then Mister Jiu’s has gone from the cool, new spot in Chinatown to being one of the first restaurants we recommend to everyone for pretty much any scenario. Between the incredible food and the dining room that would make Jay Gatsby envious, Mister Jiu’s is one of the best places to eat in SF. It’s the rare spot that’s perfect for almost any occasion: nice enough for an important date or a big birthday where a group orders the entire menu, but casual enough that you could come with those same people just because everyone’s schedule actually lined up for once. Fortunately, it doesn’t take 1.21 gigawatts of electricity to get back to how all of you felt the first came you came here, all you have to do is book a table.\n" +
                    "\n\n Address: 28 Waverly Pl, San Francisco, CA 94108\n\n" +
                    "Phone number: (415) 857-9688\n");
        }
        else if(current == 3) {
            picture.setImageDrawable(getDrawable(R.drawable.abaca));
            name.setText("Abacá");
            description.setText("Chef Francis Ang’s hotly anticipated first brick and mortar arrived in early August, bringing contemporary Filipino cuisine to a space on the ground floor of a hotel in Fisherman’s Wharf. It’s perhaps not where you’d expect the face of the Bay Area’s modern Filipino food movement to set up shop, but the plant-filled restaurant is utterly drenched in sunlight and further brightened by sunflower yellow banquettes and woven baskets from the southeast Asian archipelago. On the menu: a selection of sharbale plates including sticky barbecue skewers, a light and refreshing tomato and peach salad, and, of course, a whole pastry case filled with fresh baked delights. And with a cocktail menu by Kevin Diedrich (Pacific Cocktail Haven, Kona’s Street Market) the colorful concoctions demand attention, too. \n" +
                    "\n\n Address: 2700 Jones St, San Francisco CA 94133\n" +
                    "\n\n Phone number: (415) 486-0788\n");
        }

    }

}

