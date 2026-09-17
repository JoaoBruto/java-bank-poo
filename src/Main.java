import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente meuCliente = new Cliente("João", "123.456.789-00");
        Conta minhaConta = new Conta(1, 500.00, meuCliente);
        System.out.println(minhaConta.getCliente().getNome());
        System.out.println(minhaConta.getCliente().getCpf());

        Conta[] contas = new Conta[2];
        ContaCorrente minhaContaCorrente = new ContaCorrente(1, 500.00, meuCliente, 1000.00);
        ContaPoupanca minhaContaPoupanca = new ContaPoupanca(1, 600.00, meuCliente, 0.05);

        for (int i = 0; i < contas.length; i++) {
            contas[i].sacar(100);
        }
        contas[0] = minhaContaCorrente;
        contas[1] = minhaContaPoupanca;

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha entre as opções: \n 1- Sacar \n 2- Depositar \n 3- Consultar Saldo \n 4- Sair");
            System.out.print("Digite o número da sua opção: \n");
            try {
                int opcaoEscolhida = scanner.nextInt();
                switch (opcaoEscolhida) {
                    case 1:
                        boolean entradaValida = false;
                        double valorSaque = 0;
                        while (!entradaValida) {
                            try {
                                System.out.print("Digite o valor do saque: \n");
                                valorSaque = scanner.nextDouble();
                                entradaValida = true; // Só chega aqui se a linha de cima não der erro
                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas números");
                                scanner.nextLine();
                            }
                        }
                        minhaConta.sacar(valorSaque);
                        break;
                    case 2:
                        boolean entradaDeposito = false;
                        double valorDeposito = 0;
                        while (!entradaDeposito) {
                            try {
                                System.out.print("Digite o valor de depósito: \n");
                                valorDeposito = scanner.nextDouble();
                                entradaDeposito = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas números");
                                scanner.nextLine();
                            }
                        }
                        minhaConta.depositar(valorDeposito);
                        break;

                    case 3:
                        System.out.println("O seu saldo atual é de R$" + minhaConta.getSaldo());
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Escolha uma opção válida!");
                }
            } catch (InputMismatchException e){
                System.out.println("Entrada inválida! Digite um número.");
                scanner.nextLine();
            }
        }


        }
    }