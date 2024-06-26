package com.example.elegantbuttons;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 1 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 2 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 3 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 4 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 5 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 6 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 7 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 8 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 9 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 10 clicked!", Toast.LENGTH_SHORT).show();
        });
    }
}
