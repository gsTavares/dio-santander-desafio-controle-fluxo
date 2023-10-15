package br.com.controlefluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = entrada.nextInt();
            System.out.print("\nDigite o segundo parâmetro: ");
            int parametroDois = entrada.nextInt();

            System.out.println("Parametro 1: " + parametroUm);
            System.out.println("Parametro 2: " + parametroDois);
        } catch (InputMismatchException e) {
            System.out.println("Um ou mais parâmetros foram digitados incorretamente. Tente novamente!");
        } finally {
            entrada.close();
        }

    }

}
