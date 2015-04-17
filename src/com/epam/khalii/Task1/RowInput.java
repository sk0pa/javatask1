package com.epam.khalii.Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anhelina_Khalii on 15.04.2015.
 */
public class RowInput {

    public static void printOdd(ArrayList<Integer> args){
        System.out.print("All odd number in row: ");
        for(int iterator : args) {
            if(iterator%2==1)
                System.out.print(iterator+" ");
        }
        System.out.println();
    }

    public static void printEven(ArrayList<Integer> args){
        System.out.print("All even number in row: ");
        for(int iterator : args) {
            if(iterator%2==0)
                System.out.print(iterator+" ");
        }
        System.out.println();
    }

    public static void printMax(ArrayList<Integer> args){
        int max = Integer.MIN_VALUE;
        for(int iterator : args) {
            if(iterator>max)
                max=iterator;
        }
        System.out.println("Maximal element is "+max);
    }

    public static void printMin(ArrayList<Integer> args){
        int min = Integer.MAX_VALUE;
        for(int iterator : args) {
            if(iterator<min)
                min=iterator;
        }
        System.out.println("Minimal element is "+min);
    }

    public static void printThreeOrNine(ArrayList<Integer> args){
        System.out.print("All number that divide by 3 or by 9: ");
        for(int iterator : args) {
            if((iterator%3==0)||(iterator%9==0))
                System.out.print(iterator+" ");
        }
        System.out.println();
    }

    public static void printFiveAndSeven(ArrayList<Integer> args){
        System.out.print("All number that divide by 5 and by 7: ");
        for(int iterator : args) {
            if((iterator%5==0)&&(iterator%7==0))
                System.out.print(iterator+" ");
        }
        System.out.println();
    }

    public static void printThreeDigit(ArrayList<Integer> args){
        System.out.print("All three-digit number that don't have repeatable digits: ");
        for(int iterator : args) {
            if((iterator/100>0)&&(iterator/100<10)){ //number is three-digit
                int first = iterator%10;
                int second = (iterator%100)/10;
                int third = iterator/100;
                if((first!=second)&&(first!=third)&&(second!=third))
                    System.out.print(iterator+" ");
            }
        }
        System.out.println();
    }

    public static void printLucky(ArrayList<Integer> args) {
        System.out.print("All lucky numbers: ");
        for (int iterator : args) {
            int pow = 0;
            String siterator = Integer.toString(iterator);

            if (siterator.length() % 2 == 0) {
                pow = siterator.length() / 2;
                int fsum=0,lsum=0;
                for (int i = 0; i < pow; i++) {
                    fsum += Character.getNumericValue(siterator.charAt(i));
                    lsum += Character.getNumericValue(siterator.charAt(pow + i));
                }
                if(lsum==fsum)
                    System.out.print(iterator + " ");
            }
        }
        System.out.println();

    }

    public static void printHalfSum(ArrayList<Integer> args){
        System.out.print("All number that is a half-sum of right and left element: ");
        for(int iterator : args) {
            int index = args.indexOf(iterator);
            if((args.size()>index+1)&&(index>0)){
                if((args.get(index-1)+args.get(index+1))/2==iterator)
                    System.out.print(iterator+" ");
            }
        }
        System.out.println();
    }

    public static void entryPoint() {
        System.out.println("Please, tap some number of integers in row. ");
        Scanner sc = new Scanner(System.in);
        try{
        if (sc.hasNext()) {
            String[] nums = sc.nextLine().split("\\s+");
            ArrayList<Integer> argum = new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++) {
                argum.add(Integer.parseInt(nums[i]));
            }
            printOdd(argum);
            printEven(argum);
            printMax(argum);
            printMin(argum);
            printThreeOrNine(argum);
            printFiveAndSeven(argum);
            printThreeDigit(argum);
            printLucky(argum);
            printHalfSum(argum);
        }
    } catch (NumberFormatException ex){
            System.out.println("You tap wrong arguments!");
            return;
        }
    }
}
