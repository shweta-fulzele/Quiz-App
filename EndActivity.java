package com.example.mcqapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {
    TextView tv_result;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        tv_result = findViewById(R.id.result);

        int correct = getIntent().getIntExtra("correct", 0);
        int wrong = getIntent().getIntExtra("wrong", 0);

        tv_result.setText("Correct: " + correct + "\nWrong: " + wrong);


        Button buttonOne = findViewById(R.id.button3);
        buttonOne.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Moving to Report");

                Intent activity2Intent = new Intent(getApplicationContext(), Report.class);
                startActivity(activity2Intent);
            }

        });
    }
}
