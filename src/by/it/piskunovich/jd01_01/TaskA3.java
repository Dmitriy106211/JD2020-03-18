package by.it.piskunovich.jd01_01;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

import java.util.Arrays;

class TaskA3 {
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        int k = i*i + j*j;
        String result=i+"*"+i+"+"+j+"*"+j+"="+k;
        System.out.println(result) ;


//result=result+"*";
//System.out.println(result);
//result=result+i;
//        System.out.println(result);


    }
}
