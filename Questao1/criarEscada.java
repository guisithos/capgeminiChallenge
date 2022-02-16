/**
 * @author Guilherme Thomas
 * Desafio de Programacao Capgemini
 * Questao 01
 */
import java.util.Scanner;

public class criarEscada {

    /**
     * <b>Método usado para ler um input e criar uma
     * escada com o numero digitado.</b> <br>     *
     */

    public static void main(String[] args) {

        // Usamos a classe Scanner para ler o input do usuario
        // Armazenamos o input em "degraus" <br> */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vamos construir uma escada, digite o numero de degraus: ");
        int degraus = scanner.nextInt(); {
            while (degraus < 0) {
                System.out.print("Por favor digite um numero válido: ");
                degraus = scanner.nextInt();
            }
        }

        //"i" serao as linhas e "j" as colunas
        // Um loop cuida do asterisco e outro dos espacos <br>

        int i, j;
        for (i=0; i< degraus; i++) {
                        // P.ex: Input 2, pra criar 2 degraus precisamos
            // de um asterisco na primeira linha e
            //um espaco em branco e um asterisco na segunda linha

            for (j=2*(degraus -i); j>=0; j--) {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
