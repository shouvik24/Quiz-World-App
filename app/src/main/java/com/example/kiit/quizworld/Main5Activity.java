package com.example.kiit.quizworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView tv;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        tv=(TextView)findViewById(R.id.tv5);

        Intent i2=getIntent();
        String ans= i2.getStringExtra("score");
        tv.setText("Your Score="+ans+"/10");
        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main5Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(Main5Activity.this,Main6Activity.class);
                startActivity(i2);
            }
        });

    }
}
