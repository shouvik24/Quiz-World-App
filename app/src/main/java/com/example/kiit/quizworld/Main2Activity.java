package com.example.kiit.quizworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class    Main2Activity extends AppCompatActivity {
    EditText nameedittext,rolledittext;
    Button btn;
Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameedittext = (EditText)findViewById(R.id.editText1);
        rolledittext = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameedittext.getText().toString();
                String roll = rolledittext.getText().toString();
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("NAME", name);
                i.putExtra("ROLL", roll);
                startActivity(i);
            }
        });
    }
}
