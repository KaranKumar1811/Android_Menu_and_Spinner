package com.example.android_menu_and_spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

        Button menu_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_btn=findViewById(R.id.button_menu);

        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMenu(view);
                //registerForContextMenu(menu_btn);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mf=getMenuInflater();
        mf.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_add:
            {

                Toast.makeText(MainActivity.this,"ADD",Toast.LENGTH_LONG).show();

                break;
            }
            case R.id.action_edit:
            {
                Toast.makeText(MainActivity.this,"EDIT",Toast.LENGTH_LONG).show();
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater mf=getMenuInflater();
        mf.inflate(R.menu.menu_main,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
            {

                Toast.makeText(MainActivity.this,"ADD",Toast.LENGTH_LONG).show();

                break;
            }
            case R.id.action_edit:
            {
                Toast.makeText(MainActivity.this,"EDIT",Toast.LENGTH_LONG).show();
                break;
            }

        }
        return super.onContextItemSelected(item);
    }


    public void showMenu(View v){
        PopupMenu popup = new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_main);
        popup.show();

    }


    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.action_add:
            {
                Intent intent=new Intent(MainActivity.this,PickerActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"ADD",Toast.LENGTH_LONG).show();

                break;
            }
            case R.id.action_edit:
            {
                Intent in=new Intent(MainActivity.this,CustomSpinner.class);
                startActivity(in);
                Toast.makeText(MainActivity.this,"EDIT",Toast.LENGTH_LONG).show();
                break;
            }

        }
        return false;
    }
}
