package atividade1;


public class VerificaNumeroPrimo {

    public static int verificarNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; 
        }

        
    
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; 
            }
        }

        return 1; 
    }

    public static void main(String[] args) {
        int numero1 = 11;
        int numero2 = 15;
        int numero3 = 3;

        int resultado1 = verificarNumeroPrimo(numero1);
        int resultado2 = verificarNumeroPrimo(numero2);
        int resultado3 = verificarNumeroPrimo(numero3);

        System.out.println(numero1 + " é primo? " + resultado1);
        System.out.println(numero2 + " é primo? " + resultado2);
        System.out.println(numero3 + " é primo? " + resultado3);
    }
}