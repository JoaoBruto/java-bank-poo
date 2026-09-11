public class Main {
    public static void main(String[] args) {
        Cliente meuCliente = new Cliente("João", "123.456.789-00");
        Conta minhaConta = new Conta(1, 500.00, meuCliente);
        System.out.println(minhaConta.getCliente().getNome());
        System.out.println(minhaConta.getCliente().getCpf());
        System.out.println(minhaConta.depositar(100));
        
    }
}