public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    public ContaCorrente(int id, double saldo, Cliente cliente, double limiteChequeEspecial) {
        super(id,saldo,cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double sacar(double valorSaque){
        if(valorSaque > saldo + limiteChequeEspecial) {
            System.out.println("Valor de saque excedido.");
            return saldo;
        }
        else {
            this.saldo -= valorSaque;
            System.out.println("Valor sacado com sucesso! " + saldo);
            return saldo;
        }
    }

}
