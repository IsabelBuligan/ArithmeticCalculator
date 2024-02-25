package com.example.arithmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Calculator;
    TextView Result;
    EditText Equation;
    EditText NumberTxt;
    Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator = (TextView) findViewById(R.id.calculator);
        Result = (TextView) findViewById(R.id.theResult);
        Equation = (EditText) findViewById(R.id.theEquation);
        NumberTxt = (EditText) findViewById(R.id.theNmbrtxt);
        Add = (Button) findViewById(R.id.add);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String input1 = Equation.getText().toString();
                //String input2 = NumberTxt.getText();

                double input1 = Double.parseDouble(Equation.getText().toString());
                double input2 = Double.parseDouble(NumberTxt.getText().toString());
                double sum = input1 + input2;

                Result.setText(String.valueOf(sum));
            }
        });
    }
}