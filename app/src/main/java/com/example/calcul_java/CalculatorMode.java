package com.example.calcul_java;

public class CalculatorMode {
    private int firstArg;
    private int secondArg;

    StringBuilder inputStr = new StringBuilder();
     private State state;
//инициализация полей
     private enum State {
         firstArginput,
         secondArginput,
         resultinpunt

     }
// конструктор
     public CalculatorMode(){
         state = State.firstArginput;
     }
//реакция на кнопку
     public void onReactionNum(int button){

     }
     //вывод
     public void onDevision(int devision){

     }
}
