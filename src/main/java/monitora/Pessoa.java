package monitora;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    public void andar(){
        System.out.println("estou andando");
    }//metodo

    public void andarRapido(){
        System.out.printf("%s Estou andando rapido", nome);
    }//metodo

    public String dados(){
        return "Nome: "+nome+"\nIdade: "+idade+"\nCpf: "+cpf;
    }//metodo
}
