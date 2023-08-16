import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(numero, agencia, nome,saldo);
        //Imprimindo pelo metodo toString
        System.out.println(conta);

    }
}
