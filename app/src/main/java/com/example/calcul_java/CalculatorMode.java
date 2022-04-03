package com.example.calcul_java;

public class CalculatorMode {
    private int firstArg;
    private int secondArg;
private int actionsSelect; // Переменная в которой хронятся действия пользователя
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
         if (state == State.resultinpunt){
             state = State.firstArginput;
         }


         if (inputStr.length() > 9){//Больше 10 чисел не вводить
             switch (button){
                 case R.id. zero:
                     if (inputStr.length() != 0){//Если первое число введено не 0, то 0 можно вводить
                         inputStr.append("0");
                     }
                     break;
                 case R.id. one:
                     inputStr.append("1");
                 case R.id. two:
                     inputStr.append("2");
                 case R.id. three:
                     inputStr.append("3");
                 case R.id. forr:
                     inputStr.append("4");
                 case R.id. five:
                     inputStr.append("5");
                 case R.id. six:
                     inputStr.append("6");
                 case R.id. saven:
                     inputStr.append("7");
                 case R.id. eight:
                     inputStr.append("8");
                 case R.id. nine:
                     inputStr.append("9");

             }
         }

     }
     //вывод
     public void onDevision(int devision){
         if (devision == R.id.devision && state == State.secondArginput){

         }else if (inputStr.length() > 0 && state == State.firstArginput){
             firstArg = Integer.parseInt(inputStr.toString());
             state = State.secondArginput;
         }
         switch (devision){
             case R.id.plus:
                 actionsSelect = R.id.plus;
                 break;
             case R.id.minus:
                 actionsSelect = R.id.minus;
                 break;
             case R.id.multip:
                 actionsSelect = R.id.multip;
                 break;
             case R.id.exactly:
                 actionsSelect = R.id.exactly;
                 break;
             case R.id.devision:
                 actionsSelect = R.id.devision;
                 break;
         }

     }
//Вывод текста
     public String getText(){
         return inputStr.toString();
     }
}
