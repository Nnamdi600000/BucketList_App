package com.codennamdi.mybucketlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardViewThingsILove = findViewById(R.id.card_view_things_i_love);
        CardView cardViewPlacesILove = findViewById(R.id.card_view_places_i_love);
        CardView cardViewCarsILove = findViewById(R.id.card_view_cars_i_love);

        cardViewThingsILove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Things I Love", Toast.LENGTH_LONG).show();
                Intent thingsILoveActivity = new Intent(MainActivity.this, ThingsILove.class);
                startActivity(thingsILoveActivity);
            }
        });

        cardViewPlacesILove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Places I Love", Toast.LENGTH_LONG).show();
                Intent placesILoveActivity = new Intent(MainActivity.this, PlacesILove.class);
                startActivity(placesILoveActivity);
            }
        });

        cardViewCarsILove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Cars I Love", Toast.LENGTH_LONG).show();
                Intent carsILoveActivity = new Intent(MainActivity.this, CarsILove.class);
                startActivity(carsILoveActivity);
            }
        });
    }
}