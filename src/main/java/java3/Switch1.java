package java3;
import java.util.*;

public class Switch1 {
    public static void main(String[]args){

        int farol;
        String mensagem;
        Scanner entrada= new Scanner(System.in);
        System.out.println("entre com um número:");
        farol= entrada.nextInt();

        switch(farol){
            case 1: mensagem="farol verde! siga";
            break;
            case 2: mensagem="farol amarelo! atenção, reduza a velocidade!";
            break;
            case 3: mensagem="farol vermelho! pare!";
            break;
            default: mensagem="número invalido";
        }

        System.out.println(mensagem);
    }
}
