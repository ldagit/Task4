package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число х: ");
        double x = in.nextDouble();
        System.out.print("Введите число y: ");
        double y = in.nextDouble();
        System.out.print("Введите число z: ");
        double z = in.nextDouble();
        double Sred = (x+y+z)/3;
        System.out.printf("Среднее арифметическое чисел x, y, z: %.2f \n", Sred);

        int Polovina = (int)Sred/2;
        //System.out.println(Polovina);

        if(Polovina > 3) System.out.println("Программа выполнена корректно.");






    }
}
