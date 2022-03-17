package com.codennamdi.mybucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesILove extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_ilove);
        setUpList();
    }

    private void setUpList() {

        RecyclerView recyclerViewPlacesILove = findViewById(R.id.recycler_view_places_i_love_items);

        Projects[] placesILoveArrays = {
                new Projects("London", "London, the capital of England and the United Kingdom, is a 21st-century city with history stretching back to Roman times. At its centre stand the imposing Houses of Parliament, the iconic ‘Big Ben’ clock tower and Westminster Abbey, site of British monarch coronations. Across the Thames River, the London Eye observation wheel provides panoramic views of the South Bank cultural complex, and the entire city.", R.drawable.london_img, 4.5f),
                new Projects("Canada-Toronto", "Toronto, the capital of the province of Ontario, is a major Canadian city along Lake Ontario’s northwestern shore. It's a dynamic metropolis with a core of soaring skyscrapers, all dwarfed by the iconic, free-standing CN Tower. Toronto also has many green spaces, from the orderly oval of Queen’s Park to 400-acre High Park and its trails, sports facilities and zoo.", R.drawable.toronto_img, 5),
                new Projects("NYC-New York City", "New York City comprises 5 boroughs sitting where the Hudson River meets the Atlantic Ocean. At its core is Manhattan, a densely populated borough that’s among the world’s major commercial, financial and cultural centers. Its iconic sites include skyscrapers such as the Empire State Building and sprawling Central Park. Broadway theater is staged in neon-lit Times Square.", R.drawable.nyc_img, 4.9f),
                new Projects("Lekki-Lagos", "Lekki is a city in Lagos State, Nigeria. It is located to the south-east of Lagos city. Lekki is a naturally formed peninsula, adjoining to its west Victoria Island and Ikoyi districts of Lagos, with the Atlantic Ocean to its south, Lagos Lagoon to the north, and Lekki Lagoon to its east; however, the city's southeast, which ends around the western edge of Refuge Island, adjoins the eastern part of Ibeju-Lekki LGA.", R.drawable.lekki_lagos_img, 4.0f),
                new Projects("Silicon Valley", "Silicon Valley, in the southern San Francisco Bay Area of California, is home to many start-up and global technology companies. Apple, Facebook and Google are among the most prominent. It’s also the site of technology-focused institutions centered around Palo Alto's Stanford University. The Computer History Museum and NASA’s Ames Research Center are in Mountain View. The Tech Museum of Innovation is in San Jose.", R.drawable.silicon_valley_img, 5),
                new Projects("Google", "Google LLC is an American multinational technology company that specializes in Internet-related services and products, which include a search engine, online advertising technologies, cloud computing, software, and hardware.", R.drawable.google_img, 5),
                new Projects("Microsoft", "Microsoft Corporation is an American multinational technology corporation which produces computer software, consumer electronics, personal computers, and related services.", R.drawable.microsoft_img, 5)
        };

        RecyclerViewProjectsAdapter adapter2 = new RecyclerViewProjectsAdapter(placesILoveArrays);
        recyclerViewPlacesILove.setAdapter(adapter2);
    }
}