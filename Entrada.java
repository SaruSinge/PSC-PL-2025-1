import java.util.Scanner;


public class Entrada{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System .out.println("Digite seu nome:");
    String nome = scanner.nextLine();

    System .out.println("Digite a sua idade:");
    String idade = scanner.nextLine();

    System .out.println("Olá " + nome + ". Você tem " + idade + " anos. Seja bem vindo/a!");

    }
}