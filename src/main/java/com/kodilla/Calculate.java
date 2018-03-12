package com.kodilla;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations calculate = new Operations();

        double a;
        double b;
        String operator;

        System.out.println("Wprowadź liczbe a: ");
        a = sc.nextDouble();
        System.out.println("Wprowadź liczbe b: ");
        b = sc.nextDouble();
        System.out.println("Wprowadz operator: ");
        sc.nextLine();
        operator = sc.nextLine();

        switch (operator) {
            case "plus": {
                System.out.println(calculate.add(a, b));
                break;
            }
            case "minus": {
                System.out.println(calculate.subtract(a, b));
                break;
            }
            case "multiply": {
                System.out.println(calculate.multiply(a, b));
                break;
            }
            case "divide": {
                System.out.println(calculate.multiply(a, b));
                break;

            }

        }
    }

}
