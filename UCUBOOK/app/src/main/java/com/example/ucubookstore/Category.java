package com.example.ucubookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {
    private Button Fruits,Grocery,Chocolates,Stationaries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Fruits = (Button) findViewById(R.id.fruits);
        Grocery = (Button) findViewById(R.id.grocery);
        Chocolates = (Button) findViewById(R.id.chocolates);
        Stationaries = (Button) findViewById(R.id.stationaries);

        Fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,CategoryItems.class);
                intent.putExtra("category","1st Year");
                startActivity(intent);
            }
        });

        Grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,CategoryItems.class);
                intent.putExtra("category","2nd Year");
                startActivity(intent);
            }
        });

        Chocolates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,CategoryItems.class);
                intent.putExtra("category","3rd Year");
                startActivity(intent);
            }
        });

        Stationaries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,CategoryItems.class);
                intent.putExtra("category","4th Year");
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Category.this,Nav_Home.class));
        finish();
    }
}