package com.mycompany.temperatura;

import java.util.Scanner;

public class ProgramaTemperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();

        double fahrenheit;
        double kelvin;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        System.out.print("Digite a temperatura em Kelvin: ");
        kelvin = sc.nextDouble();

        double celsiusF = conversor.fahrenheitParaCelsius(fahrenheit);
        double celsiusK = conversor.kelvinParaCelsius(kelvin);

        System.out.println("Fahrenheit para Celsius: " + celsiusF);
        System.out.println("Kelvin para Celsius: " + celsiusK);
    }
}
