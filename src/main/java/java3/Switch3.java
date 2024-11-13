package java3;
import java.util.Scanner;

public class Switch3 {
    public static void main(String[]args){

        int lanche;
        String mensagem;
        Scanner entrada= new Scanner(System.in);
        System.out.println("entre com um número:");
        lanche= entrada.nextInt();

        switch(lanche){
            case 1: mensagem="Combo 1: Hambúrguer + Batata frita + Refrigerante";
                break;
            case 2: mensagem="Combo 2: Cachorro-quente + Maionese + Suco de Laranja";
                break;
            case 3: mensagem="Combo 3: Pizza de Calabresa + Refrigerante";
                break;
            case 4: mensagem="Combo 4: Sanduíche Natural + Suco de Abacaxi";
                break;
            case 5: mensagem="Combo 5: Salada de Frutas + Água de Coco";
                break;
            case 6: mensagem="Combo 6: X-Burguer + Milkshake de Chocolate";
                break;
            case 7: mensagem="Combo 7: Wrap de Frango + Suco de Morango";
                break;
            default: mensagem="número ínvalido";

        }

        System.out.println(mensagem);
    }
}

