package com.example.planetdescription;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlanetInfoActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textViewName, textViewInfo;
    private int imageID;
    private ArrayList<Planet> planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_info);
        addPlanets();
        textViewName = findViewById(R.id.textViewName);
        textViewInfo = findViewById(R.id.textViewInfo);
        imageView = findViewById(R.id.imageViewPlanetInfo);
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        Planet planet = planets.get(position);

        textViewName.setText(planet.getName());
        textViewInfo.setText(planet.getInfo());
        imageView.setImageResource(planet.getImageID());
    }

    private void addPlanets(){
        planets = new ArrayList<>();
        planets.add(new Planet(getString(R.string.mercury), getString(R.string.mercury_info), R.drawable.mercury));
        planets.add(new Planet(getString(R.string.venus), getString(R.string.venus_info), R.drawable.venus));
        planets.add(new Planet(getString(R.string.earth), getString(R.string.earth_info), R.drawable.earth));
        planets.add(new Planet(getString(R.string.mars), getString(R.string.mars_info), R.drawable.mars));
        planets.add(new Planet(getString(R.string.jupiter), getString(R.string.jupiter_info), R.drawable.jupiter));
        planets.add(new Planet(getString(R.string.saturn), getString(R.string.saturn_info), R.drawable.saturn));
        planets.add(new Planet(getString(R.string.uranus), getString(R.string.uranus_info), R.drawable.uranus));
        planets.add(new Planet(getString(R.string.neptune), getString(R.string.neptune_info), R.drawable.neptune));
        planets.add(new Planet(getString(R.string.pluto), getString(R.string.pluto_info), R.drawable.pluto));
    }
}