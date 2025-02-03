package com.example.task_2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView = findViewById(R.id.textView);
        CircleView circleView = findViewById(R.id.circleView);

        String item = getIntent().getStringExtra("ITEM");
        textView.setText(item);
        circleView.setNumber(item); // Set the number in the circle view
    }
}
