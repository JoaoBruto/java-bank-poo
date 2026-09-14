public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    public ContaCorrente(int id, double saldo, Cliente cliente, double limiteChequeEspecial) {
        super(id,saldo,cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

}
