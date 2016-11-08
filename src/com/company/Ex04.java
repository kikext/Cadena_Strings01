package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 08/11/2016.
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame una frase");
            String frase = scanner.nextLine();
            frase = frase.replaceAll(" ", "");

        System.out.println(frase.length());
    }
}
