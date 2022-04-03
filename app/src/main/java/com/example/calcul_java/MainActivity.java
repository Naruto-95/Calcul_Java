package com.example.calcul_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

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
    }
}