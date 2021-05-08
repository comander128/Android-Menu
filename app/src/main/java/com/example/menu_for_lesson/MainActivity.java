package com.example.menu_for_lesson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.menu_for_lesson.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, 0, 0, "second_screen");
        menu.add(0, 1, 1, "third_screen");
        menu.add(0, 2, 2, "fourth_screen");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == 0) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            finish();
        }
        if (item.getItemId() == 1) {
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent);
            finish();
        }
        if (item.getItemId() == 2) {
            Intent intent = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}