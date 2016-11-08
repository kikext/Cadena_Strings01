package com.company;

import java.util.Scanner;
/**
 * Created by 25374183P on 08/11/2016.
 */
public class Ex05 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int contadora = 0;
    int contadore = 0;


        System.out.println("Escribe uan frase y te sacare todas las 'a' y 'e'");
    String frase = scanner.nextLine();

        System.out.println(frase.replace('a', 'e'));
}
}



