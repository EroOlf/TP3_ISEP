package main.java;

import main.java.errors.IllegalCat;

import java.util.Objects;

public class Appli {

    public static void main(String[] args){
        /*SafeScanner safeScanner = new SafeScanner(Objects.requireNonNull(SafeScanner.class.getResourceAsStream("demo.txt")));
        //SafeScanner safeScanner = new SafeScanner(System.in);
        System.out.println("What is your age?");
        int answer = safeScanner.getInt();
        System.out.printf("Your age is %d.%n", answer);
        safeScanner.closeScanner();*/
        SafeScanner safeScanner = new SafeScanner(System.in);
        int height = safeScanner.getInt();
        int width = safeScanner.getInt();
        cats(height,width);
    }

    private static void cats(int height, int width) throws IllegalCat{
        if(height < 5 || width < 5){
            throw new IllegalCat();
        }
        System.out.print("|\\");
        for(int i = 0; i < width; ++i){
            System.out.print("-");
        }
        System.out.print("/|\n|");
        System.out.print("O");
        for(int i = 0; i < width/2; ++i){
            System.out.print("-");
        }
        System.out.print("O |\n");
        System.out.print("\\_");
        for(int i = 0; i < width/2; ++i){
            System.out.print("^");
        }
        System.out.print("_/");

    }
}
