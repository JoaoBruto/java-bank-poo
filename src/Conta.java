public class Conta {
    private int id;
    private double saldo;
    private Cliente cliente;

    public Conta(int id, double saldo, Cliente cliente) {
        this.id = id;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getID(){
        return id;
    }

    public double GetSaldo(){
        return saldo;
    }

    public Cliente GetCliente(){
        return cliente;
    }

}