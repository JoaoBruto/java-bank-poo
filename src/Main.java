import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente meuCliente = new Cliente("João", "123.456.789-00");
        Conta minhaConta = new Conta(1, 500.00, meuCliente);
        System.out.println(minhaConta.getCliente().getNome());
        System.out.println(minhaConta.getCliente().getCpf());
        System.out.print("Digite o valor do depósito: \n");
        double valorDepositado = scanner.nextDouble();
        System.out.print(valorDepositado);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha entre as opções: \n 1- Sacar \n 2- Depositar \n 3- Consultar Saldo \n 4- Sair");
            System.out.print("Digite o número da sua opção: \n");
            int opcaoEscolhida = scanner.nextInt();
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Você escolheu opção 1");
                    break;
                case 2:
                    System.out.println("Você escolheu opção 2");
                    break;
                case 3:
                    System.out.println("Você escolheu opção 3");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }


    }
}