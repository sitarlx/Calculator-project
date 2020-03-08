package com.introtoandroid.calculator_sitar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button c;
    Button ce;
    Button posNeg;
    Button div;
    Button times;
    Button add;
    Button subtract;
    Button equal;
    Button decimal;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    TextView textView;
    String s1;
    String s2;
    String operation;
    boolean intToFloat = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.output);
        c = findViewById(R.id.c);
        ce = findViewById(R.id.ce);
        posNeg = findViewById(R.id.pORm);
        div = findViewById(R.id.divide);
        times = findViewById(R.id.multiply);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        equal = findViewById(R.id.equals);
        decimal = findViewById(R.id.decimal);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                intToFloat = false;
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = textView.getText().toString();
                temp = temp.substring(0, temp.length() - 1);
                textView.setText(temp);
            }
        });

        posNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = (textView.getText().toString());
                if (temp.charAt(0) == ('-')){
                    temp = temp.substring(1, temp.length());
                }
                else {
                    temp = "-" + temp;
                }
                textView.setText(temp);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = textView.getText().toString();
                operation = "/";
                intToFloat = true;
                textView.setText("");
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = textView.getText().toString();
                operation = "x";
                textView.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = textView.getText().toString();
                operation = "+";
                textView.setText("");
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = textView.getText().toString();
                operation = "-";
                textView.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s2 = textView.getText().toString();

                if (operation.equals("+")) {
                    if (intToFloat == true) {
                        float newS1 = Float.parseFloat(s1);
                        float newS2 = Float.parseFloat(s2);
                        float total = newS1 + newS2;
                        textView.setText(Float.toString(total));
                        s1 = Float.toString(total);
                    }
                    else {
                        int newS1 = Integer.parseInt(s1);
                        int newS2 = Integer.parseInt(s2);
                        int total = newS1 + newS2;
                        textView.setText(Integer.toString(total));
                        s1 = Integer.toString(total);
                    }

                }
                else if (operation.equals("-")) {
                    if (intToFloat == true) {
                        float newS1 = Float.parseFloat(s1);
                        float newS2 = Float.parseFloat(s2);
                        float total = newS1 - newS2;
                        textView.setText(Float.toString(total));
                        s1 = Float.toString(total);
                    }
                    else {
                        int newS1 = Integer.parseInt(s1);
                        int newS2 = Integer.parseInt(s2);
                        int total = newS1 - newS2;
                        textView.setText(Integer.toString(total));
                        s1 = Integer.toString(total);
                    }

                }
                else if (operation.equals("/")) {
                    if (intToFloat == true) {
                        float newS1 = Float.parseFloat(s1);
                        float newS2 = Float.parseFloat(s2);
                        float total = newS1 / newS2;
                        textView.setText(Float.toString(total));
                        s1 = Float.toString(total);
                    }
                    else {
                        int newS1 = Integer.parseInt(s1);
                        int newS2 = Integer.parseInt(s2);
                        int total = newS1 / newS2;
                        textView.setText(Integer.toString(total));
                        s1 = Integer.toString(total);
                    }
                }
                else if (operation.equals("x")) {
                    if (intToFloat == true) {
                        float newS1 = Float.parseFloat(s1);
                        float newS2 = Float.parseFloat(s2);
                        float total = newS1 * newS2;
                        textView.setText(Float.toString(total));
                        s1 = Float.toString(total);
                    }
                    else {
                        int newS1 = Integer.parseInt(s1);
                        int newS2 = Integer.parseInt(s2);
                        int total = newS1 * newS2;
                        textView.setText(Integer.toString(total));
                        s1 = Integer.toString(total);
                    }
                }
                else{
                    textView.setText(s1);
                }
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = textView.getText().toString();
                temp = temp + ".";
                textView.setText(temp);
                intToFloat = true;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText() + "0");
            }
        });
    }
}
