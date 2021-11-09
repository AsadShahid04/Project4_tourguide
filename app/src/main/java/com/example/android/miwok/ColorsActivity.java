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

public class ColorsActivity extends AppCompatActivity {
    //Creates current page variable
    int current = 0;


    ArrayList locations = new ArrayList<String>();
    //ArrayList<String> locations = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

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
        locations.add("Harbor Court Hotel");
        locations.add("Grant Plaza Hotel");
        locations.add("Hotel Riu Plaza Fisherman's Wharf");
        locations.add("Hotel Emblem");

        //Establishes the ImageView from XMl file
        ImageView picture = findViewById(R.id.imageView);
        //Establishes the TextView from XMl file
        TextView name = findViewById(R.id.textView);
        //Establishes the TextView from XMl file
        TextView description = findViewById(R.id.textView2);

        //The below loops updates the ImageViews and TextViews based on the "current" variable
        if(current == 0){
            picture.setImageDrawable(getDrawable(R.drawable.harborcourthotel));
            name.setText(locations.get(current).toString());
            description.setText("Price: $159/night\n\nSet along the waterfront, this stylish hotel is a 6-minute walk from the Ferry Building Marketplace and the BART Embarcadero rail station. Plush, colorful rooms feature Bay Bridge, city or courtyard views and have free Wi-Fi, iHome docks, minibars and flat-screen TVs. Rooms also have yoga mats, designer toiletries, Italian linens and goose-down duvets. An evening wine hour and morning coffee and tea are free for guests. Other amenities include a sleek, on-site Japanese restaurant and sake lounge, plus valet parking, loaner bikes and access to an adjacent YMCA (both for a fee). \n\n Address: 165 Steuart St, San Francisco, CA 94105 \n\n Phone number: (415) 882-1300\n");
        }
        else if(current == 1){
            picture.setImageDrawable(getDrawable(R.drawable.grantplaza));
            name.setText(locations.get(current).toString());
            description.setText("Price: $89/night \n\n Dating from the 1920s, this low-key hotel just inside the gateway to Chinatown is a 2-minute walk from a California Street cable-car stop, and a 6-minute walk from the shops, eateries and cultural attractions in lively Union Square. The understated rooms feature black-and-white photographs, plus desks and flat-screen TVs. Rooms also offer free Wi-Fi and private bathrooms; some have plantation shutters and/or bay windows. Amenities include a lobby with chandeliers, mirrored walls and furnishings that evoke the property's 1920s origins. There's also a sitting area under an antique stained-glass window. Guest-use computers are available.\n\n Address: 465 Grant Ave, San Francisco, CA 94108\n");
        }
        else if(current == 2) {
            picture.setImageDrawable(getDrawable(R.drawable.hotelriuplaza));
            name.setText(locations.get(current).toString());
            description.setText("Price: $107/night \n\n Set in the Fisherman’s Wharf district, this unfussy hotel on a tree-lined street is a 2-minute walk from a tram stop, 6 minutes' walk from dining and entertainment at Pier 39, and 12 minutes on foot from the hairpin turns of Lombard Street. The laid-back rooms provide Wi-Fi and satellite TV, as well as minifridges and coffee makers. Upgraded rooms add sitting areas with sofas. Suites feature separate living rooms with city views. Amenities include an informal restaurant/bar, plus a gym, a heated outdoor pool, and a sundeck with loungers. Parking, event space and a breakfast buffet are available.\n" +
                    "\n\nAddress: 2500 Mason St, San Francisco, CA 94133\n" +
                    "\n\nPhone number: (415) 362-5500\n");
        }
        else if(current == 3) {
            picture.setImageDrawable(getDrawable(R.drawable.hotelemblemsf));
            name.setText(locations.get(current).toString());
            description.setText("Price: $176/night\n\nCheck in and leave the status quo behind. Hotel Emblem San Francisco, a Viceroy Urban Retreat in downtown San Francisco, where Nob Hill meets Union Square and the Theater District, is a haven for those that think as boldly as they live. Inspiring conversation in all the right ways, with plenty of modern provocations, Hotel Emblem will feature a cocktail-focused restaurant and 96 vibrant guestrooms. Every corner is designed to spark creativity, from the bar inspired by the Beat Generation, to the book-filled Writer’s Alcove in the lobby, to the eclectic guestrooms, where patterns play and an expressive vibe thrives. This hotel is a muse – and you will be, too. Lend your voice at the weekly poetry slam. Get lost in the flow of nightly live jazz. Tap out a few thoughts on the lobby typewriter.\n\n Address: 562 Sutter Street, San Francisco CA\n\n Phone number: (415) 433-4434 ");
        }

    }

    //EditText simpleEditText = (EditText) findViewById(R.id.simpleEditText);

    //String editTextValue = simpleEditText.getText().toString();

}

