package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView message;
    Button submitButton;
    Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connect both front-end and back-end var
        message=findViewById(R.id.message);
        submitButton=findViewById(R.id.submitButton);
        resetButton=findViewById(R.id.resetButton);

        // submit-button click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message.setText("Hello Maddy!");
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message.setText("");
            }
        });
    }
}