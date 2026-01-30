package Aulas;
import java.util.Scanner;

public class Scanerss {

    static void main() {
        Scanner scan = new Scanner(System.in);


        IO.print("Qual o nome do Ninja: ");
        String nomeN = scan.nextLine();
        IO.print("Escreva a idade do seu Ninja: ");
        int idadeNinja = scan.nextInt();
        IO.println( );

        IO.println("O nome do Ninja é: " + nomeN);
        IO.println("A idade do Ninja é: " + idadeNinja);
        IO.println( );

        if (idadeNinja >= 18) {
            IO.println("O ninja ésta autorizado para a missão fora da vila !");
        } else {
            IO.println("O ninja não está autorizado ir a missoes fora da vila !");
        }




        // Fechar sempre o Scaner
        scan.close();
    }
}
