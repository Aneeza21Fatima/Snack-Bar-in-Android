package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button snakbar ;
    ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        snakbar = findViewById(R.id.mybtn);
        parent = findViewById(R.id.parent);

        snakbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnakbar();
            }
        });
    }

    public void showSnakbar(){
        Snackbar.make(parent,"This is a  Snack bar", Snackbar.LENGTH_LONG)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Retry selected", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}