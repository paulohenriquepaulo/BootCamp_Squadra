package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio03.dto;

public class ClienteDTO {

    private String nome;
    private Integer idade;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return this.nome + " - " + "Tem " + this.idade + " anos e salario de $" + this.salario;
    }
}
