package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 08/11/2016.
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame una Palabra");
        String frase1 = scanner.next();
        System.out.println("Dame otra");
        String frase2 = scanner.next();

        if (frase1.equals(frase2)) {
            System.out.println("son la misma");
        }else{
            System.out.println("son diferentes weon");
        }
    }
}


