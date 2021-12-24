package com.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton orange,apple;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // bind the variables with objects
        rg=findViewById(R.id.radioGroup);
        orange=findViewById(R.id.radioButton);
        apple=findViewById(R.id.radioButton2);
        resetButton=findViewById(R.id.button);

        // on-click listener for orange
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Orange Selected", Toast.LENGTH_LONG).show();
            }
        });
        // on-click listener for apple
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Apple Selected",Toast.LENGTH_LONG).show();
            }
        });
        // on-click listener for reset
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rg.clearCheck();
            }
        });
    }
}