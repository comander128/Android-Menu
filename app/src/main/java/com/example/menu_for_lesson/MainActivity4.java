package com.example.menu_for_lesson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.fourth_screen_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.first_screen:
                Intent first_intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(first_intent);
                finish();
                break;
            case R.id.second_screen:
                Intent second_intent = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(second_intent);
                finish();
                break;
            case R.id.fourth_screen:
                Intent third_intent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(third_intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}