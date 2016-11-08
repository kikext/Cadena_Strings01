package com.company;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una frase y te pondre su primera letra");
            String letra = scanner.nextLine();


            System.out.println(letra.charAt(0));

    }
}
