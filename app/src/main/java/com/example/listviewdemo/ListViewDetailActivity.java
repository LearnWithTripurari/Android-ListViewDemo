package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class ListViewDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_detail);

        TextView textView = findViewById(R.id.text);

        Intent intent = getIntent();

        int[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.LTGRAY};

        int index = intent.getIntExtra("index", -1);
        String[] items = intent.getStringArrayExtra("items");

        textView.setPadding(10, 0, 0,0);
        textView.setTextSize(40);
        textView.setTextColor(colors[index]);
        
        textView.setText(items[index]+" clicked");
    }
}