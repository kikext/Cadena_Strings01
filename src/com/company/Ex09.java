package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 25374183P on 08/11/2016.
 */
public class Ex09 {
    public static void main(String[] args)throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera letra: ");
            char char1 = (char)System.in.read();

        System.in.read();

        System.out.println("Introduce la segunda letra: ");
            char char2 = (char)System.in.read();

        if(char1 == char2)
            System.out.println("Ambas son iguales");
        else
            System.out.println("UNLUCKY! No son iguales");
    }
}

