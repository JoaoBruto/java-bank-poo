import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente meuCliente = new Cliente("João", "123.456.789-00");
        Conta minhaConta = new Conta(1, 500.00, meuCliente);
        System.out.println(minhaConta.getCliente().getNome());
        System.out.println(minhaConta.getCliente().getCpf());
        System.out.print("Digite o valor do depósito");
        double valorDepositado = scanner.nextDouble();
        System.out.print(valorDepositado);

        while (true) {
            System.out.println("Escolha entre as opções: 1- Sacar \n 2- Depositar \n 3- Consultar Saldo \n 4- Sair");
            System.out.print("Digite o número da sua opção: \n");
            int opçãoEscolhida = scanner.nextInt();
            
        }


    }
}