package java3;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[]args){

        int ano;
        String mensagem;
        Scanner entrada= new Scanner(System.in);
        System.out.println("entre com um número:");
        ano= entrada.nextInt();

        switch(ano){
            case 1: mensagem="janeiro";
                break;
            case 2: mensagem="fevereiro";
                break;
            case 3: mensagem="março";
                break;
            case 4: mensagem="abril";
                break;
            case 5: mensagem="maio";
                break;
            case 6: mensagem="junho";
            break;
            case 7: mensagem="julho";
                break;
            case 8: mensagem="agosto";
                break;
            case 9: mensagem="setembro";
                break;
            case 10: mensagem="outubro";
                break;
            case 11: mensagem="novembro";
                break;
            case 12: mensagem="dezembro";
                break;
            default: mensagem="número ínvalido";

        }

        System.out.println(mensagem);
    }
}

