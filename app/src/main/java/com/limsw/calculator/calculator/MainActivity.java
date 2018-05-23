package com.limsw.calculator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    TextView na, gop, plus, minus;
    TextView c, backspace;
    TextView equal;
    TextView view, tmp;

    int n1, n2;
    String buho = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (TextView) findViewById(R.id.in_0);
        btn1 = (TextView) findViewById(R.id.in_1);
        btn2 = (TextView) findViewById(R.id.in_2);
        btn3 = (TextView) findViewById(R.id.in_3);
        btn4 = (TextView) findViewById(R.id.in_4);
        btn5 = (TextView) findViewById(R.id.in_5);
        btn6 = (TextView) findViewById(R.id.in_6);
        btn7 = (TextView) findViewById(R.id.in_7);
        btn8 = (TextView) findViewById(R.id.in_8);
        btn9 = (TextView) findViewById(R.id.in_9);

        na = (TextView) findViewById(R.id.na);
        gop = (TextView) findViewById(R.id.gop);
        plus = (TextView) findViewById(R.id.plus);
        minus = (TextView) findViewById(R.id.minus);

        c = (TextView) findViewById(R.id.c);
        backspace = (TextView) findViewById(R.id.backspace);

        equal = (TextView) findViewById(R.id.res);

        view = (TextView) findViewById(R.id.view);
        tmp = (TextView) findViewById(R.id.tmp);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = view.getText().toString();
                view.setText(text + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view_) {
                n1 = Integer.parseInt(view.getText().toString());
                tmp.setText(n1 + "+");
                view.setText("");
                buho = "+";
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view_) {
                n1 = Integer.parseInt(view.getText().toString());
                tmp.setText(n1 + " - ");
                view.setText("");
                buho = "-";
            }
        });

        gop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view_) {
                n1 = Integer.parseInt(view.getText().toString());
                tmp.setText(n1 + " * ");
                view.setText("");
                buho = "*";
            }
        });

        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view_) {
                n1 = Integer.parseInt(view.getText().toString());
                tmp.setText(n1 + " ÷ ");
                view.setText("");
                buho = "÷";
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view_) {
                n2 = Integer.parseInt(view.getText().toString());
                tmp.setText("");
                switch (buho) {
                    case "+":
                        view.setText(String.valueOf(n1 + n2));
                        break;
                    case "-":
                        view.setText(String.valueOf(n1 - n2));
                        break;
                    case "*":
                        view.setText(String.valueOf(n1 * n2));
                        break;
                    case "÷":
                        view.setText(String.valueOf(n1 / n2));
                        break;
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tmp.setText("");
                view.setText("");
            }
        });

    }
}