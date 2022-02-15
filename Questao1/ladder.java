import java.util.Scanner;

public class ladder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vamos construir uma escada, digite o número de degraus: ");
        int ladderLenght = scanner.nextInt();

        int i, j;
        for (i=0; i<ladderLenght; i++) {
            for (j=2*(ladderLenght-i); j>=0; j--) {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
