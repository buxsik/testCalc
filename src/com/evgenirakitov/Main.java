package com.evgenirakitov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //считываем строку с выражением
	String userEnter = reader.readLine();


	ReadUserEnter newUserEnter = new ReadUserEnter();//создаем объект класса ReadUserEnter для передачи ему введенной строки

    newUserEnter.readUserEnter(userEnter);// передаем строку

    newUserEnter.isRomanOrArabic(newUserEnter.firstNumber, newUserEnter.thoNumber);// проверяем какими цифрами осуществлен ввод
        // и преобразуем римские в арабские



    int result = Calculator.calculator(newUserEnter.operation, newUserEnter.firstIntNumber, newUserEnter.thoIntNumber); //передаем
        //цифры и операции в класс Calculator



    if (newUserEnter.flag){
       String strResult = RomanToArabic.arabicToRoman(result);// если ввод был осуществлен римскими цифрами,
       System.out.println(strResult);//  то отображаем результат в римских цифрах
    }
    else System.out.println(result);


    // write your code here


    }
}
