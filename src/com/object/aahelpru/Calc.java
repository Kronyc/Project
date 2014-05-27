package com.object.aahelpru;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class Calc extends Activity implements OnClickListener{

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
    TextView tvResult;  // Поле для результата
    String line = "";        // Строка с математическим выражением
    int col = 0;        // Переменная для количества операций (Не более 10! Ноль не считается)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);


        // находим элементы
        tvResult = (TextView) findViewById(R.id.tvResult);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        cancel = (Button) findViewById(R.id.cancel);
        equal = (Button) findViewById(R.id.equal);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);

        // прописываем обработчик
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        cancel.setOnClickListener(this);
        equal.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (col != 10){
            switch (v.getId()) {
                case R.id.one:
                    line = line + "1";
                    break;
                case R.id.two:
                    line = line + "2";
                    break;
                case R.id.three:
                    line = line + "3";
                    break;
                case R.id.four:
                    line = line + "4";
                    break;
                case R.id.five:
                    line = line + "5";
                    break;
                case R.id.six:
                    line = line + "6";
                    break;
                case R.id.seven:
                    line = line + "7";
                    break;
                case R.id.eight:
                    line = line + "8";
                    break;
                case R.id.nine:
                    line = line + "9";
                    break;
                case R.id.zero:
                    line = line + "0";
                    break;
                case R.id.add:
                    line = line + "+";
                    col = col + 1;
                    break;
                case R.id.sub:
                    line = line + "-";
                    col = col + 1;
                    break;
                case R.id.mul:
                    line = line + "*";
                    col = col + 1;
                    break;
                case R.id.div:
                    line = line + "/";
                    col = col + 1;
                    break;
                case R.id.equal:
                    col = 0;
                    // вычисляем результат
                    tvResult.setText(line + "= результат");
                   // line = "*результат";
                    break;
                default:
                    break;
            }
            tvResult.setText(line);
        }
        else {
            tvResult.setText(line + "= Максимум 10 операций");
        }
    }
 }




