package com.codennamdi.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CarsILove extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_ilove);
        showListItem();
    }

    private void showListItem() {
        RecyclerView recyclerViewCarsILove = findViewById(R.id.recycler_view_car_i_love);

        Projects[] carsILoveArray = {
                new Projects("Ford Mustang", "The Ford Mustang is a series of American automobiles manufactured by Ford. In continuous production since 1964, the Mustang is currently the longest-produced Ford car nameplate. Currently in its sixth generation, it is the fifth-best selling Ford car nameplate. The namesake of the pony car automobile segment, the Mustang was developed as a highly styled line of sporty coupes and convertibles derived from existing model lines, initially distinguished by long hood, short deck proportions.", R.drawable.ford_img2, 5 ),
                new Projects("Toyota Corolla-Model 2022", "The Toyota Corolla is a series of compact cars (formerly subcompact) manufactured and marketed globally by Toyota. Introduced in 1966", R.drawable.corolla_img, 4.5f),
                new Projects("Chevrolet Camaro", "The Chevrolet Camaro is a mid-size American automobile manufactured by Chevrolet, classified as a pony car. It first went on sale on September 29, 1966, model year and was designed as a competing model to the Ford Mustang.", R.drawable.chevrolet_car_img, 5)
        };

        RecyclerViewProjectsAdapter adapter = new RecyclerViewProjectsAdapter(carsILoveArray);
        recyclerViewCarsILove.setAdapter(adapter);
    }
}