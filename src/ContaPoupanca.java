public class ContaPoupanca extends Conta{
    private double taxaJuros;
    public ContaPoupanca(int id, double saldo, Cliente cliente, double taxaJuros){
        super(id, saldo, cliente);
        this.taxaJuros = taxaJuros;
    }

    public double renderJuros(){
        saldo = saldo + (saldo * taxaJuros);
        return saldo;
    }

}
