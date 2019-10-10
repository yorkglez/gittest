package com.primos.app;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        int Number = 0;
        boolean Flag = true;
        Scanner in = new Scanner(System.in);

        Number = in.nextInt();
        if(Number != 2 && Number != 1){
            if(Number % 2 == 0){
                Flag = false;
            }
        }

        System.out.println(Flag);
    }
}
