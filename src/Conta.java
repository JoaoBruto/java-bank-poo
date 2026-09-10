public class Conta {
    private int id;
    private double saldo;
    private Cliente cliente;

    public Conta(int id, double saldo, Cliente cliente) {
        this.id = id;
        this.saldo = saldo;
        this.cliente = cliente;
    }

}