
public class Conta {
    private int id;
    private double saldo;
    private Cliente cliente;
    private double valorDeposito;

    public Conta(int id, double saldo, Cliente cliente) {
        this.id = id;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double depositar(double valorDeposito) {
        if(valorDeposito <= 0) {
            System.out.println("Valor inválido. Deposite um valor correto!");
            return saldo;
        }
        else {
            saldo += valorDeposito;
            System.out.println("Valor depositado com sucesso. Seu valor atual é:");
            return saldo;
        }
    }

    public double sacar(double valorSaque) {
        if(valorSaque > saldo) {
            System.out.println("Valor inválido. Maior que o saldo disponivel");
            return saldo;
        }
        else {
            this.saldo -= valorSaque;
            System.out.println("Valor sacado com sucesso! " + valorSaque);
            return saldo;
        }
    }
}