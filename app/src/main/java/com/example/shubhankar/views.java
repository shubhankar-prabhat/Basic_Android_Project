package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class views extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views);


        String country[]={"INDIA", "RUSSIA" ,"CANADA","USA","CHINA","NEPAL","JAPAN","UAE","UK",""} ;

        ListView SimpleList = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, country);
        SimpleList.setAdapter(arrayAdapter);

    }

}