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


    private int actionSelected; // Переменная в которой хронятся действия пользователя
// конструктор
     public CalculatorMode(){
         state = State.firstArginput;
     }
//реакция на кнопку
     public void onReactionNum(int button){
         if (state == State.resultinpunt){
             state = State.firstArginput;
             inputStr.setLength(0);
         }


         if (inputStr.length() < 9){//Больше 10 чисел не вводить
             switch (button){
                 case R.id. zero:
                     if (inputStr.length() != 0){//Если первое число введено не 0, то 0 можно вводить
                         inputStr.append("0");
                     }
                     break;
                 case R.id. one:
                     inputStr.append("1");
                     break;
                 case R.id. two:
                     inputStr.append("2");
                     break;
                 case R.id. three:
                     inputStr.append("3");
                     break;
                 case R.id. forr:
                     inputStr.append("4");
                     break;
                 case R.id. five:
                     inputStr.append("5");
                     break;
                 case R.id. six:
                     inputStr.append("6");
                     break;
                 case R.id. saven:
                     inputStr.append("7");
                     break;
                 case R.id. eight:
                     inputStr.append("8");
                     break;
                 case R.id. nine:
                     inputStr.append("9");
                     break;

             }
         }

     }
     //вывод
     public void onDevision(int devision){
         if (devision == R.id.exactly && state == State.secondArginput ) {
             secondArg = Integer.parseInt(inputStr.toString());
             state = State.resultinpunt;
             inputStr.setLength(0);
             switch (actionSelected) {
                 case R.id.plus:
                     inputStr.append(firstArg + secondArg);
                     break;
                 case R.id.minus:
                     inputStr.append(firstArg - secondArg);
                     break;
                 case R.id.multip:
                     inputStr.append(firstArg * secondArg);
                     break;
                 case R.id.devision:
                     inputStr.append(firstArg / secondArg);
                     break;


             }
         } else if (inputStr.length() > 0 && state == State.firstArginput ){
             firstArg = Integer.parseInt(inputStr.toString());
             state = State.secondArginput;
             inputStr.setLength(0);

         switch (devision){
             case R.id.plus:
                 actionSelected = R.id.plus;
                 break;
             case R.id.minus:
                 actionSelected = R.id.minus;
                 break;
             case R.id.multip:
                 actionSelected = R.id.multip;
                 break;
             case R.id.devision:
                 actionSelected = R.id.devision;
                 break;

         }
     }
     }
     public void reset(){
         state = State.firstArginput;
         inputStr.setLength(0);

     }
//Вывод текста
     public String getText(){
         return inputStr.toString();
     }
}
