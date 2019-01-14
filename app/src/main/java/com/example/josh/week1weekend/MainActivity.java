package com.example.josh.week1weekend;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String formula = "", answer ="", eq = "";
    TextView tvDisplay;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orientation = this.getResources().getConfiguration().orientation;
        //Standard Buttons
        Button zero = (Button)findViewById(R.id.button0);
        zero.setOnClickListener(this);
        Button one = (Button)findViewById(R.id.button1);
        one.setOnClickListener(this);
        Button two = (Button)findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three = (Button)findViewById(R.id.button3);
        three.setOnClickListener(this);
        Button four = (Button)findViewById(R.id.button4);
        four.setOnClickListener(this);
        Button five = (Button)findViewById(R.id.button5);
        five.setOnClickListener(this);
        Button six = (Button)findViewById(R.id.button6);
        six.setOnClickListener(this);
        Button seven = (Button)findViewById(R.id.button7);
        seven.setOnClickListener(this);
        Button eight = (Button)findViewById(R.id.button8);
        eight.setOnClickListener(this);
        Button nine = (Button)findViewById(R.id.button9);
        nine.setOnClickListener(this);
        Button clear = (Button)findViewById(R.id.buttonC);
        clear.setOnClickListener(this);
        Button dot = (Button)findViewById(R.id.buttonDot);
        dot.setOnClickListener(this);

        //Operations
        Button plus = (Button)findViewById(R.id.buttonAdd);
        plus.setOnClickListener(this);
        Button minus = (Button)findViewById(R.id.buttonSubtract);
        minus.setOnClickListener(this);
        Button multi = (Button)findViewById(R.id.buttonMulti);
        multi.setOnClickListener(this);
        Button divide = (Button)findViewById(R.id.buttonDivide);
        divide.setOnClickListener(this);
        Button open = (Button)findViewById(R.id.buttonOpen);
        open.setOnClickListener(this);
        Button close = (Button)findViewById(R.id.buttonClose);
        close.setOnClickListener(this);

        //Scientific Buttons
        if(Configuration.ORIENTATION_LANDSCAPE==orientation){
            Button sin = (Button)findViewById(R.id.buttonSin);
            sin.setOnClickListener(this);
            Button cos = (Button)findViewById(R.id.buttonCos);
            cos.setOnClickListener(this);
            Button tan = (Button)findViewById(R.id.buttonTan);
            tan.setOnClickListener(this);
            Button sqrt = (Button)findViewById(R.id.buttonSqrt);
            sqrt.setOnClickListener(this);
            Button cbrt = (Button)findViewById(R.id.buttonCub);
            cbrt.setOnClickListener(this);
            Button abs = (Button)findViewById(R.id.buttonAbs);
            abs.setOnClickListener(this);
            Button e = (Button)findViewById(R.id.buttonE);
            e.setOnClickListener(this);
            Button pi = (Button)findViewById(R.id.buttonPi);
            pi.setOnClickListener(this);
            Button pow = (Button)findViewById(R.id.buttonPow);
            pow.setOnClickListener(this);
            Button log = (Button)findViewById(R.id.buttonLog);
            log.setOnClickListener(this);
        }

        //Le Enter
        Button enter = (Button)findViewById(R.id.buttonEnter);
        enter.setOnClickListener(this);
        tvDisplay = (TextView)findViewById(R.id.tvDisplay);
        result = (TextView)findViewById(R.id.result);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            //Basic Buttons
            case R.id.button0:
                formula = formula + "0";
                tvDisplay.setText(formula);
                break;
            case R.id.button1:
                formula = formula + "1";
                tvDisplay.setText(formula);
                break;
            case R.id.button2:
                formula = formula + "2";
                tvDisplay.setText(formula);
                break;
            case R.id.button3:
                formula = formula + "3";
                tvDisplay.setText(formula);
                break;
            case R.id.button4:
                formula = formula + "4";
                tvDisplay.setText(formula);
                break;
            case R.id.button5:
                formula = formula + "5";
                tvDisplay.setText(formula);
                break;
            case R.id.button6:
                formula = formula + "6";
                tvDisplay.setText(formula);
                break;
            case R.id.button7:
                formula = formula + "7";
                tvDisplay.setText(formula);
                break;
            case R.id.button8:
                formula = formula + "8";
                tvDisplay.setText(formula);
                break;
            case R.id.button9:
                formula = formula + "9";
                tvDisplay.setText(formula);
                break;

            //Operators
            case R.id.buttonAdd:
                formula = formula + "+";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonSubtract:
                formula = formula + "-";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonMulti:
                formula = formula + "*";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonDivide:
                formula = formula + "/";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonC:
                formula = "";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonDot:
                formula = formula + ".";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonEnter:
                if(!formula.equals("")) {
                    Expression calc = new ExpressionBuilder(formula).build();
                    double res = calc.evaluate();
                    answer = Double.toString(res);
                    result.setText(answer);
                    break;
                } else {
                    break;
                }
            case R.id.buttonOpen:
                formula = formula + "(";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonClose:
                formula = formula + ")";
                tvDisplay.setText(formula);
                break;

            //Scientific Buttons
            case R.id.buttonSin:
                formula= formula + "sin(";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonCos:
                formula= formula + "cos(";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonTan:
                formula= formula + "tan(";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonSqrt:
                formula= formula + "sqrt(";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonCub:
                formula= formula + "cbrt(";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonAbs:
                formula= formula + "abs(";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonE:
                formula= formula + "e";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonPi:
                formula= formula + "π";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonLog:
                formula= formula + "log(";
                tvDisplay.setText(formula);
                break;
            case R.id.buttonPow:
                formula= formula + "^";
                tvDisplay.setText(formula);
                break;

            default:
                break;
        }
    }
}
