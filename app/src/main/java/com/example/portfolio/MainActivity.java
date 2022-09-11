package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openGit(View view) {
        Toast.makeText(MainActivity.this, "Openning Git...", Toast.LENGTH_SHORT).show();
    }

    public void form(View view) {
        //Toast.makeText(MainActivity.this, "Add another profile...", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this,Form.class);
        startActivity(i);
    }
}