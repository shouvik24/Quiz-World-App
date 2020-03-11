package com.example.kiit.quizworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b1=(Button)findViewById(R.id.button7);
        b2=(Button)findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main6Activity.this,Main5Activity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(Main6Activity.this,MainActivity.class);
                startActivity(i2);
            }
        });
    }
}
