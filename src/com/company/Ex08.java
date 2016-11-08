package com.company;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created by 25374183P on 08/11/2016.
 */
public class Ex08 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduze un carácter: ");
            char char1 = (char)System.in.read();

        if(Character.isUpperCase(char1))
            System.out.println("Es una letra mayúscula");
        else
            System.out.println("No es una letra mayúscula");
    }
}
