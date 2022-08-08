import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public void exibir(Cliente cliente){
        nome = cliente.getNome();
        System.out.println(nome);
    }


    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
