package com.example.calcul_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;//Добавил текст
private CalculatorMode calculatorMode;//приязавл класс к активити
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//id кнопок калькулятора. сначала цифры
        int numberID[] = new int[]{
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.forr,
                R.id.five,
                R.id.six,
                R.id.saven,
                R.id.eight,
                R.id.nine
        };
        //id кнопок с действиями
        int numberActions [] = new int[]{
                R.id.plus,
                R.id.minus,
                R.id.exactly,
                R.id.multip,
                R.id.devision

        };

        textView= findViewById(R.id.Text);//инитиализирова текствью

calculatorMode =  new CalculatorMode();
//Нажатие на кнопки с цифрами
        View.OnClickListener numberButtonClickLustener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorMode.onReactionNum(view.getId());
                textView.setText(calculatorMode.getText());
            }
        };
//нажатие на кнопки с действиями
        View.OnClickListener actionsButtonClickLustener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorMode.onDevision(view.getId());
                textView.setText(calculatorMode.getText());
            }
        };

for (int i = 0; i < numberID.length;i++){
    findViewById(numberID[i]).setOnClickListener(numberButtonClickLustener);
}

        for (int i = 0; i < numberActions.length;i++){
            findViewById(numberActions[i]).setOnClickListener(actionsButtonClickLustener);
        }
    }
}