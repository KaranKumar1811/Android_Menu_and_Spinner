package com.example.android_menu_and_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PickerActivity extends AppCompatActivity {

    Spinner spCountries;
    ArrayList<String> countryList;
    String[] countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
        spCountries=findViewById(R.id.spinner);
        countryList=new ArrayList<>();

        //Reading Array From string.xml File

      //  countryList= (ArrayList<String>) Arrays.asList(getResources().getStringArray(R.array.array_country));
        countries=getResources().getStringArray(R.array.array_country);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,countries);
        spCountries.setAdapter(stringArrayAdapter);

        spCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PickerActivity.this,countries[i],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
