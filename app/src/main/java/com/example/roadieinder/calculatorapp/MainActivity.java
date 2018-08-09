package com.example.roadieinder.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
final Button b1 =(Button)findViewById(R.id.bplus);
        final Button b2 =(Button)findViewById(R.id.bminus);
        final Button b3 =(Button)findViewById(R.id.bdiv);
        final Button b4 =(Button)findViewById(R.id.bmul);
        final Button b5 =(Button)findViewById(R.id.beq);
        final Button b6 =(Button)findViewById(R.id.bone);
        final Button b7 =(Button)findViewById(R.id.btwo);
        final Button b8 =(Button)findViewById(R.id.bthree);
        final Button b9 =(Button)findViewById(R.id.bfour);
        final Button b10 =(Button)findViewById(R.id.bfive);
        final Button b11 =(Button)findViewById(R.id.bsix);
        final Button b12 =(Button)findViewById(R.id.bseven);
        final Button b13 =(Button)findViewById(R.id.beight);
        final Button b14 =(Button)findViewById(R.id.bnine);
        final Button b15 =(Button)findViewById(R.id.bzero);
        final Button b16 =(Button)findViewById(R.id.br);
        final Button b17 =(Button)findViewById(R.id.bd);
        final TextView t1 =(TextView)findViewById(R.id.textView);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"+");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"-");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"/");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"*");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"=");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"1");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"2");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"3");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"4");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"5");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"6");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"7");
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"8");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"9");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"0");
            }
        });
        b16.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(null);
            }
        }));
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=t1.getText().toString();
                s=s.substring(0,s.length()-1);
                t1.setText(s);
                if(s.length()==0){
                    t1.setText(" ");
                }
            }
        });
    }
}
