public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void exibirExtrato(){
        System.out.println("EXTRATO CONTA CORRENTE");
        super.imprimirInfosComuns();
    }

}
