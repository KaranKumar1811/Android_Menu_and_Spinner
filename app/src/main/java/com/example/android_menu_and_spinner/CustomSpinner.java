package com.example.android_menu_and_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomSpinner extends AppCompatActivity  {




    Spinner spinnerView;
    ArrayList<String> cList;
    String[] countries;
    int flags[] = {R.drawable.ic_india,R.drawable.ic_canada,R.drawable.ic_pak};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);
        spinnerView=findViewById(R.id.spinner2);
        //Reading Array From string.xml File

        //  countryList= (ArrayList<String>) Arrays.asList(getResources().getStringArray(R.array.array_country));
        countries=getResources().getStringArray(R.array.array_country);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),flags,countries);
        spinnerView.setAdapter(customAdapter);
//       ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_custom_spinner,R.id.countrtlst,flags.toString(),countries);
//        spinnerView.setAdapter(stringArrayAdapter);
//
//        spinnerView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(CustomSpinner.this,countries[i],Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });



    }
}
