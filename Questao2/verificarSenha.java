import java.util.Scanner;

public class verificarSenha {

    public static void main(String[] args) {

        int tamanhoSenha = 6, letrasMaisculas = 0, letrasMinusculas = 0;
        int caracteresEspeciais = 0, digitos = 0;
        char ch;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        int total = senha.length();
        if (total < tamanhoSenha) {

            System.out.println("\nA senha precisa de 6 caracteres, a sua possui: " + total);
            return;
        }
        else {
            for (int i = 0; i < total; i++) {
                ch = senha.charAt(i);
                if(Character.isUpperCase(ch))
                    letrasMaisculas = 1;
                else if(Character.isLowerCase(ch))
                    letrasMinusculas = 1;
                else if(Character.isDigit(ch))
                    digitos = 1;
                else
                    caracteresEspeciais = 1;
            }
        }
        if(letrasMaisculas ==1 && letrasMinusculas ==1 && digitos ==1 && caracteresEspeciais ==1)
            System.out.println("\nSenha Forte");
        else
            System.out.println("\nSenha fraca");
    }
}
