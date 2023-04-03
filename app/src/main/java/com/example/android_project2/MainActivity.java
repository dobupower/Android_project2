package com.example.android_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button)findViewById(R.id.button1);
        button1.setBackgroundColor(Color.RED);
        button1.setTextColor(Color.WHITE);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nate.com"));
                startActivity(intent);
            }
        });
        button2= (Button)findViewById(R.id.button2);
        button2.setTextColor(Color.WHITE);
        button2.setBackgroundColor(Color.BLUE);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
                startActivity(intent);
            }
        });
        button3= (Button)findViewById(R.id.button3);
        button3.setBackgroundColor(Color.MAGENTA);
        button3.setTextColor(Color.WHITE);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(intent);
            }
        });
        button4= (Button)findViewById(R.id.button4);
        button4.setBackgroundColor(Color.YELLOW);
        button4.setTextColor(Color.WHITE);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}