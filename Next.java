package com.example.mcqapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Next extends AppCompatActivity {
Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Button buttonOne = findViewById(R.id.button3);
        buttonOne.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Moving to Statistics");

                Intent activity2Intent = new Intent(getApplicationContext(), Graph.class);
                startActivity(activity2Intent);
            }

        });
    }
}
