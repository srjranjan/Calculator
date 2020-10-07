package com.srj.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static java.text.MessageFormat.format;

public class MainActivity extends AppCompatActivity {
    TextView txt_00, txt_0, txt_1, txt_2, txt_3, txt_4, txt_5, txt_6, txt_7, txt_8, txt_9, txt_point, txt_add,
            txt_subtract, txt_multiply, txt_divide, txt_square, txt_percent, txt_clear, txt_num1, txt_num2, txt_operator, txt_equal;
    Boolean value = false;
    //String input1;
    String operator;
    float number1, number2, sum;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        txt_0.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}0", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {
                    txt_num2.setText(format("{0}0", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_00.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}00", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}00", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}1", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}1", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_2.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}2", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}2", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}3", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}3", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}4", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}4", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_5.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}5", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(txt_num2.getText() + "5");
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_6.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}6", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}6", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_7.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}7", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}7", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}8", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}8", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_9.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!value) {
                    txt_num1.setText(format("{0}9", txt_num1.getText()));
                    number1 = Float.parseFloat(txt_num1.getText().toString());
                } else {

                    txt_num2.setText(format("{0}9", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_point.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!value) {
                    if (txt_num1.getText() == null) {
                        txt_num1.setText("0.");
                    } else {
                        txt_num1.setText(format("{0}.", txt_num1.getText()));
                        number1 = Float.parseFloat(txt_num1.getText().toString());
                    }
                } else {

                    txt_num2.setText(format("{0}.", txt_num2.getText()));
                    number2 = Float.parseFloat(txt_num2.getText().toString());
                }
            }
        });
        txt_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = true;
                txt_operator.setText("+");
                operator = "+";

            }
        });
        txt_subtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value = true;
                txt_operator.setText("-");
                operator = "-";
            }
        });
        txt_multiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                operator = "*";
                value = true;
                txt_operator.setText("*");
            }
        });
        txt_divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                operator = "/";
                value = true;
                txt_operator.setText("/");
            }
        });
        txt_percent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                operator = "%";
                value = true;
                txt_operator.setText("%");
            }
        });
        txt_square.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                operator = "^";
                value = true;
                txt_operator.setText("^");
            }
        });
        txt_clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                clearInput();
            }
        });
        txt_equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                operation(number1, number2, operator);


            }
        });


    }

    @SuppressLint("SetTextI18n")
    private void operation(float number1, float number2, String operator) {
        if (Float.toString(number2) == null) {
            txt_num2.setText("enter second number");
        }
        switch (operator) {
            case "+": {
                sum = number1 + number2;
                clearInput();
                txt_num2.setText(Float.toString(sum));
                break;
            }
            case "-": {
                sum = number1 - number2;
                clearInput();
                txt_num2.setText(Float.toString(sum));
                break;
            }
            case "*": {
                sum = number1 * number2;
                clearInput();
                txt_num2.setText(Float.toString(sum));
                break;
            }
            case "/": {
                sum = number1 / number2;
                clearInput();
                txt_num2.setText(Float.toString(sum));
                break;
            }
            case "%": {
                sum = (number1 * number2) / 100;
                clearInput();
                txt_num2.setText(Float.toString(sum));
                break;
            }
            case "^": {
                sum = (number1 * number1);
                clearInput();
                txt_num2.setText(Float.toString(sum));
                break;
            }
            default:
                txt_num2.setText("wrong expression");
                break;
        }
    }


    private void clearInput() {
        txt_num1.setText("");
        txt_num2.setText("");
        txt_operator.setText("");
        value = false;
    }

    private void initialize() {
        txt_0 = findViewById(R.id.txt_0);
        txt_00 = findViewById(R.id.txt_00);
        txt_1 = findViewById(R.id.txt_1);
        txt_2 = findViewById(R.id.txt_2);
        txt_3 = findViewById(R.id.txt_3);
        txt_4 = findViewById(R.id.txt_4);
        txt_5 = findViewById(R.id.txt_5);
        txt_6 = findViewById(R.id.txt_6);
        txt_7 = findViewById(R.id.txt_7);
        txt_8 = findViewById(R.id.txt_8);
        txt_9 = findViewById(R.id.txt_9);
        txt_point = findViewById(R.id.txt_point);
        txt_equal = findViewById(R.id.txt_equal);
        txt_add = findViewById(R.id.txt_add);
        txt_subtract = findViewById(R.id.txt_subtract);
        txt_multiply = findViewById(R.id.txt_multiply);
        txt_divide = findViewById(R.id.txt_divide);
        txt_square = findViewById(R.id.txt_square);
        txt_clear = findViewById(R.id.txt_clear);
        txt_percent = findViewById(R.id.txt_percent);
        txt_num1 = findViewById(R.id.txt_num1);
        txt_num2 = findViewById(R.id.txt_num2);
        txt_operator = findViewById(R.id.txt_operator);
    }
}