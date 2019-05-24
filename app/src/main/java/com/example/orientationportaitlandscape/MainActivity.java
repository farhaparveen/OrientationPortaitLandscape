package com.example.orientationportaitlandscape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2;
    Button b1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTxt1);
        e2=findViewById(R.id.editTxt2);
        b1=findViewById(R.id.btn1);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
       b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextString1=e1.getText().toString();
                String editTextString2=e2.getText().toString();
                t1.setText(editTextString1);
                t2.setText(editTextString2);
            }
        });


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String editTxtSave1=e1.getText().toString();
       String editTxtSave2=e2.getText().toString();
       outState.putString("saved_state1",editTxtSave1);
        outState.putString("saved_state2",editTxtSave2);


    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String s1=(String)savedInstanceState.get("saved_state1");
        String s2=(String)savedInstanceState.get("saved_state2");

           t1.setText(s1);
           t2.setText(s2);
        }
    }



