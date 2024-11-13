package java3;

import java.util.Scanner;

public class Switch4 {
    public static void main(String[]args) {
        int salarioBase;
        float novoSalario;
        String mensagem;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número do código do cargo:");
        int codigoCargo = entrada.nextInt();
        switch (codigoCargo) {
            case 1: salarioBase = 1400; novoSalario = salarioBase + (salarioBase * 0.10f);
            mensagem = "1 - Programador Estagiário - Novo salário = " + novoSalario + " reais;\n\n";
            break; case 2: salarioBase = 3000; novoSalario = salarioBase + (salarioBase * 0.12f);
            mensagem = "2 - Programador Junior - Novo salário = " + novoSalario + " reais;\n\n";
            break; case 3: salarioBase = 5500; novoSalario = salarioBase + (salarioBase * 0.13f);
            mensagem = "3 - Programador Pleno - Novo salário = " + novoSalario + " reais;\n\n";
            break;
            case 4: salarioBase = 8000; novoSalario = salarioBase + (salarioBase * 0.15f);
            mensagem = "4 - Programador Senior - Novo salário = " + novoSalario + " reais;\n\n";
            break; case 5: salarioBase = 12000; novoSalario = salarioBase + (salarioBase * 0.18f);
            mensagem = "5 - Programador Master - Novo salário = " + novoSalario + " reais;\n\n";
            break;
            default: mensagem = "Número inválido"; novoSalario = 0;
            break;
        } System.out.println(mensagem); entrada.close(); } }