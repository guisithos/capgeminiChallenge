/**
 * @author Guilherme Thomas
 * Desafio de Programacao Capgemini
 * Questao 01
 */
import java.util.Scanner;

public class criarEscada {

    /**
     * <b>Método usado para ler um input e criar uma
     * escada com o numero digitado.</b> <br>
     *
     * Usamos a classe Scanner para ler o input do usuario
     * Armazenamos o input em "degraus" <br>
     *
     * "i" serao as linhas e "j" as colunas
     * Um loop cuida do asterisco e outro dos espacos <br>
     *
     * P.ex: Input 2, pra criar 2 degraus precisamos
     * de um asterisco na primeira linha e
     * um espaco em branco e um asterisco na segunda linha
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vamos constSruir uma escada, digite o numero de degraus: ");
        int degraus = scanner.nextInt();

        int i, j;
        for (i=0; i< degraus; i++) {
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
