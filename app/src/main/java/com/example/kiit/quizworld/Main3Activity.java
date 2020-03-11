package com.example.kiit.quizworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tv1,tv2;
Intent i;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1 = (TextView) findViewById(R.id.textView13);
        tv2 = (TextView) findViewById(R.id.textView14);
        bt=(Button)findViewById(R.id.button2);
        i=getIntent();
        String n=i.getStringExtra("NAME");
        String r=i.getStringExtra("ROLL");
        tv1.setText("Your Name-"+n);
        tv2.setText("Your Roll Number-"+r);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i2);
            }
        });

    }
}
