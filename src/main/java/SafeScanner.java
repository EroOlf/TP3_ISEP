package main.java;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScanner {
    private Scanner scanner;

    public SafeScanner(InputStream si) {
        this.scanner = new Scanner(si);
    }

    public int getInt(){
        // Boucle infinie
       /* boolean validInput = false;
        int i = 0;
        do{
            try{
                i = scanner.nextInt();
                System.out.println("i = " + i);
                validInput = true;
                return i;
            } catch(InputMismatchException e){
                validInput = false;
            }
        } while(!validInput); */


        int i = 0;
        try{
            i = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Recommencer");
        }
        return i;
    }

    public void closeScanner(){
        scanner.close();
    }


}
