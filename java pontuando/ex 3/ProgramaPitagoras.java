package com.mycompany.pitagoras;

import java.util.Scanner;

public class ProgramaPitagoras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculadoraPitagoras calculadora = new CalculadoraPitagoras();

        System.out.print("Digite o cateto A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o cateto B: ");
        double b = sc.nextDouble();

        double hipotenusa = calculadora.calcularHipotenusa(a, b);

        System.out.println("A hipotenusa é: " + hipotenusa);
    }
}
