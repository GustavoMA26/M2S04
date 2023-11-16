package list_m02s04.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        do {
            try {
                System.out.println("Insira sua idade: ");
                idade = scanner.nextInt();
                if (idade <= 0 || idade > 100) {
                    throw new MyException("Esta idade está incorreta!");
                } else {
                    System.out.println("Olá, você tem " + idade + " anos de idade!");
                }
            } catch (MyException e) {
                System.out.println("Esta idade está incorreta! Tente novamente!");
            }
        } while (idade <= 0 || idade > 100);
    }
}
