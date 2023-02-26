package com.ucscieee.madhack.agon.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ucscieee.madhack.agon.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProfile = findViewById(R.id.button4);
        Button btnAbout = findViewById(R.id.button5);
        Button btnTaskList = findViewById(R.id.button6);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToProfileScreen();
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAboutScreen();
            }
        });

        btnTaskList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTaskListScreen();
            }
        });
    }

    private void goToProfileScreen() {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    private void goToAboutScreen() {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    private void goToTaskListScreen() {
        Intent intent = new Intent(MainActivity.this, TaskListActivity.class);
        startActivity(intent);
    }


}