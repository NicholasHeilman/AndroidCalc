package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView displayScreen = findViewById(R.id.display);
        final Button btn0 = findViewById(R.id.btn0);
        final Button btn1 = findViewById(R.id.btn1);
        final Button btn2 = findViewById(R.id.btn2);
        final Button btn3 = findViewById(R.id.btn3);
        final Button btn4 = findViewById(R.id.btn4);
        final Button btn5 = findViewById(R.id.btn5);
        final Button btn6 = findViewById(R.id.btn6);
        final Button btn7 = findViewById(R.id.btn7);
        final Button btn8 = findViewById(R.id.btn8);
        final Button btn9 = findViewById(R.id.btn9);
        final Button btnDivide = findViewById(R.id.btnDivide);
        final Button btnEqual = findViewById(R.id.btnEqual);
        final Button btnDot = findViewById(R.id.btnDot);
        final Button btnPlus = findViewById(R.id.btnPlus);
        final Button btnMinus = findViewById(R.id.btnMinus);
        final Button btnMultiply = findViewById(R.id.btnMultiply);

        final View.OnClickListener calcListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){
                    case R.id.btn0:

                        break;
                    case R.id.btn1:

                        break;
                    case R.id.btn2:

                        break;
                    case R.id.btn3:

                        break;
                    case R.id.btn4:

                        break;
                    case R.id.btn5:

                        break;
                    case R.id.btn6:

                        break;
                    case R.id.btn7:

                        break;
                    case R.id.btn8:

                        break;
                    case R.id.btn9:

                        break;
                    case R.id.btnPlus:

                        break;
                    case R.id.btnMinus:

                        break;
                    case R.id.btnMultiply:

                        break;
                    case R.id.btnDivide:

                        break;
                    case R.id.btnDot:

                        break;
                    case R.id.btnEqual:

                        break;
                }
            }
        };
        btn0.setOnClickListener(calcListner);
        btn1.setOnClickListener(calcListner);
        btn2.setOnClickListener(calcListner);
        btn3.setOnClickListener(calcListner);
        btn4.setOnClickListener(calcListner);
        btn5.setOnClickListener(calcListner);
        btn6.setOnClickListener(calcListner);
        btn7.setOnClickListener(calcListner);
        btn8.setOnClickListener(calcListner);
        btn9.setOnClickListener(calcListner);
        btnPlus.setOnClickListener(calcListner);
        btnMinus.setOnClickListener(calcListner);
        btnMultiply.setOnClickListener(calcListner);
        btnDivide.setOnClickListener(calcListner);
        btnDot.setOnClickListener(calcListner);
        btnEqual.setOnClickListener(calcListner);


    }
}
