package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio01.dto;

public class PessoaDTO implements Comparable {

    private String nome;
    private String sobrenome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Object o) {
        return this.idade - ((PessoaDTO)o).getIdade();
    }

    @Override
    public String toString() {
        return "PessoaDTO{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                "}";
    }
}
