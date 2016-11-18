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

            switch (select) {
                case 1:
                    String nombrecomp = nombre + " " + apellido;
                    System.out.println(nombrecomp);
                    break;
                case 2:
                    int adojov = año - 2016;
                    if (adojov >= 18) {
                        System.out.println("tiene " + adojov + " por lo tanto es adulto :)");
                    } else if (adojov <= 17) {
                        System.out.println("tiene " + adojov + " por lo tanto es menor :s");
                    }
                    break;
                case 3:
                    if (notamed >= 0 && notamed <= 4.4) {
                        System.out.println("INSUFICIENTE >:(");

                    } else if (notamed >= 4.5 && notamed <= 5.4) {
                        System.out.println("SUFICIENTE, SO CLOSE!!");

                    } else if (notamed >= 5.5 && notamed <= 6.4) {
                        System.out.println("BIEN ;)");

                    } else if (notamed >= 6.5 && notamed <= 8.4) {
                        System.out.println("NOTABLE :O");

                    } else if (notamed >= 8.5 && notamed <= 10) {
                        System.out.println("FUCKING EXCELLENT DUDE!!! :'D");

                    }
                    break;

                case 4:
                    System.out.println("dame las notas de 2 de tus compis");
                    System.out.println("me das la nota de...(introduce nombre)?");
                    String nameal1 = scanner.nextLine();
                    System.out.println("la nota de " + nameal1 + " es?");
                    double nota1 = scanner.nextInt();
                    System.out.println("ahora introduce el nombre de tu otro compi: ");
                    String nameal2 = scanner.nextLine();
                    System.out.println("ahora introduce su nota: ");
                    double nota2 = scanner.nextInt();

                    double nota3 = ((notamed + nota1 + nota2) / 3);
                    System.out.println("la nota media entre los 3 es de: " + nota3);


                    if (notamed > nota1 && notamed > nota2) {
                        System.out.println("TU NOTA ES LA MAS ALTA :)");
                    } else if (nota1 > notamed && nota1 > nota2) {
                        System.out.println("La nota de " + nameal1 + " es la mas alta");
                    } else if (nota3 > notamed && nota3 > nota2) {
                        System.out.println("La nota de " + nameal2 + " es la mas alta");

                    }
                    break;

                case 5:
                    System.out.println("tu nombre consta de " + nombre.length() + " caracteres");
                    System.out.println(nombre.substring(0) + " es la incial de tu nombre");
                    System.out.println(apellido.substring(0) + " es la incial de tu apellido");
                break;

                case 6:
                    System.out.println("dame el nombre de un compi: ");
                    String namecompi1 = scanner.nextLine();
                    System.out.println("dame su apellido");
                    String apellidocompi1 = scanner.nextLine();
                    System.out.println("dame el nombre de otr de tus compis: ");
                    String namecompi2 = scanner.nextLine();
                    System.out.println("dame su apellido aswell");
                    String apellidocompi2 = scanner.nextLine();

                    if(nombre.equals(namecompi1)){
                        System.out.println("tu nombre es igual a de tu compi"+namecompi1+" "+apellidocompi1);

                    }if (nombre.equals(namecompi2)){
                        System.out.println("tu nombre es igual al de tu compi"+namecompi2+" "+apellidocompi2);

                    }if (namecompi1.equals(namecompi2)){
                        System.out.println("el nombre de "+namecompi1+" "+apellidocompi1+" es igual al de "+namecompi2+" "+apellidocompi2);
                    }
                    break;


            }
        }while(opc!=7);
    }
}
