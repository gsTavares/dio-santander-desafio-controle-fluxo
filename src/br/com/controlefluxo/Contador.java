package br.com.controlefluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.controlefluxo.util.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = entrada.nextInt();
            System.out.print("\nDigite o segundo parâmetro: ");
            int parametroDois = entrada.nextInt();
            contar(parametroUm, parametroDois);
        } catch (InputMismatchException e) {
            System.out.println("Um ou mais parâmetros foram digitados incorretamente. Tente novamente!");
        } finally {
            entrada.close();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser menor que o primeiro");
        }
        int limiteContagem = parametroDois - parametroUm;
        for(int i = 0; i < limiteContagem; i++) {
            System.out.println(String.format("Imprimindo o número %d", (i+1)));
        }
    }

}
