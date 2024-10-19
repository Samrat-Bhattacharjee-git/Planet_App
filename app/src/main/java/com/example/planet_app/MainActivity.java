package com.example.planet_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ArrayList<model_planet_class> planetClassArrayList;
    private static custom_planet_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);
        planetClassArrayList=new ArrayList<>();

        model_planet_class planet1=new model_planet_class(R.drawable.mercury,"MERCURY","0 MOON");
        model_planet_class planet2=new model_planet_class(R.drawable.venus,"VENUS","0 MOON");
        model_planet_class planet3=new model_planet_class(R.drawable.earth,"EARTH","1 MOON");
        model_planet_class planet4=new model_planet_class(R.drawable.mars,"MARS","2 MOON");
        model_planet_class planet5=new model_planet_class(R.drawable.jupiter,"JUPITER","79 MOON");
        model_planet_class planet6=new model_planet_class(R.drawable.saturn,"SATURN","83 MOON");
        model_planet_class planet7=new model_planet_class(R.drawable.uranus,"URANUS","27 MOON");
        model_planet_class planet8=new model_planet_class(R.drawable.neptune,"NEPTUNE","14 MOON");
        model_planet_class planet9=new model_planet_class(R.drawable.pluto,"PLUTO","0 MOON");

        planetClassArrayList.add(planet1);
        planetClassArrayList.add(planet2);
        planetClassArrayList.add(planet3);
        planetClassArrayList.add(planet4);
        planetClassArrayList.add(planet5);
        planetClassArrayList.add(planet6);
        planetClassArrayList.add(planet7);
        planetClassArrayList.add(planet8);
        planetClassArrayList.add(planet9);

        adapter=new custom_planet_adapter(getApplicationContext(),planetClassArrayList);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "Planet Name : "+adapter.getItem(i).getPlanet()+"\nNumber Of Moons : "+adapter.getItem(i).getMoons(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}