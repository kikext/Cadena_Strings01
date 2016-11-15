package com.company;

import java.util.Scanner;

/**
 * Created by 25374183P on 15/11/2016.
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
//--------------pedir datos-------------------------------------
        System.out.println("Dime el nombre: ");
            String nombre = scanner.nextLine();
        System.out.println("Dime el apellido: ");
            String apellido = scanner.nextLine();
        System.out.println("dime año de nacimiento: ");
            int año = scanner.nextInt();
        System.out.println("Nota media del ciclio: ");
            double notamed = scanner.nextDouble();
//---------------------------------------------------------------
//------------------------------MENU----------------------------------------
        System.out.println("+===================***=====================+");
        System.out.println("|================**=MENÚ=**=================|");
        System.out.println("|==============**====**====**===============|");
        System.out.println("| 01-Nombre y apellido completo             |");
        System.out.println("| 02-Edad                                   |");
        System.out.println("| 03-Comprobar notas(individual)            |");
        System.out.println("| 04-Hacer media con compis                 |");
        System.out.println("| 05-Info varia del nombre completo         |");
        System.out.println("| 06-Comparar nombres                       |");
        System.out.println("| 07-SALIR                                  |");
        System.out.println("+===========================================+");
//------------------------------------------------------------------------------
        do{
            int select = scanner.nextInt();

            switch (select){
                case 1:
                    String nombrecomp = nombre+" "+apellido;
                    System.out.println(nombrecomp);
                    break;
                case 2:
                    int adojov = año-2016;
                    if(adojov>=18){
                    System.out.println("tiene "+adojov+" por lo tanto es adulto :)");
                }else if (adojov<=17){
                        System.out.println("tiene "+adojov+" por lo tanto es menor :s");
                    }
                    break;
                case 3:
                    if(notamed>=0 && notamed<=4.4){
                        System.out.println("INSUFICIENTE >:(");

                    }else if (notamed>=4.5 && notamed<=5.4){
                        System.out.println("SUFICIENTE, SO CLOSE!!");

                    }else if (notamed>=5.5 && notamed<=6.4){
                        System.out.println("BIEN ;)");

                    }else if(notamed>=6.5 && notamed<=8.4){
                        System.out.println("NOTABLE :O");

                    }else if(notamed>=8.5 && notamed<=10){
                        System.out.println("FUCKING EXCELLENT DUDE!!! :'D");

                    }
                    break;
            }

        }while(opc!=7);
    }
}
