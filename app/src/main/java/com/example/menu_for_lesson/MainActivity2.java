package com.example.menu_for_lesson;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.menu_for_lesson.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.second_screen_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.first_screen:
                Intent first_intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(first_intent);
                finish();
                break;
            case R.id.third_screen:
                Intent third_intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(third_intent);
                finish();
                break;
            case R.id.fourth_screen:
                Intent fourth_intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(fourth_intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}