package com.epam.khalii.Task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Anhelina_Khalii on 15.04.2015.
 */
public class ConsoleInput {

    public static void sayHello(){
        System.out.println("Please, tap your name");
        String name = new String();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()){
            name = sc.nextLine();
        }
        System.out.println("Hello, "+name+"!");
    }

    public static void reverseArgs(){
        System.out.println("Please, tap arguments in row");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String[] strings = sc.nextLine().split("\\s+");
            for(int i=strings.length-1;i>=0;i--){
                System.out.print(strings[i]+" ");
            }
            System.out.println();
        }
    }

    public static void printNumsInRow(int n){
        Random r = new Random();
        for(int i=0;i<n;i++){
            System.out.print(r.nextInt(100) + " ");
        }
        System.out.println();
    }

    public static void printNumsInCol(int n){
        Random r = new Random();
        for(int i=0;i<n;i++){
            System.out.println(r.nextInt(100));
        }
    }

    public static void validatePassword(){
        System.out.println("Please, tap password");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String pass = sc.nextLine();
            if(pass.equals("PASSword"))
                System.out.println("Password is correct");
            else
                System.out.println("Password is incorrect");
        }
    }

    public static void printSum(){
        System.out.println("Please, tap arguments in row");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String[] strings = sc.nextLine().split("\\s+");
            int sum=0;
            for(int i=0;i<strings.length;i++){
                try {
                    sum += Integer.parseInt(strings[i]);
                } catch (NumberFormatException ex) {
                    System.out
                            .println("Please type a numbers!");
                    return;
                }
            }
            System.out.println("Sum of arguments is " + sum);
        }
    }

    public static void printMul(){
        System.out.println("Please, tap arguments in row");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String[] strings = sc.nextLine().split("\\s+");
            int mul=1;
            for(int i=0;i<strings.length;i++){
                try {
                    mul *= Integer.parseInt(strings[i]);
                } catch (NumberFormatException ex){
                    System.out
                            .println("Please type a numbers!");
                    return;
                }
            }
            System.out.println("Multiply of arguments is "+mul);
        }
    }

    public static void entryPoint() {
        sayHello();
        reverseArgs();
        printNumsInRow(10);
        printNumsInCol(10);
        validatePassword();
        printSum();
        printMul();
    }
}
