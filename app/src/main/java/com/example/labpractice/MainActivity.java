package com.example.labpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstvalue, secondvalue;
    Button btnadd, btnsubs, btnmultiply, btndivide;
    Double num1, num2;
    TextView tvresult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstvalue=findViewById(R.id.firstvalue);
        secondvalue=findViewById(R.id.secondvalue);
        btnadd=findViewById(R.id.btnadd);
        btnsubs=findViewById(R.id.btnsubs);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivide=findViewById(R.id.btndivide);
        tvresult=findViewById(R.id.tvresult);
        ClickListener();
    }

    public void ClickListener() {
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstvalue.getText().toString());
                num2 = Double.parseDouble(secondvalue.getText().toString());
                Double result=num1+num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btnsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstvalue.getText().toString());
                num2 = Double.parseDouble(secondvalue.getText().toString());
                Double result=num1-num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstvalue.getText().toString());
                num2 = Double.parseDouble(secondvalue.getText().toString());
                Double result=num1*num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstvalue.getText().toString());
                num2 = Double.parseDouble(secondvalue.getText().toString());
                Double result=num1/num2;
                tvresult.setText(String.valueOf(result));
            }
        });
    }
}