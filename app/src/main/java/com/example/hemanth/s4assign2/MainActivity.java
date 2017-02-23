package com.example.hemanth.s4assign2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv1 = (ListView) findViewById(R.id.ListView01);
        lv1.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                SearchResults fullObject = (SearchResults)o;
                Toast.makeText(MainActivity.this, "You have chosen: " + " " + fullObject.getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        SearchResults sr1 = new SearchResults();
        sr1.setName("Hemanth");
        //sr1.setCityState("Dallas, TX");
        sr1.setPhone("214-555-1234");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setName("Dilip");
        //sr1.setCityState("Atlanta, GA");
        sr1.setPhone("469-555-2587");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setName("Vishnu");
        //sr1.setCityState("Miami, FL");
        sr1.setPhone("305-555-7895");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setName("Karthik");
        //sr1.setCityState("Las Vegas, NV");
        sr1.setPhone("612-555-8214");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setName("Sridhar");
        //sr1.setCityState("Las Vegas, NV");
        sr1.setPhone("897-555-7654");
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setName("Chaitanya");
        //sr1.setCityState("Las Vegas, NV");
        sr1.setPhone("912-555-7213");
        results.add(sr1);

        return results;
    }
}
