package Atividade2;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float Fahrenheit;
        float Celsius;
        int Escolha;

        System.out.println("---------------MENU----------------\n");
        System.out.println("Conversor de Temperatura\n");
        System.out.println("Escolha a direção da Conversão\n");
        System.out.println("1. Celsius para Fahrenheit\n");
        System.out.println("2. Fahrenheit para Celsius:\n");
        System.out.print("DIGITE A OPÇÃO 1 OU 2: ");

        Escolha = input.nextInt();

        clearConsole(); // System("cls") do java

        switch (Escolha) {
            case 1:
                System.out.print("\nDigite a temperatura em Celsius: ");
                Celsius = input.nextFloat();
                Fahrenheit = (Celsius * 9 / 5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + Fahrenheit);
                break;

            case 2:
                System.out.print("\nDigite a temperatura em Fahrenheit: ");
                Fahrenheit = input.nextFloat();
                Celsius = (Fahrenheit - 32) * 5 / 9;
                System.out.println("Temperatura em Celsius: " + Celsius);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        input.close(); 
    }

    public static void clearConsole() { // System("cls") do java
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            
        }
    }
}
