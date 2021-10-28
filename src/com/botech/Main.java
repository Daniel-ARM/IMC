package com.botech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Peso: ");
        float peso = scanner.nextFloat();
        System.out.print("Altura: ");
        float altura = scanner.nextFloat();
        float imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println(imc + "= abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println(imc + "= peso normal");
        } else if (imc < 29.9) {
            System.out.println(imc + "= sobrepeso");
        } else {
            System.out.println(imc + "= obesidade");
        }
    }
}
