package com.example.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox mango,apple;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // bind the variables
        mango=findViewById(R.id.checkBox);
        apple=findViewById(R.id.checkBox2);
        submit=findViewById(R.id.button);

        // on-click listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mango.isChecked() && apple.isChecked()) {
                    Toast.makeText(MainActivity.this, "Both Selected", Toast.LENGTH_SHORT).show();
                } else if(mango.isChecked()) {
                    Toast.makeText(MainActivity.this,"Only Mango Selected",Toast.LENGTH_LONG).show();
                } else if(apple.isChecked()) {
                    Toast.makeText(MainActivity.this,"Only Apple Selected",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,"None Selected",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}