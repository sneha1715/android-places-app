package com.example.menuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //lets attach a new file
        getMenuInflater().inflate(R.menu.menu_main,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       /* switch (item.getItemId()){
            case R.id.menu_add:
                Toast.makeText(this, "you selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_edit:
                Toast.makeText(this, "you selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_delete:
                Toast.makeText(this, "you selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_setting:
                Toast.makeText(this, "you selected"+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }*/
        if (item.getItemId() == R.id.menu_add) {
            Toast.makeText(this, "you selected" + item.getTitle(), Toast.LENGTH_SHORT).show();


        }
        if (item.getItemId() == R.id.menu_edit) {
            Toast.makeText(this, "you selected" + item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==R.id.menu_delete){
            Toast.makeText(this, "you selected"+item.getTitle(), Toast.LENGTH_SHORT).show();

        }
        if (item.getItemId()==R.id.menu_setting){
            Toast.makeText(this, "you selected"+item.getTitle(), Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
}