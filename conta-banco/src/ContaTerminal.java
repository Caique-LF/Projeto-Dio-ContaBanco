import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta!");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite a senha");
        String senha = scanner.nextLine();

        if (!senha.equals("1234")) {
            System.out.println("Senha Incorreta incorreta");
            scanner.close();
        } else {
            System.out.println("o numero da agencia é: " + agencia + " O numero da conta é: " + numeroConta);

            Double saldo = 25.00;
            Double valorSolicitado;

            System.out.println("Digite o valo de saque R$:");
            valorSolicitado = scanner.nextDouble();

            if (valorSolicitado < saldo) {
                saldo -= valorSolicitado;

                System.out.println("Saque realizado com sucesso. Saldo atual da conta: R$" + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }

        }

        scanner.close();
    }
}
