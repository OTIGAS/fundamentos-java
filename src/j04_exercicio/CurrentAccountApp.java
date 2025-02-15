package j04_exercicio;

import java.util.Scanner;

public class CurrentAccountApp {

    static final int WITHDRAW_VALUE = 1;
    static final int TRANSFER_VALUE = 2;
    static final int CANCEL_ACCOUNT = 3;
    static final int CLOSE_SYSTEM = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrentAccount account = new CurrentAccount("Tiago Faria Gouvêa", "2000-09-23", 12345, 1, 10.00);

        int action = 0;

        while (action != CLOSE_SYSTEM) {
            System.out.println("Escolha uma Ação:");
            System.out.println("1 - Sacar Valor");
            System.out.println("2 - Transferir Valor");
            System.out.println("3 - Cancelar Conta");
            System.out.println("4 - Sair");

            action = scanner.nextInt();

            switch (action) {
                case WITHDRAW_VALUE:
                    System.out.print("Digite o valor do saque: R$");
                    double withdraw = scanner.nextDouble();
                    account.withdrawValue(withdraw);
                    break;
                case TRANSFER_VALUE:
                    System.out.print("Digite o valor da transferência: R$");
                    double transfer = scanner.nextDouble();
                    account.transferValue(transfer);
                    break;
                case CANCEL_ACCOUNT:
                    System.out.print("Informe o motivo do cancelamento: ");
                    scanner.nextLine();
                    String reason = scanner.nextLine();
                    account.cancelAccount(reason);
                    break;
                case CLOSE_SYSTEM:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
