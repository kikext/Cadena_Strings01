package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 08/11/2016.
 */
public class Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame una frase: ");
            String frase1 = scanner.nextLine();
        System.out.println("Dame otra: ");
            String frase2 = scanner.nextLine();

        System.out.println(frase1+" "+frase2);


    }
}
