public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected  double emprestimo;


    protected  Cliente cliente;

    protected static final int agenciaPadrao= 1;
    protected static int sequencial = 1;

    public Conta(Cliente cliente) {

        this.agencia = agenciaPadrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Cliente %s",cliente.getNome()));
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println(String.format("Numero %d", this.numero));
        System.out.println(String.format("Saldo %.2f", this.saldo));
        System.out.println(String.format("Emprestimo contratado %.2f ",this.emprestimo));
    }

    public int getAgencia() {return agencia;}

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
}
