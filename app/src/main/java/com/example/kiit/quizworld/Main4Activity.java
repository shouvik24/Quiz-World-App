package com.example.kiit.quizworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    RadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    Spinner sp1,sp2;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    Switch s1,s2,s3,s4,s5,s6,s7,s8;
    Button b,b1;
    int score=0;
RadioGroup rg1,rg2,rg3,rg4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b=(Button)findViewById(R.id.btn);
        b1=(Button)findViewById(R.id.btn1);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
        r3=(RadioButton)findViewById(R.id.r3);
        r4=(RadioButton)findViewById(R.id.r4);
        r5=(RadioButton)findViewById(R.id.r5);
        r6=(RadioButton)findViewById(R.id.r6);
        r7=(RadioButton)findViewById(R.id.r7);
        r8=(RadioButton)findViewById(R.id.r8);
        r9=(RadioButton)findViewById(R.id.r9);
        r10=(RadioButton)findViewById(R.id.r10);
        r11=(RadioButton)findViewById(R.id.r11);
        r12=(RadioButton)findViewById(R.id.r12);
        sp1=(Spinner)findViewById(R.id.spinner1);
        sp2=(Spinner)findViewById(R.id.spinner2);
        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        c4=(CheckBox)findViewById(R.id.c4);
        c5=(CheckBox)findViewById(R.id.c5);
        c6=(CheckBox)findViewById(R.id.c6);
        c7=(CheckBox)findViewById(R.id.c7);
        c8=(CheckBox)findViewById(R.id.c8);
        s1=(Switch)findViewById(R.id.s1);
        s2=(Switch)findViewById(R.id.s2);
        s3=(Switch)findViewById(R.id.s3);
        s4=(Switch)findViewById(R.id.s4);
        s5=(Switch)findViewById(R.id.s5);
        s6=(Switch)findViewById(R.id.s6);
        s7=(Switch)findViewById(R.id.s7);
        s8=(Switch)findViewById(R.id.s8);
        rg1=(RadioGroup)findViewById(R.id.rg1);
        rg2=(RadioGroup)findViewById(R.id.rg2);
        rg3=(RadioGroup)findViewById(R.id.rg3);
        rg4=(RadioGroup)findViewById(R.id.rg4);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.r2)
                {
                    score =score+1;
                }
            }
        });
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.r5)
                {
                    score =score+1;
                }
            }
        });
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.r9)
                {
                    score =score+1;
                }
            }
        });
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.r12)
                {
                    score =score+1;
                }
            }
        });


        s6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton3, boolean f) {
                if(f)
                {
                    score =score+1;
                }
            }
        });
        s3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton2, boolean d) {
                if(d)
                {
                    score =score+1;
                }
            }
        });
        c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton1, boolean c) {
                if(c)
                {
                    score =score+1;
                }
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    score =score+1;
                }
            }
        });

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.values,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);
        sp1.setOnItemSelectedListener(this);
         {
            sp1.setSelection(adapter.getPosition("3th June"));
            score=score+1;
        }
        ArrayAdapter<CharSequence>adapter1=ArrayAdapter.createFromResource(this,R.array.values1,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(adapter1);
        sp2.setOnItemSelectedListener(this);
        {
            sp2.setSelection(adapter1.getPosition("23th January 1897"));

            score=score+1;
            }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Main4Activity.this,Main4Activity.class);
                startActivity(i2);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans=""+score;
                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                i.putExtra("score",ans);
                startActivity(i);
            }
        });
    }
@Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
