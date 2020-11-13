package com.example.planetdescription;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewPlanets;
    private ArrayList<Planet> planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewPlanets = findViewById(R.id.listViewPlanets);
        planets = new ArrayList<>();
        planets.add(new Planet(getString(R.string.mercury), getString(R.string.mercury_info), R.drawable.mercury));

        listViewPlanets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), PlanetInfoActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }
}