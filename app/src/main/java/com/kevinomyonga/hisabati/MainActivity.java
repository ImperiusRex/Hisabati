package com.kevinomyonga.hisabati;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;

    Button buttonPlus, buttonSubtract, buttonDivide, buttonMultiply, buttonEquals;

    Button buttonAC, buttonDel;

    String displayValue = "";

    int value1, value2;

    String calcSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize variables
        display = findViewById(R.id.textViewDisplay);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonSubtract = findViewById(R.id.buttonMinus);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonEquals = findViewById(R.id.buttonEquals);

        buttonAC = findViewById(R.id.buttonAC);
        buttonDel = findViewById(R.id.buttonDel);

        calcSignButtons();
        numberButtons();
    }

    public void calcSignButtons() {
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (displayValue != "" || displayValue == null) {
                    value1 = Integer.parseInt(displayValue);
                    displayValue = "";
                    calcSign = buttonPlus.getText().toString();
                }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (displayValue != "" || displayValue == null) {
                    value1 = Integer.parseInt(displayValue);
                    displayValue = "";
                    calcSign = buttonSubtract.getText().toString();
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (displayValue != "" || displayValue == null) {
                    value1 = Integer.parseInt(displayValue);
                    displayValue = "";
                    calcSign = buttonDivide.getText().toString();
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (displayValue != "" || displayValue == null) {
                    value1 = Integer.parseInt(displayValue);
                    displayValue = "";
                    calcSign = buttonMultiply.getText().toString();
                }
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (displayValue != "" || displayValue == null) {
                    value2 = Integer.parseInt(displayValue);
                    displayValue = "";

                    int result = 0;

                    if (calcSign == buttonPlus.getText().toString()) {
                        result = addition(value1, value2);
                    } else if (calcSign == buttonSubtract.getText().toString()) {
                        result = subtraction(value1, value2);
                    } else if (calcSign == buttonDivide.getText().toString()) {
                        result = division(value1, value2);
                    } else if (calcSign == buttonMultiply.getText().toString()) {
                        result = multiplication(value1, value2);
                    }

                    displayValue = Integer.toString(result);
                    display.setText(displayValue);
                }
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayValue = "";
                display.setText("0");
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((displayValue != null || displayValue != "") && displayValue.length() > 0) {
                    displayValue = displayValue.substring(0, displayValue.length() - 1);
                    display.setText(displayValue);
                }
            }
        });
    }

    // Calc Functions
    public int addition(int value1, int value2) {
        int sum = value1 + value2;
        return sum;
    }

    public int subtraction(int value1, int value2) {
        int sum = value1 - value2;
        return sum;
    }

    public int division(int value1, int value2) {
        int sum = value1 / value2;
        return sum;
    }

    public int multiplication(int value1, int value2) {
        int sum = value1 * value2;
        return sum;
    }

    public void numberButtons() {
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String newValue = button1.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button2.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button3.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button4.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button5.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button6.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button7.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button8.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button9.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = button0.getText().toString();
                displayValue += newValue;
                display.setText(displayValue);
            }
        });
    }
}
