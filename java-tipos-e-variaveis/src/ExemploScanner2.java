import java.util.Scanner;
public class ExemploScanner2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "!");
        System.out.println("Agora, digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Seu nome é: " + nome + " " + sobrenome);

        scanner.close();

    }
}
