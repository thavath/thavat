package com.example.thavath.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // object point to list view;
    ListView lstPeople;
    // data source as array object
    String[] people = {"thavath","naravath","davita","naravaty","hello world","naravath","davita","naravaty","hello world"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get connect with id of list view
        lstPeople = (ListView) findViewById(R.id.list_people);
        // create arrayadapter to set datasource to view list
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,people);
        // set data to show in list
        lstPeople.setAdapter(arrayAdapter);
        // show message alert name of Item
        lstPeople.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, people[i]+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
